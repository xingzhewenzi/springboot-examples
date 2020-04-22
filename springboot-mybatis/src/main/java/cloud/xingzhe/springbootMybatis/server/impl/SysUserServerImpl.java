package cloud.xingzhe.springbootMybatis.server.impl;

import cloud.xingzhe.springbootMybatis.mapper.SysUserMapper;
import cloud.xingzhe.springbootMybatis.model.SysUser;
import cloud.xingzhe.springbootMybatis.server.SysUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysUserServerImpl implements SysUserServer {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> findAllUser() {
        return sysUserMapper.findAllUser();
    }
}
