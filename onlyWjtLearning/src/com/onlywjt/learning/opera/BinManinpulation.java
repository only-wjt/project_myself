package com.onlywjt.learning.opera;

import java.util.Random;

/**
 * @autor onlyWjt
 * @date 2021年05月02日 10:15 上午
 * @desc
 */
public class BinManinpulation {
    public static void main(String[] args) {
        Random random = new Random(47);
        int i = random.nextInt();
        int j =   random.nextInt();
        double f = 9.0,a = 8.9;
        //float和double类型在cast时，总是会对改数字进行结尾，所以一般使用Math.round()方法进行四舍五入
        //如果两个足够大的int值执行乘法运算，结果就会溢出
    }
}
class overflow{
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        //此处在编译时不会报错，也不会出现警告信息，运行是也不会出错，所以这块尤其要注意，是java的一个坑
        System.out.println(bigger);
    }
}