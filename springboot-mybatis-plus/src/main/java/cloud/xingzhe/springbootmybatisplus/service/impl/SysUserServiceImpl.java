package cloud.xingzhe.springbootmybatisplus.service.impl;
import cloud.xingzhe.springbootmybatisplus.mapper.SysUserMapper;
import cloud.xingzhe.springbootmybatisplus.model.SysUser;
import cloud.xingzhe.springbootmybatisplus.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
