package com.onlywjt.learning.enumclass;

/**
 * @author onlyWjt
 * @date 2021年05月02日 6:32 下午
 * @desc
 */
public class SimpleEnunmUse {
    public static void main(String[] args) {
        Spiciness sss = null;//枚举，下面可以用到
        Spiciness flam = Spiciness.FLAM;
        System.out.println(Spiciness.FLAM.ordinal());
        switch (sss){
            case FLAM:
                System.out.println();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sss);
        }
    }
}
