package cloud.xingzhe.springbootswagger2.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户查询对象")
public class SysUserDTO {
    @ApiModelProperty(value = "名称",required = true)
    private String name;
    @ApiModelProperty(value = "密码",required = true)
    private String password;
    @ApiModelProperty(value = "年龄",required = true)
    private Integer age;
    @ApiModelProperty(value = "地址")
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
