package cloud.xingzhe.generator.sys.service.impl;

import cloud.xingzhe.generator.sys.entity.Bank;
import cloud.xingzhe.generator.sys.mapper.BankMapper;
import cloud.xingzhe.generator.sys.service.IBankService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 行者
 * @since 2020-05-08
 */
@Service
public class BankServiceImpl extends ServiceImpl<BankMapper, Bank> implements IBankService {

}
