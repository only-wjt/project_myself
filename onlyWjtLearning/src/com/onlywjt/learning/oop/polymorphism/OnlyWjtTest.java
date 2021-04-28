package com.onlywjt.learning.oop.polymorphism;

/**
 * @autor onlyWjt
 * @date 2021年04月28日 2:58 下午
 * @desc 多态的相关应用
 */
public class OnlyWjtTest {
    public static void main(String[] args) {
        new smallFish().eat();
        new bigFish().eat();
        //向上转型
        allEat(new smallFish());

    }
    public static void allEat(fish fish){
        if(fish instanceof bigFish){
            bigFish fish1 = (bigFish) fish;
            fish1.eat();
        }else{
            smallFish fish1 = (smallFish) fish;
            fish1.eat();
        }
    }
}
class fish{
    public void eat(){
        System.out.println("吃了好几条");
    }
}
class bigFish extends fish{
    @Override
    public void eat() {
        System.out.println("大鱼吃小鱼");
    }
}
class smallFish extends fish{
    @Override
    public void eat() {
        //这是启用super关键字，来调用父类的eat方法
        super.eat();
        System.out.println("小鱼吃虾米");
    }
}