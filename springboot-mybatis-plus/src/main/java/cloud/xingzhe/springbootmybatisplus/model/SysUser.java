package cloud.xingzhe.springbootmybatisplus.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@ApiModel(value = "用户")
@Data
@TableName(value = "sys_user")
public class SysUser {
    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    @ApiModelProperty("用户名称")
    @TableField("username")
    private String username;
    @ApiModelProperty("地址")
    @TableField("address")
    private String address;
}
