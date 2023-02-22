package indi.zxf.pro.base.first.api.manager.convert.impl;

import indi.zxf.pro.base.first.api.manager.convert.DataTransferObjectConvert;
import indi.zxf.pro.base.first.api.model.impl.BusinessObjectImpl;
import indi.zxf.pro.base.first.api.model.impl.DataTransferObjectImpl;

/**
 * 数据传输模型转换器实现
 *
 * @author zhouxiaofa
 * @date 2023/1/11 13:29
 **/
public abstract class DataTransferObjectConvertImpl<DTO extends DataTransferObjectImpl, BO extends BusinessObjectImpl> extends ConvertImpl<DTO, BO> implements DataTransferObjectConvert<DTO, BO> {

    public DataTransferObjectConvertImpl() {

    }
}
