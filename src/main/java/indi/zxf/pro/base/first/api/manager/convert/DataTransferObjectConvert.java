package indi.zxf.pro.base.first.api.manager.convert;

import indi.zxf.pro.base.first.api.model.impl.BusinessObjectImpl;
import indi.zxf.pro.base.first.api.model.impl.DataTransferObjectImpl;

/**
 * 数据传输模型转换器定义
 *
 * @author zhouxiaofa
 * @date 2023/1/11 12:27
 **/
public interface DataTransferObjectConvert<DTO extends DataTransferObjectImpl, BO extends BusinessObjectImpl> extends Convert<DTO, BO> {
}
