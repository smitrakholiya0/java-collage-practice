class AA1{
    int a = 10;
    void show(){
        System.out.println("p of a");
    }
}
class BB1 extends AA1{

    int a= 20;
    void show(){
        super.show();
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class superKy {
    public static void main(String[] args) {
        BB1 r = new BB1();
        r.show();
    }
}
