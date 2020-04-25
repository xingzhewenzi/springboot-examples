package cloud.xingzhe.lombok;

import cloud.xingzhe.lombok.model.SysUserLombok;
import cloud.xingzhe.lombok.model.SysUserNotLombok;

public class TestLombok {
    public static void testLombok(){
        SysUserLombok sysUserLombok=new SysUserLombok();
        sysUserLombok.setName("张三");
        sysUserLombok.setAddress("地址");
        sysUserLombok.setPassword("123456");
        sysUserLombok.setUsername("123456");
        System.out.println(sysUserLombok);
    }
    public static void testNotLombok(){
        SysUserNotLombok sysUserNotLombok=new SysUserNotLombok();
        sysUserNotLombok.setName("李四");
        sysUserNotLombok.setAddress("地址");
        sysUserNotLombok.setPassword("123456");
        sysUserNotLombok.setUsername("123456");
        System.out.println(sysUserNotLombok);
    }

    public static void main(String[] args) {
        testLombok();
        testNotLombok();
    }
}
