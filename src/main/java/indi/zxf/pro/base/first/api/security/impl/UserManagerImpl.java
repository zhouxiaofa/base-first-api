package indi.zxf.pro.base.first.api.security.impl;

import indi.zxf.pro.base.first.api.model.impl.User;
import org.springframework.stereotype.Component;

/**
 * 用户信息存储
 *
 * @author zhouxiaofa
 * @date 2023/1/19 0:06
 **/
@Component
public class UserManagerImpl implements indi.zxf.pro.base.first.api.security.UserManager {

    private static final ThreadLocal<User> holder = new ThreadLocal<>();

    public User get() {
        return holder.get();
    }

    public void set(User user) {
        holder.set(user);
    }

    public void remove() {
        holder.remove();
    }

    /**
     * 获取登录用户ID
     */
    public String getUserCode() {
        return holder.get().getCreateUserId();
    }

    /**
     * 获取登录用户姓名
     */
    public String getUserName() {
        return holder.get().getCreateUserName();
    }
}
