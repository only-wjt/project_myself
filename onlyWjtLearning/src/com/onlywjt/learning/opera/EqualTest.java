package com.onlywjt.learning.opera;

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