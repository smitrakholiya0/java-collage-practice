package com.company;

class AB{
    int x,y;
    AB(int a , int b)
    {
             x = a;
             y = b;
    }
    AB(int a, String b){
        System.out.println(a+" "+b);
    }

    void show(){

        System.out.println(x+" "+y);
    }
}

public class parametersConstruct {
    public static void main(String[] args) {

        AB r = new AB(100,200);
        r.show();
        AB rm = new AB(500, "sss");


    }
}
