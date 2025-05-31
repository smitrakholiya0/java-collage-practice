package com.company;

class smit{
    int hight = 184;
    int wight = 71;
    String name = "Smit";

    void sleeping(){
        System.out.println("I'M Sleeping");
    }

    void running(){
        System.out.println("I'M running");
    }

}
public class classAndObject {
    public static void main(String[] args) {

        smit S = new smit();
        System.out.println(S.hight);
        System.out.println(S.name);
        S.sleeping();
        S.running();

    }
}
