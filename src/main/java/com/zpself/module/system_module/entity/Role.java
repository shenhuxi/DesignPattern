package com.zpself.module.system_module.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * 用户
 * @author shixh
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="S_ROLE")
@DynamicInsert    /*插入时只插入非null属性，其他取数据库默认值*/
@DynamicUpdate
public class Role extends BaseEntity {
    private static final long serialVersionUID = -1703630040908311406L;
    @NotNull
    @Column(unique=true)
    @ApiModelProperty("角色名称")
    private String name;

}
