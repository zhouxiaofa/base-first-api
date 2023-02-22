package indi.zxf.pro.base.first.api.manager.mapper;

import indi.zxf.pro.base.first.api.model.impl.BusinessObjectImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据访问类
 *
 * @author zhouxiaofa
 * @date 2023/1/11 17:25
 **/
@Repository
public interface Mapper<Entity extends BusinessObjectImpl> {

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
     */
    void insert(Entity entity);

    /**
     * 更新数据
     *
     * @param       entity-->待更新数据
     */
    void update(Entity entity);

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
