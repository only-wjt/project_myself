package com.onlywjt.learning.oop.staticLearn;

/**
 * @author onlyWjt
 * @date 2021年04月27日 22:45
 * @desc 请输入...
 */
public class MyClassTwo {
    int method(){
        return n;
    }
    int m = method();
    int n = 1;

    public static void main(String[] args) {
        //此处结果为1
        System.out.println(new MyClassTwo().method());
        //此处结果为0
        System.out.println(new MyClassTwo().m);
        //在编译成class文件的时候，首先，加载成员字段值，加载到m的时候，n此时还未为1，而是默认值0，所以，调用m的时候为0
        //参考  https://www.cnblogs.com/nokiaguy/p/3156357.html
    }
}
