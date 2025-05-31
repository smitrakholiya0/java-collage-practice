package com.company;
class A {
    int a;
    String b;

    A() {
        a = 10;
        b = "smit";
    }
        void show()
        {
            System.out.println(a + " " + b);

        }
}
public class constructor {
    public static void main(String[] args) {

        A ref = new A();
        ref.show();


    }
}
