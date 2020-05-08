package cloud.xingzhe.springbootmybatisplus.controller;


import cloud.xingzhe.springbootmybatisplus.model.Bank;
import cloud.xingzhe.springbootmybatisplus.service.IBankService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 * @author 行者
 * @since 2020-05-08
 */
@Api(tags = "银行管理")
@RestController
@RequestMapping("/sys/bank")
public class BankController {
    @Autowired
    private IBankService bankService;
    @ApiOperation(value="存取测试乐观锁")
    @RequestMapping(value = "/access",method = RequestMethod.GET)
    @ResponseBody
    public String access(String userId,Integer money) throws InterruptedException {
       QueryWrapper<Bank> queryWrapper=new QueryWrapper<>();
       queryWrapper.eq("user_id", userId);
       Bank bank = bankService.getOne(queryWrapper);
       Integer amount=  bank.getAmount();
       bank.setAmount(amount+money);
       Thread.sleep(5000);
        boolean b = bankService.updateById(bank);
        if (b){
            return "更新成功";
        }
        return "更新失败，余额已被其他操作人员修改，请重试";
    }

}
