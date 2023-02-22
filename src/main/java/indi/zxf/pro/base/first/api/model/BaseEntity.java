package indi.zxf.pro.base.first.api.model;

/**
 * 基本逻辑模型接口定义
 *
 * @author zhouxiaofa
 * @date 2023/1/11 12:16
 **/
public interface BaseEntity {

    /**
     * 获取实体ID
     *
     * @return      实体ID
     */
    String getId();

    /**
     * 设置实体ID
     *
     * @param       id-->实体ID
     */
    void setId(String id);
}
