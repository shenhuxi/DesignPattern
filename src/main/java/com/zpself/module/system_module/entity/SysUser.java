package com.zpself.module.system_module.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;


/**
 * 用户
 * @author zengpeng
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonIgnoreProperties({"lockState","mistakeNums"})
@Entity
@Table(name="S_USER")
@DynamicInsert    /*插入时只插入非null属性，其他取数据库默认值*/
@DynamicUpdate
public class SysUser extends BaseEntity {
    public static final String INITPASSWORD = "666666";
    private static final long serialVersionUID = -1703630040908311405L;
    @NotNull
    @Column(unique=true)
    @ApiModelProperty("登陆名 4A账号")
    private String name;

    private String password;

    @NotNull
    @ApiModelProperty("用户状态:0-停用,1-启用,2-注销")
    @Column(columnDefinition="int default 0",nullable=false)
    private Integer userState = 1;

    @ApiModelProperty("锁定状态:0-no,1-yes")
    @Transient
    private int lockState;
    //0-no,1-yes  redis存储(后期换ＭＱ)

    @ApiModelProperty("密码输入错误次数")
    @Transient
    private int mistakeNums;
    //密码输入错误次数  redis存储(后期换ＭＱ)

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("头像")
    private String heardImg;

    @ApiModelProperty("最后登录时间")
    private Date lastLoginTime;

    @ApiModelProperty("身份证")
    private String idCard;

    @ApiModelProperty("角色集合")
    @ManyToMany
    private List<SysRole> roles;
}
