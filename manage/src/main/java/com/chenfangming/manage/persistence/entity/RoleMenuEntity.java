package com.chenfangming.manage.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色权限关联数据表实体
 * @author 陈方明  cfmmail@sina.com
 * @since 2018-10-25 20:36
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleMenuEntity implements Serializable {

    /** 序列化id **/
    private static final long serialVersionUID = 1L;

    /** 主键  id **/
    private Long id;
    /** 角色id **/
    private Long roleId;
    /** 菜单id **/
    private Long menuId;
    /** 是否可用  0不可用  1可用 **/
    private Boolean enabled;
    /** 创建人 **/
    private String createUser;
    /** 创建时间 **/
    private Date createTime;
    /** 更新人 **/
    private String updateUser;
    /** 更新时间 **/
    private Date updateTime;
}
