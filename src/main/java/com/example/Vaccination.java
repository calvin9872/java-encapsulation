package com.example;

public class Vaccination {
    int dose = 100;

    public static void doHit() {
        //System.out.println("劑量為：" + dose + "cc"); // static 方法中不能用非 static 資料成員
        //callNurse(); // static 方法中不能用非 static 方法
        System.out.println("施打疫苗中...");
    }

    public void callNurse() {
        System.out.println("OOO請就位。");
    }

    public static void sumDose(int... numbers) {
        //int sum = 0;
        //// new int[] {x, y, z...};
        //for (int number : numbers) {
        //    sum += number;
        //}
        System.out.println("殘劑剩餘：" + "" + "cc");
    }
}
