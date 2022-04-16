package com.example;

public class Test {
    interface A{
        default void method() {
            System.out.println("aaa");
        }
    }
    interface B{

        void method();
        int method(int a);
    }



    private class MyClass implements A,B{
        public int method(int a) {
            return 0;
        }

        @Override
        public void method() {
            A.super.method();
        }
        //public void method() {
        //
        //    System.out.println("ttt");
        //}
    }
}
