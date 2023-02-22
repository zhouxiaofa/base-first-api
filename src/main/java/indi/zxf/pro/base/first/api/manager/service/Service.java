package indi.zxf.pro.base.first.api.manager.service;

import indi.zxf.pro.base.first.api.model.impl.BusinessObjectImpl;

import java.util.List;

/**
 * 基础服务定义
 *
 * @author zhouxiaofa
 * @date 2023/1/11 21:37
 **/
public interface Service<Entity extends BusinessObjectImpl> {

    /**
     * 根据主键ID查询数据
     *
     * @param       id-->数据主键ID
     * @return      查询到的数据
     */
    Entity findById(String id);

    /**
     * 创建数据
     *
     * @param       entity-->待创建数据
     * @return      创建后的数据
     */
    Entity insert(Entity entity);

    /**
     * 更新数据
     *
     * @param       entity-->待更新数据
     * @return      更新后的数据
     */
    Entity update(Entity entity);

    /**
     * 根据主键ID删除数据
     *
     * @param       id-->数据主键ID
     */
    void delete(String id);

    /**
     * 查询数据列表
     *
     * @return      查询到的数据列表
     */
    List<Entity> findAll();
}
