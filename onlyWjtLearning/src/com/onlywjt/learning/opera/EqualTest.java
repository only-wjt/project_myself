package com.onlywjt.learning.opera;

import java.util.Random;

/**
 * @author onlyWjt
 * @date 2021年04月28日 21:27
 * @desc 请输入...
 */
public class EqualTest {
    public static void  test(FloatCla sss){
        sss.dd = 18f;
    }
    public static void main(String[] args) {
        Thank thank = new Thank();
        Thank thank2 = new Thank();
        thank.lev = 49;
        thank2.lev = 30;
        System.out.println("thank::"+thank.lev+";thank2::"+thank2.lev);
        //此处将thank2的引用给了thank1，所以之前的thank的引用没在使用中，后续会被垃圾回收器回收，不能直接对对象赋值，否则会造成程序混乱
        thank = thank2;
        System.out.println("thank::"+thank.lev+";thank2::"+thank2.lev);
        //此时thank和thank2的引用地址是一样的，所以无论改哪个，都是一样的值
        thank.lev=21;
        System.out.println("thank::"+thank.lev+";thank2::"+thank2.lev);

        FloatCla floatCla = new FloatCla();
        floatCla.dd = 0;
        System.out.println("dd"+floatCla.dd);
        //方法传递的只是对象的引用地址，所以还是改变了FloatCla的dd变量
        test(floatCla);
        System.out.println("dd"+floatCla.dd);
    }
}
class Thank{
    int lev = 1;
}
class FloatCla{
    float dd;
}
class equal的用法注意{
    public static void main(String[] args) {
        equal的用法注意 equal的用法注意 = new equal的用法注意();
        equal的用法注意.equal的用法注意();
    }
    public void equal的用法注意(){
        //整型在-127~128之间的数值，会存放在缓存里面，所以会出现下面这种情况
        int i = 128;
        int i1 = 128;
        System.out.println(i == i1);
        Integer integer = new Integer(129);
        Integer integer1 = new Integer(129);
        //所以此处应该用equals去比较
        //System.out.println(integer == integer1 );
    }
}

class equals的另一种现象{
    int value;
    public static void main(String[] args) {
        equals的另一种现象 value1 = new equals的另一种现象();
        equals的另一种现象 value2 = new equals的另一种现象();
        value1.value = value2.value = 100;
        //此处输出flase，是因为equals方法里面比较的是引用地址是否相同，不会比较里面的内容，所以既要比较应用地址，还要比较内容，需要重写equals方法
        System.out.println(value1.equals(value2));
    }
}
class 抛硬币{
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            System.out.println("反面");
        } else if (i == 1) {
            System.out.println("正面");
        }
    }
}








