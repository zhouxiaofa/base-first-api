package indi.zxf.pro.base.first.api.manager.service.impl;

import indi.zxf.pro.base.first.api.manager.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author zhouxiaofa
 * @date 2023/1/18 23:12
 **/
@Service
public class RedisServiceImpl implements RedisService {

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public Object get(String key) {
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }

    @Override
    public void set(String key, Object value) {
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        // 设置默认过期时间为1hour
        vo.set(key, value, 1, TimeUnit.HOURS);
    }

    @Override
    public Boolean update(String key) {
        // 更新过期时间为10hours
        return redisTemplate.expire(key, 10, TimeUnit.HOURS);
    }

    @Override
    public Boolean delete(String key) {
        return redisTemplate.delete(key);
    }
}
