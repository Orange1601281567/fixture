package com.system.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author Ablett_Chen
 * @since 2021-01-25
 */
@ApiModel(value="SysUsers对象", description="用户信息表")
public class SysUsers extends Model<SysUsers> {

    private static final long serialVersionUID = 1L;

      /**
     * 主键
     */
        @TableId(type = IdType.AUTO)
  	@ApiModelProperty(value = "主键",name = "id")
    private Integer id;

      /**
     * 工号/用户名
     */
  	@ApiModelProperty(value = "工号/用户名",name = "username")
    private String username;

      /**
     * 密码
     */
  	@ApiModelProperty(value = "密码",name = "password")
    private String password;

      /**
     * 姓名
     */
  	@ApiModelProperty(value = "姓名",name = "name")
    private String name;

      /**
     * 权限标识
     */
  	@ApiModelProperty(value = "权限标识",name = "power")
    private String power;

      /**
     * 机种
     */
  	@ApiModelProperty(value = "机种",name = "model")
    private String model;

      /**
     * 机种阶段
     */
  	@ApiModelProperty(value = "机种阶段",name = "build")
    private String build;

      /**
     * Mail发送名单
     */
  	@ApiModelProperty(value = "Mail发送名单",name = "process")
    private String process;

      /**
     * 最后登录时间
     */
  	@ApiModelProperty(value = "最后登录时间",name = "logintime")
    private LocalDateTime logintime;

      /**
     * 密码还原时间
     */
  	@ApiModelProperty(value = "密码还原时间",name = "pwdtime")
    private LocalDateTime pwdtime;

      /**
     * 密码重置者
     */
  	@ApiModelProperty(value = "密码重置者",name = "pwdbyuser")
    private String pwdbyuser;

      /**
     * 权限修改时间
     */
  	@ApiModelProperty(value = "权限修改时间",name = "powertime")
    private LocalDateTime powertime;

      /**
     * 权限修改人
     */
  	@ApiModelProperty(value = "权限修改人",name = "powerbyuser")
    private String powerbyuser;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getUsername() {
        return username;
    }

      public void setUsername(String username) {
          this.username = username;
      }
    
    public String getPassword() {
        return password;
    }

      public void setPassword(String password) {
          this.password = password;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getPower() {
        return power;
    }

      public void setPower(String power) {
          this.power = power;
      }
    
    public String getModel() {
        return model;
    }

      public void setModel(String model) {
          this.model = model;
      }
    
    public String getBuild() {
        return build;
    }

      public void setBuild(String build) {
          this.build = build;
      }
    
    public String getProcess() {
        return process;
    }

      public void setProcess(String process) {
          this.process = process;
      }
    
    public LocalDateTime getLogintime() {
        return logintime;
    }

      public void setLogintime(LocalDateTime logintime) {
          this.logintime = logintime;
      }
    
    public LocalDateTime getPwdtime() {
        return pwdtime;
    }

      public void setPwdtime(LocalDateTime pwdtime) {
          this.pwdtime = pwdtime;
      }
    
    public String getPwdbyuser() {
        return pwdbyuser;
    }

      public void setPwdbyuser(String pwdbyuser) {
          this.pwdbyuser = pwdbyuser;
      }
    
    public LocalDateTime getPowertime() {
        return powertime;
    }

      public void setPowertime(LocalDateTime powertime) {
          this.powertime = powertime;
      }
    
    public String getPowerbyuser() {
        return powerbyuser;
    }

      public void setPowerbyuser(String powerbyuser) {
          this.powerbyuser = powerbyuser;
      }

      public static final String ID = "id";

      public static final String USERNAME = "username";

      public static final String PASSWORD = "password";

      public static final String NAME = "name";

      public static final String POWER = "power";

      public static final String MODEL = "model";

      public static final String BUILD = "build";

      public static final String PROCESS = "process";

      public static final String LOGINTIME = "logintime";

      public static final String PWDTIME = "pwdtime";

      public static final String PWDBYUSER = "pwdbyuser";

      public static final String POWERTIME = "powertime";

      public static final String POWERBYUSER = "powerbyuser";

      @Override
    protected Serializable pkVal() {
          return this.id;
      }

    @Override
    public String toString() {
        return "SysUsers{" +
              "id=" + id +
                  ", username=" + username +
                  ", password=" + password +
                  ", name=" + name +
                  ", power=" + power +
                  ", model=" + model +
                  ", build=" + build +
                  ", process=" + process +
                  ", logintime=" + logintime +
                  ", pwdtime=" + pwdtime +
                  ", pwdbyuser=" + pwdbyuser +
                  ", powertime=" + powertime +
                  ", powerbyuser=" + powerbyuser +
              "}";
    }
}
