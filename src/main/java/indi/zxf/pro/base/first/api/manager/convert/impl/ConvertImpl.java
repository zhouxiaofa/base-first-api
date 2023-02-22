package indi.zxf.pro.base.first.api.manager.convert.impl;

import indi.zxf.pro.base.first.api.manager.convert.Convert;

import java.util.ArrayList;
import java.util.List;

/**
 * 模型转换器抽象实现类
 *
 * @author zhouxiaofa
 * @date 2023/1/11 12:29
 **/
public abstract class ConvertImpl<Source, Target> implements Convert<Source, Target> {

    public ConvertImpl() {

    }

    @Override
    public List<Target> transfer(List<Source> sourceList) {
        if (null == sourceList) {
            return null;
        }
        List<Target> targetList = new ArrayList<>();
        for (Source source : sourceList) {
            Target target = this.transfer(source);
            targetList.add(target);
        }
        return targetList;
    }
}
