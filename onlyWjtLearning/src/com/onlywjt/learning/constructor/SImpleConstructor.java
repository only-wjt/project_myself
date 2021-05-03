package com.onlywjt.learning.constructor;

/**
 * @author onlyWjt
 * @date 2021年05月02日 3:45 下午
 * @desc
 */
public class SImpleConstructor {
    public String string = "outer";
    SImpleConstructor(){
        String str = "111";
        System.out.println(string);
        System.out.println(str);
    }
}
class test{
    public static void main(String[] args) {
        new SImpleConstructor();
    }
}
class 初始化{
    int w;
    void 初始化(){
        w = 9;
    }
}
class Test初始化{
    public static void main(int[] args) {
        //w会被初始化两次，成员变量会先初始化，构造方法里面的会后初始化
        初始化 初始化 = new 初始化();
    }
}
