package indi.zxf.pro.base.first.api.manager.convert;

import indi.zxf.pro.base.first.api.model.impl.BusinessObjectImpl;
import indi.zxf.pro.base.first.api.model.impl.ViewObjectImpl;

/**
 * 数据展示模型转换器定义
 *
 * @author zhouxiaofa
 * @date 2023/1/11 12:28
 **/
public interface ViewObjectConvert<BO extends BusinessObjectImpl, VO extends ViewObjectImpl> extends Convert<BO, VO> {
}
