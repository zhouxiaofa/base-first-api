package indi.zxf.pro.base.first.api.model;

import java.util.Date;

/**
 * 数据逻辑模型定义
 *
 * @author zhouxiaofa
 * @date 2023/1/11 12:17
 **/
public interface BaseObject {

    /**
     * 获取创建人ID
     *
     * @return      创建人ID
     */
    String getCreateUserId();

    /**
     * 设置创建人ID
     *
     * @param       createUserId-->创建人ID
     */
    void setCreateUserId(String createUserId);

    /**
     * 获取更新人ID
     *
     * @return      更新人ID
     */
    String getUpdateUserId();

    /**
     * 设置创建人ID
     *
     * @param       updateUserId-->创建人ID
     */
    void setUpdateUserId(String updateUserId);

    /**
     * 获取创建人姓名
     *
     * @return      创建人姓名
     */
    String getCreateUserName();

    /**
     * 设置创建人姓名
     *
     * @param       createUserName-->创建人姓名
     */
    void setCreateUserName(String createUserName);

    /**
     * 获取更新人姓名
     *
     * @return      更新人姓名
     */
    String getUpdateUserName();

    /**
     * 设置更新人姓名
     *
     * @param       updateUserName-->更新人姓名
     */
    void setUpdateUserName(String updateUserName);

    /**
     * 获取创建时间
     *
     * @return      创建时间
     */
    Date getCreateDate();

    /**
     * 设置创建时间
     *
     * @param       createDate-->创建时间
     */
    void setCreateDate(Date createDate);

    /**
     * 获取更新时间
     *
     * @return      更新时间
     */
    Date getUpdateDate();

    /**
     * 设置更新时间
     *
     * @param       updateDate-->更新时间
     */
    void setUpdateDate(Date updateDate);
}
