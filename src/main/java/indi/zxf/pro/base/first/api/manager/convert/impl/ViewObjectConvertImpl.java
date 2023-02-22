package indi.zxf.pro.base.first.api.manager.convert.impl;

import indi.zxf.pro.base.first.api.manager.convert.ViewObjectConvert;
import indi.zxf.pro.base.first.api.model.impl.BusinessObjectImpl;
import indi.zxf.pro.base.first.api.model.impl.ViewObjectImpl;

/**
 * 数据展示模型转换器实现
 *
 * @author zhouxiaofa
 * @date 2023/1/11 13:33
 **/
public abstract class ViewObjectConvertImpl<BO extends BusinessObjectImpl, VO extends ViewObjectImpl> extends ConvertImpl<BO, VO> implements ViewObjectConvert<BO, VO> {

    public ViewObjectConvertImpl() {
        
    }
}
