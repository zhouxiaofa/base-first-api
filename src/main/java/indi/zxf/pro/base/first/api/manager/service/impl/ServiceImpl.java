package indi.zxf.pro.base.first.api.manager.service.impl;


import indi.zxf.pro.base.first.api.exception.BusinessException;
import indi.zxf.pro.base.first.api.manager.mapper.Mapper;
import indi.zxf.pro.base.first.api.manager.service.Service;
import indi.zxf.pro.base.first.api.model.impl.BusinessObjectImpl;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 基础服务抽象类
 *
 * @author zhouxiaofa
 * @date 2023/1/11 21:38
 **/
public abstract class ServiceImpl<Entity extends BusinessObjectImpl> implements Service<Entity> {

    protected Mapper<Entity> dataManager;

    public ServiceImpl(Mapper<Entity> dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public Entity findById(String id) {
        return dataManager.findById(id);
    }

    @Override
    public Entity insert(Entity entity) {
        if (null == entity) {
            throw new BusinessException("The Entity is null, can not to create!");
        }
        // 设置主键ID
        if (StringUtils.isBlank(entity.getId())) {
            entity.setId(UUID.randomUUID().toString());
        }
        // 设置创建时间和更新时间
        if (null == entity.getCreateDate()) {
            entity.setCreateDate(new Date());
        }
        if (null == entity.getUpdateDate()) {
            entity.setUpdateDate(new Date());
        }
        dataManager.insert(entity);
        return dataManager.findById(entity.getId());
    }

    @Override
    public Entity update(Entity entity) {
        if (null == entity) {
            throw new BusinessException("The Entity is null, can not to update!");
        }
        // 主键ID为空,不允许更新
        if (StringUtils.isBlank(entity.getId())) {
            throw new BusinessException("The Entity does not exists, can not to update!");
        }
        Entity queryEntity = dataManager.findById(entity.getId());
        // 主键ID对应Entity不存在,不允许更新
        if (null == queryEntity) {
            throw new BusinessException("The Entity with given id: " + entity.getId() + " does not exists, can not to update!");
        }
        // 设置更新时间
        if (null == entity.getUpdateDate()) {
            entity.setUpdateDate(new Date());
        }
        // 设置版本号
        entity.setRevision(queryEntity.getRevision());
        dataManager.update(entity);
        return dataManager.findById(entity.getId());
    }

    @Override
    public void delete(String id) {
        Entity queryEntity = dataManager.findById(id);
        // 主键ID对应Entity不存在,不允许删除
        if (null == queryEntity) {
            throw new BusinessException("The Entity with given id: " + id + " does not exists, can not to delete!");
        }
        dataManager.delete(id);
    }

    @Override
    public List<Entity> findAll() {
        return dataManager.findAll();
    }
}
