package com.example;

import java.util.Random;

public class People {
    private String name;
    private int age;
    private boolean attend = false;
    //
    //{
    //    System.out.println("test null");
    //}
    //
    //static {
    //    System.out.println("test static");
    //}

    // ex 3起:
    // 都沒寫的時候編譯器會自動幫你加入一個Default constructor
    public People() {
        //System.out.println("test p");
    }

    public People(String name, int age, boolean attend) {
        this.name = name;
        this.age = age;
        this.attend = attend;
    }

    //static void xxx() {
    //    System.out.println("test xxx");
    //}

    public String getName() {
        return name;
    }

    //public int getAge() {
    //    return age;
    //}
    //
    //// 帶參數的代表較年輕
    //public int getAge(int number) {
    //    return this.age -= number;
    //}

    public void setAge(int number) {
        this.age = number;
    }

    public String getAttend() {
        return attend ? "願意" : "不願意";
    }

    public float getHitRate() {
        return countHitRate();
    }

    private float countHitRate() {
        return ((20000f + 100f) / 100000f) * 100f;
    }

}
