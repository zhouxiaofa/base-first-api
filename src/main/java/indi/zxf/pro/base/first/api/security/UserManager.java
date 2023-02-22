package indi.zxf.pro.base.first.api.security;

import indi.zxf.pro.base.first.api.model.impl.User;

/**
 * @author zhouxiaofa
 * @date 2023/1/19 15:53
 **/
public interface UserManager {

    /**
     * 获取登录用户
     *
     * @return      登录用户
     */
    User get();

    /**
     * 设置登录用户
     *
     * @param       user-->登录用户
     */
    void set(User user);

    /**
     *  移除登录用户
     */
    void remove();

    /**
     * 获取登录用户ID
     *
     * @return      登录用户ID
     */
    String getUserCode();

    /**
     * 获取登录用户姓名
     *
     * @return      登录用户姓名
     */
    String getUserName();
}
