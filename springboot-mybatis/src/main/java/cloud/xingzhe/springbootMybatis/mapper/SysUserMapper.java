package cloud.xingzhe.springbootMybatis.mapper;

import cloud.xingzhe.springbootMybatis.model.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {
    /**
     * 获取所有的用户
     * @author xingzhe
     * @date 2020/4/22 22:59
     * @return List<SysUser>
     */
   List<SysUser> findAllUser();
}
