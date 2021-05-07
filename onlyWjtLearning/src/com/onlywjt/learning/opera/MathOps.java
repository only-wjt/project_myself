package com.onlywjt.learning.opera;

import java.util.Random;

/**
 * @author onlyWjt
 * @date 2021年04月28日 21:47
 * @desc 请输入...
 */
public class MathOps {
    public static void main(String[] args) {
        Random random1 = new Random();
        Random random = new Random(47);
        System.out.println(random.nextInt(10)+1);
        float lc = 100;
        float sj = 21;
        System.out.println(new MathOps().speedCalu(lc, sj));
        System.out.println("-----------------验证前缀递增递减和正常递增递减的区别-----------------");
        new MathOps().testIncre();
    }
    public float speedCalu(float lc,float sj){
        return lc/sj;
    }

    //递增和递减
    /**
     * --i 这种属于前缀递减，会先执行运算，然后在复制
     * i-- 这种属于后缀递减，会先复制，然后再做运算
     * 下面为一个示例
     */
    public void testIncre(){
        int i = 8;
        System.out.println("i-- : "+i--);
        System.out.println("i : "+i);
        System.out.println("--i : "+--i);
        System.out.println("i : "+i);
    }
}
class 十六进制和八进制{
    public static void main(String[] args) {
        int 十六 = 0X10f;
        int 八 = 01234;
        System.out.println(Long.toBinaryString(十六));
        System.out.println(Long.toBinaryString(八));
        System.out.println(Math.E);
        System.out.println(Float.MAX_VALUE);
    }
}