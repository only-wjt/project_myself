package com.onlywjt.learning.oop.extend;

/**
 * @autor onlyWjt
 * @date 2021年04月28日 11:26 上午
 * @desc
 */
public class ExtendTest {
    public static void main(String[] args) {
        //从这块可以看出，private私有的不能继承，但是可通过反射进行获取
        ExtendLearn extendLearn = new ExtendLearn();
        extendLearn.test2();
        extendLearn.test();
        extendLearn.test3("sss");
    }

}
