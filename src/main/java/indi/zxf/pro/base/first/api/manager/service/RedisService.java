package indi.zxf.pro.base.first.api.manager.service;

/**
 * redis服务定义
 *
 * @author zhouxiaofa
 * @date 2023/1/18 23:08
 **/
public interface RedisService {

    /**
     * 查询缓存
     *
     * @param       key-->key
     * @return      value
     */
    Object get(String key);

    /**
     * 缓存
     *
     * @param       key-->key
     * @param       value-->value
     */
    void set(String key, Object value);

    /**
     * 更新缓存
     *
     * @param       key-->key
     * @return      是否更新成功
     */
    Boolean update(String key);

    /**
     * 删除缓存
     *
     * @param       key-->key
     * @return      是否删除成功
     */
    Boolean delete(String key);
}
