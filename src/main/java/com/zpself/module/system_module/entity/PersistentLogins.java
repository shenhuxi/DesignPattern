package com.zpself.module.system_module.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * 用户
 * @author shixh
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="PERSISTENT_LOGINS")
@DynamicInsert    /*插入时只插入非null属性，其他取数据库默认值*/
@DynamicUpdate
public class PersistentLogins extends BaseEntity {
    private static final long serialVersionUID = -1703630040908311406L;
    @NotNull
    @ApiModelProperty("用户名称")
    private String username;

    @NotNull
    @ApiModelProperty("角色名称")
    private String series;

    @NotNull
    @ApiModelProperty("角色名称")
    private String token;

    @NotNull
    @ApiModelProperty(value = "创建时间", allowEmptyValue=true)
    @Temporal(TemporalType.TIMESTAMP)
    @org.hibernate.annotations.UpdateTimestamp
    @Column(columnDefinition = "timestamp default CURRENT_TIMESTAMP comment '最后登录时间'")
    private Date last_used;
}
