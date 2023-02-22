package indi.zxf.pro.base.first.api.model.impl;

import indi.zxf.pro.base.first.api.model.DataTransferObject;

/**
 * 数据传输逻辑模型实现
 *
 * @author zhouxiaofa
 * @date 2023/1/11 12:23
 **/
public abstract class DataTransferObjectImpl implements DataTransferObject {

    /**
     * 主键ID
     */
    private String id;

    public DataTransferObjectImpl() {

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
