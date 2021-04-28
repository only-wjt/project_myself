package com.onlywjt.learning.oop.keywords.thisandsuper;

/**
 * @autor onlyWjt
 * @date 2021年04月28日 4:46 下午
 * @desc
 */
public class ThisAndSuper {
    ThisAndSuper(){
        System.out.println("父类无参构造器");
    }
    ThisAndSuper(String ss){
        System.out.println("父类有参构造器，参数为:"+ss);
    }
    //每次new一个对象时，都会加载一次构造器
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
    }
}
class Chinese extends ThisAndSuper{
    Chinese(){
        //调用父类有参构造器
        super(new String("ss"));
        System.out.println("子类构造器");
    }
}
