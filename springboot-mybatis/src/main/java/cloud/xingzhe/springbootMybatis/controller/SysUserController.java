package cloud.xingzhe.springbootMybatis.controller;

import cloud.xingzhe.springbootMybatis.model.SysUser;
import cloud.xingzhe.springbootMybatis.server.SysUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {
    @Autowired
    private SysUserServer sysUserServer;
    @ResponseBody
    @RequestMapping("/findAllUser")
    public List<SysUser> findAllUser(){
        return sysUserServer.findAllUser();
    }
}
