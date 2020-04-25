package cloud.xingzhe.springbootswagger2.controller;

import cloud.xingzhe.springbootswagger2.model.dto.SysUserDTO;
import cloud.xingzhe.springbootswagger2.model.query.SysUserQuery;
import cloud.xingzhe.springbootswagger2.model.vo.SysUserVO;
import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户接口列表value",tags = "用户接口列表tags")
public class SysUserController {
    @ApiOperation(value = "创建用户")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public SysUserDTO create(SysUserDTO sysUserDTO){
        return sysUserDTO;
    }

    @ApiOperation(value = "获取用户信息")
    @ApiImplicitParams({
           @ApiImplicitParam(value = "id",name = "id"),
            @ApiImplicitParam(value = "名称",name = "name")
    })
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public SysUserVO get(String id,String name){
        SysUserVO sysUserVO=new SysUserVO();
        sysUserVO.setId(id);
        sysUserVO.setName(name);
        sysUserVO.setAddress("广东");
        sysUserVO.setAge(20);
        sysUserVO.setPassword("123456");
        return sysUserVO;
    }
    @ApiOperation(value = "根据对象进行查询")
    @RequestMapping(value = "/getBySysUserQuery",method = RequestMethod.GET)
    public SysUserVO getBySysUserQuery(SysUserQuery sysUserQuery){
        SysUserVO sysUserVO = new SysUserVO();
        BeanUtils.copyProperties(sysUserQuery,sysUserVO);
        return sysUserVO;
    }
}
