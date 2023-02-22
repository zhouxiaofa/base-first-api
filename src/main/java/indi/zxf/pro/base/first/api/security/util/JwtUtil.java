package indi.zxf.pro.base.first.api.security.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

/**
 * JWT工具
 *
 * @author zhouxiaofa
 * @date 2023/1/19 15:41
 **/
public class JwtUtil {

    public static final Long JWT_TIME = 3600000L;
    public static final String JWT_KEY = "dean";

    public static String create(String id, String subject, Long time) {
        JwtBuilder builder = getJwtBuilder(id, subject, time);
        return builder.compact();
    }

    public static String create(String id, String subject, Long time, Map<String, Object> claims) {
        JwtBuilder builder = getJwtBuilder(id, subject, time);
        builder = builder.addClaims(claims);
        return builder.compact();
    }

    public static SecretKey generalSecretKey() {
        byte[] key = Base64.getDecoder().decode(JWT_KEY);
        SecretKey secretKey = new SecretKeySpec(key, 0, key.length, "AES");
        return secretKey;
    }

    public static Claims parse(String jwt) {
        SecretKey secretKey = generalSecretKey();
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(jwt)
                .getBody();
    }

    private static JwtBuilder getJwtBuilder(String id, String subject, Long time) {
        if (null == time) {
            time = JWT_TIME;
        }
        Long nowTime = System.currentTimeMillis();
        Date nowDate = new Date(nowTime);
        // 失效时间
        long expTime = nowTime + time;
        Date expDate = new Date(expTime);
        // 二次加密
        SecretKey secretKey = generalSecretKey();
        return Jwts.builder()
                .setId(id)
                .setSubject(subject)
                .setIssuer(JWT_KEY)
                .setIssuedAt(nowDate)
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .setExpiration(expDate);
    }
}
