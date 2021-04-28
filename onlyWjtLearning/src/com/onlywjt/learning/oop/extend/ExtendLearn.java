package com.onlywjt.learning.oop.extend;

/**
 * @autor onlyWjt
 * @date 2021年04月28日 11:15 上午
 * @desc
 */
public class ExtendLearn extends ExtendMainClass {
    @Override
    public void test(){
        System.out.println("对父类的test方法进行重写");
    }
    public void test3(String sss){
        System.out.println("新扩展的方法"+sss);
    }
}
