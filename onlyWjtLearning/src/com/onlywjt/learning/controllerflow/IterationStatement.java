package com.onlywjt.learning.controllerflow;

import java.util.Arrays;

/**
 * @author onlywjt
 * @date 2021年05月02日 11:16 上午
 * @desc
 */
public class IterationStatement {
    //while和do-while的区别是，do-while的语句至少会执行一次

    public static void main(String[] args) {
        IterationStatement iterationStatement = new IterationStatement();
        iterationStatement.forEachMethod();
    }

    /**
     * @author onlyWjt
     * @date 2021/5/2 11:21 上午
     */
    public void forEachMethod(){
        int[] arrs = {1,2,3,4};
        for (int i:arrs) {
            System.out.println(i);
        }
    }
    //break在达到某个条件之后直接中断，continues是在达到某个条件从条件开始处再次执行
}
class LabeledFor{
    public static void main(String[] args) {
        int i = 0;
        outer:
        for (;true;){
            inner:
            for (; i < 10;i++) {
                System.out.println("i = " + i);
                if (i == 2){
                    System.out.println("continue");
                    continue ;
                }
                if(i == 3){
                    System.out.println("bread");
                    i++;
                    break ;
                }
                if(i == 7){
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if(i==8){
                    System.out.println("break outer");
                    break outer;
                }
                for (int j = 0; j < 5; j++) {
                    if (j == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
class WhileTest{
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            switch (i){
                case 8:
                    System.out.println(i); break;
            }
        }
    }
}

class HelloWorld {
    public static void main(String[] arg) {
        String[] ar_str1, ar_str2;
        int sum = 0;
        int from;
        int to;
        int i_val;
        int count = 0;
        // 双重循环穷举
        for (int i = 10; i < 100; i++) {
            // j=i+1避免重复
            from = Math.max(1000 / i, i + 1);
            to = Math.min(10000 / i, 100);
            for (int j = from; j < to; j++) {
                i_val = i * j;
                // 下面的这个代码比较难懂，但比较重要，可以省去不必要的计算
                if (i_val % 100 == 0 || (i_val - i - j) % 9 != 0) {
                    continue;
                }
                count++;
                ar_str1 = String.valueOf(i_val).split("");
                ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                Arrays.sort(ar_str1);
                Arrays.sort(ar_str2);
                if (Arrays.equals(ar_str1, ar_str2)) {// 排序后比较,为真则找到一组
                    sum++;
                    System.out.println("第" + sum + "组: " + i + "*" + j + "=" + i_val);
                }
            }
        }
        System.out.println("共找到" + sum + "组吸血鬼数");
        System.out.println(count);
    }
}

class 吸血鬼算法 {

    static int a;       //千位
    static int b;       //百位
    static int c;       //十位
    static int d;       //个位

    static int a1;      //十位
    static int b1;      //个位
    static int c1;      //十位
    static int d1;      //个位
    static int sum  = 0; //总和
    static int sum2 = 0; //两数之积

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        method1();
        long endTime = System.nanoTime();
        System.out.println("method1 :" + (endTime - startTime)); //method1 :185671841
        long s = System.nanoTime();
        method2();
        long d = System.nanoTime();
        System.out.println("method2 :" + (d - s)); //method2 :90556063
        long s3 = System.nanoTime();
        method3();
        long d3 = System.nanoTime();
        System.out.println("method3 :" + (d3 - s3));//method3 :574735
        long s4 = System.nanoTime();
        method4();
        long d4 = System.nanoTime();
        System.out.println("method4 :" + (d4 - s4));//method4 :22733469
        long s5 = System.nanoTime();
        method5();
        long d5 = System.nanoTime();
        System.out.println("method5 :" + (d5 - s5));//method4 :19871660

    }

    private static void method5() {
        new VampireNumbers(); //该方法 有重复数字
    }

    static class VampireNumbers {
        static int a(int i) {
            return i / 1000;
        }

        static int b(int i) {
            return (i % 1000) / 100;
        }

        static int c(int i) {
            return ((i % 1000) % 100) / 10;
        }

        static int d(int i) {
            return ((i % 1000) % 100) % 10;
        }

        static int com(int i, int j) {
            return (i * 10) + j;
        }

        static void productTest(int i, int m, int n) {
            if (m * n == i) {
                System.out.println(i + " = " + m + " * " + n);
            }
        }

        public VampireNumbers() {
            for (int i = 1001; i < 9999; i++) {
                productTest(i, com(a(i), b(i)), com(c(i), d(i)));
                productTest(i, com(a(i), b(i)), com(d(i), c(i)));
                productTest(i, com(a(i), c(i)), com(b(i), d(i)));
                productTest(i, com(a(i), c(i)), com(d(i), b(i)));
                productTest(i, com(a(i), d(i)), com(b(i), c(i)));
                productTest(i, com(a(i), d(i)), com(c(i), b(i)));
                productTest(i, com(b(i), a(i)), com(c(i), d(i)));
                productTest(i, com(b(i), a(i)), com(d(i), c(i)));
                productTest(i, com(b(i), c(i)), com(d(i), a(i)));
                productTest(i, com(b(i), d(i)), com(c(i), a(i)));
                productTest(i, com(c(i), a(i)), com(d(i), b(i)));
                productTest(i, com(c(i), b(i)), com(d(i), a(i)));
            }
        }
    }

    private static void method4() { // 改进
        for (int i = 11; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                int k = i * j;
                String kStr = Integer.toString(k);
                String checkStr = Integer.toString(i) + Integer.toString(j);
                if (kStr.length() != 4) {
                    continue;
                }
                char[] kChar = kStr.toCharArray();
                char[] checkChar = checkStr.toCharArray();
                Arrays.sort(kChar);
                Arrays.sort(checkChar);
                boolean isVampire = Arrays.equals(kChar, checkChar);
                if (isVampire) {
                    System.out.println(i + " * " + j + " = " + k);
                }
            }
        }
    }

    private static void method3() { // 官方参考答案

        int[] startDigit = new int[4];
        int[] productDigit = new int[4];
        for (int num1 = 10; num1 <= 99; num1++) {
            for (int num2 = num1; num2 <= 99; num2++) {
                // Pete Hartley's theoretical result:
                // If x·y is a vampire number then
                // x·y == x+y (mod 9)
                if ((num1 * num2) % 9 != (num1 + num2) % 9) {
                    continue;
                }
                int product = num1 * num2;
                startDigit[0] = num1 / 10;
                startDigit[1] = num1 % 10;
                startDigit[2] = num2 / 10;
                startDigit[3] = num2 % 10;
                productDigit[0] = product / 1000;
                productDigit[1] = (product % 1000) / 100;
                productDigit[2] = product % 1000 % 100 / 10;
                productDigit[3] = product % 1000 % 100 % 10;
                int count = 0;
                for (int x = 0; x < 4; x++) {
                    for (int y = 0; y < 4; y++) {
                        if (productDigit[x] == startDigit[y]) {
                            count++;
                            productDigit[x] = -1;
                            startDigit[y] = -2;
                            if (count == 4) {
                                System.out.println(num1 + " * " + num2 + " : "
                                        + product);
                            }
                        }
                    }
                }

            } /*
             * Output: 15 * 93 : 1395 21 * 60 : 1260 21 * 87 : 1827 27 * 81 :
             * 2187 30 * 51 : 1530 35 * 41 : 1435 80 * 86 : 6880
             *///:~
        }
    }

    private static void method2() { // 穷举2

        //遍历四位数，排除00 从1001开始
        for (int i = 1001; i <= 9999; i++) {
            //排除00
            if (i % 100 != 00) {
                for (int k = 0; k < 100; k += 10) {
                    if (k != 0) {
                        //10 -99
                        for (int j2 = 0; j2 <= 9; j2++) {
                            //生成第一个两位数
                            for (int j = 0; j < 100; j += 10) {
                                for (int j3 = 0; j3 <= 9; j3++) {
                                    //生成第二个两位数
                                    //判断两数之积

                                    if ((k + j2) * (j + j3) == i) {
                                        if (compare2(i, k / 10, j2, j / 10, j3)) {
                                            System.out
                                                    .println(i + "=" + (k + j2)
                                                            + "*" + (j + j3));
                                        }

                                    }
                                }
                            }

                        }
                    }
                }
            }

        }
    }

    public static void method1() { //穷举1
        int x = 0, y = 0;
        for (int i = 1; i <= 9; i++) {
            a = i * 1000;
            for (int j = 0; j <= 9; j++) {
                b = j * 100;
                for (int j2 = 0; j2 < 10; j2++) {
                    c = j2 * 10;
                    for (int k = 0; k < 10; k++) {
                        d = k;
                        sum = a + b + c + d;
                        //取其中四个数字 中组成两个两位数 ，如果这两个两位数之积  等于 sum ,则输入 这个数
                        for (int k2 = 1; k2 < 10; k2++) {

                            a1 = k2 * 10;
                            for (int l = 0; l < 10; l++) {
                                if (a1 + b1 > 100) {
                                    break;
                                }
                                b1 = l;
                                //得到一个两位数字
                                for (int l2 = 1; l2 < 10; l2++) {
                                    c1 = l2 * 10;
                                    for (int m = l; m < 10; m++) {

                                        if (c1 + d1 > 100) {
                                            break;
                                        }
                                        d1 = m;
                                        //再得到一个两位数字
                                        sum2 = (a1 + b1) * (c1 + d1);
                                        //计算来两个两位数字之积，如果等于sum
                                        if (sum2 == sum) {
                                            //且尾数不能为00
                                            if (c + d != 0) {
                                                // 比较这个几个数字 是否一样
                                                if (compare(a, b, c, d, a1, b1,
                                                        c1, d1)) {
                                                    System.out.println(sum
                                                            + "=" + (a1 + b1)
                                                            + "*" + (c1 + d1));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean compare2(int i, int j, int j2, int k, int j3) {
        int a[] = { i % 10, i / 10 % 10, i / 100 % 10, i / 1000 };
        int b[] = { j, j2, k, j3 };
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean compare(int a2, int b2, int c2, int d2, int a12,
                                   int b12, int c12, int d12) {

        int[] a = new int[4];
        int[] b = new int[4];

        a[0] = a2 / 1000;
        a[1] = b2 / 100;
        a[2] = c2 / 10;
        a[3] = d2;

        b[0] = a12 / 10;
        b[1] = b12;
        b[2] = c12 / 10;
        b[3] = d12;

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            return true;
        } else {
            return false;
        }
    }
}