package com.onlywjt.learning.main;

import org.junit.Test;

import java.util.*;
/**
 * @author onlyWjt
 *  description 操作运算符相关操作
 */
class testFloat{
    float test = 122f;
}
public class OperaSign {
    static class Think {
        int level;
    }
    static void Letter(testFloat y){
        y.test = 18f;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(new Date());

    }
    @Test
    public void testThink(){
        Think think1 = new Think();
        Think think2 = new Think();
        think1.level = 19;
        think2.level = 38;
        System.out.println("t1:"+think1.level + "  t2:"+think2.level);
        //此时将think2的引用给think1,则level为19，且之前的对象引用丢失，所以会被垃圾回收器回收
        think1 = think2;
        System.out.println("t1:"+think1.level+"  t2:"+think2.level);
        //此时再修改think1，则引用和think2引用地址一样，所以操作的是同一个对象
        think1.level = 2828;
        System.out.println("t1:"+think1.level+"  t2:"+think2.level);
    }

    @Test
    public void testFloat(){
        testFloat testFloat = new testFloat();
        testFloat.test = 22f;
        System.out.println(testFloat.test);
        OperaSign.Letter(testFloat);
        System.out.println(testFloat.test);
    }
    @Test
    public void testOperaSign(){//算符操作符实操练习
        Random random = new Random(47);//此处给一个种子，则每次生成的随机数都是一样的，如果不给，则以当前时间当做种子
        System.out.println(random.nextInt(100));//给上限值
        int i,j,k;
        i = random.nextInt(100)+1;
        j = random.nextInt(100)+1;
        k = i * (-j);
        System.out.println(k);
    }
    @Test
    public void decreasePrefix(){//前缀递减/递增和后缀递减/递增
        //前缀递减递增，会先执行运算，在生成值
        //后缀递增递减，会先生成值，再执行运算
        int i = 1;
        System.out.println("i:"+i);
        System.out.println("i++:" + i++);//先计算，在生成值，所以结果为1
        System.out.println("++i:" + ++i);
        System.out.println("i2:" + i);
        //同理 --i和i--也一样
    }
    @Test
    public void relationalOperator(){
        Integer integer = new Integer(47);
        Integer integer1 = new Integer(47);
        System.out.println(integer.equals(integer1));//比较的是引用地址，所以结果为true
        System.out.println(integer1.equals(integer));//因为integer中重写了equal方法，所以比较的是内容，所以返回true
        ValueTest valueTest = new ValueTest();
        ValueTest valueTest1 = new ValueTest();
        valueTest.i = valueTest1.i = 100;
        //此处为false，是因为自己自定义的ValueTest类没有重写equals方法导致的
        System.out.println(valueTest.equals(valueTest1));
        Person person1 = new Person();
        Person person = new Person();
        person.name = person1.name = "ss";
        //此时方法放回true，是因为重写了equals方法，比较的是内容，所以返回true；
        System.out.println(person1.equals(person));
    }
    /**
     * 模拟硬币正反面
     */
    @Test
    public void coin(){
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    /**
     * 模拟随机点名
     */
    @Test
    public void randomRollCall(){
        ArrayList<String> srings = new ArrayList<String>();
        srings.add("zhangSan");
        srings.add("liSi");
        Random random = new Random();
        int i = random.nextInt(srings.size());
        System.out.println(srings.get(i));
    }
}

class ValueTest{
    int i;
}

class Person{
    String name;
    public Person(String name){
        this.name = name;
    }

    public Person() {
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return this.name.equals(person.name);
    }
}

