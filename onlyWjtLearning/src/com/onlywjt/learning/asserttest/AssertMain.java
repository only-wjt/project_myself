package com.onlywjt.learning.asserttest;

public class AssertMain {
    private int age;

    public static void main(String[] args) {
        int age = -1;
        AssertMain assertMain = new AssertMain();
//        assertMain.setAge(age);
//        System.out.println(age);
        assertMain.testAdd();


    }
    public void setAge(int age) {
        assert age >= 0 : "年龄不能为负数";
        this.age = age;
    }

    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(23, 3);
        assert result == 5 : "2 + 3 应该等于 5";
        System.out.println("=====");
    }

}
