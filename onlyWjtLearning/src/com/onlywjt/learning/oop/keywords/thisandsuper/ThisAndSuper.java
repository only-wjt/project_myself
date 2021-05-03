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
    //this关键字只能在方法内部使用，表示对"调用方法的那个对象"的引用，this必须放在最上面
    Chinese(){
        //调用父类有参构造器
        super(new String("ss"));
        System.out.println("子类构造器");
    }
    /**
     * @author onlyWjt
     * @date 2021/5/2 4:36 下午
     * @desc 此方法可以用来清理不再用的对象
     */
    void finaliaze(){
        /**
         * 1、对象可能不被垃圾回收
         * 2、垃圾回收并不等于"析构"
         * 3、垃圾收回只与内存有关
         */
    }
}
class 成员变量和局部变量{
    //局部变量必须初始化
    //成员变量如果不给默认值，java编译是会自动初始化
    int i;
    void 局部变量(){
        int i = 0;
        i++;
    }
}