package cloud.xingzhe.springbootmybatisplus.controller;
import cloud.xingzhe.springbootmybatisplus.model.SysUser;
import cloud.xingzhe.springbootmybatisplus.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Api(tags = "用户管理")
@RestController
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @ApiOperation(value = "用户添加")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String save(SysUser sysUser){
        boolean flag = sysUserService.save(sysUser);
        return flag?"创建成功":"创建失败";
    }
    @ApiOperation(value = "删除用户")
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public String delete(String id){
        boolean flag = sysUserService.removeById(id);
        return flag?"删除成功":"删除失败";
    }
    @ApiOperation(value = "更新用户")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(SysUser sysUser){
        boolean flag = sysUserService.updateById(sysUser);
        return flag?"更新成功":"更新失败";
    }
    @ApiOperation(value = "获取用户列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public  List<SysUser> list(){
        List<SysUser> sysUserList = sysUserService.list();
        return sysUserList;
    }
    @ApiOperation(value = "根据id得到用户详情")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public SysUser get(String id){
        SysUser sysUser = sysUserService.getById(id);
        return sysUser;
    }
    @ApiOperation(value = "QueryWrapper查询列表")
    @RequestMapping(value = "/queryWrapperList",method = RequestMethod.GET)
    public List<SysUser> queryWrapperList(SysUser sysUser){
        QueryWrapper<SysUser> queryWrapper=new QueryWrapper<>();
        Map<String,Object> params=new HashMap<>(3);
        params.put("username", sysUser.getUsername());
        params.put("id", sysUser.getId());
        params.put("address", sysUser.getAddress());
        queryWrapper.allEq(params,false);
        List<SysUser> list = sysUserService.list(queryWrapper);
        return list;
    }

}
