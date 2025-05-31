package com.company;

class TH{
    int a; String b;
    TH(){
        a= 10;
        b= "smit.smit";
        System.out.println(a+" "+b);
    }
    TH(TH ref){
        a= ref.a;
        b= ref.b;
        System.out.println(a+" "+b);
    }
}
public class CCconstructor {

    public static void main(String[] args) {
        TH r = new TH();
        TH rm = new TH(r);
    }
}
