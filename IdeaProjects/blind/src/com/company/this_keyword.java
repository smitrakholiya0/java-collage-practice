package com.company;
class Male{
    int a= 5;
    Male(int a){
        this.a=a;
    }
       void show(){
           System.out.println(a);

        }
}
public class this_keyword {

    public static void main(String[] args) {
            Male r = new Male(100);
            r.show();
    }
}
