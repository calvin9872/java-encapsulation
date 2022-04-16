package com.example;

public class DemoApplication {

    public static void main(String[] args) {

        // ex 1:
        //String str = "hElLo Covid19";
        //System.out.println(str.toLowerCase());


        // ex 2: 示範呼叫預設建構子
        //People people = new People();


        // ex 3:
        //People[] peoples = {
        //        new People(),
        //        new People("娜璉", 25, true),
        //        new People("定延", 24, false)
        //};

        // ex 3-1: Overloading
        //peoples[0] = new People("子瑜", 22, true);
        //for (People people : peoples) {
        //    System.out.println("我是" + people.getName()
        //            + "，今年" + people.getAge() + "歲"
        //            + "，" + people.getAttend() + "施打疫苗"
        //    );
        //}


        // ex 4:
        People[] peoples = {
                new People("子瑜", 22, true),
                new People("娜璉", 25, true),
                new People("定延", 24, false)
        };

        // ex 4-1: setter 改變年齡
        //peoples[2].setAge(72);

        // ex 4-2: getter 取得較年輕年齡
        //peoples[0].getAge(2);
        //
        //for (People people : peoples) {
        //    System.out.println("我是" + people.getName()
        //                    + "，今年" + people.getAge() + "歲"
        //                    + "，" + people.getAttend() + "施打疫苗"
        //    );
        //    // example 4-3: 透過公開方法取得施打率
        //    System.out.println("目前疫苗施打率為：" + people.getHitRate() + "%");
        //}

        // ex 5:
        //Vaccination.doHit();

        // ex 6:
        //Vaccination.sumDose();
    }
}
