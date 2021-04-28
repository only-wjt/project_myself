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
    }
    public float speedCalu(float lc,float sj){
        return lc/sj;
    }
}
