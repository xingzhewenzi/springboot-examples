package cloud.xingzhe.springbootMybatis.server;

import cloud.xingzhe.springbootMybatis.model.SysUser;

import java.util.List;

public interface SysUserServer {
    /**
     * 获取所有的用户
     * @author xingzhe
     * @date 2020/4/22 22:59
     * @return List<SysUser>
     */
    List<SysUser> findAllUser();
}
