interface vehicle32{
    String name = "tvs";
    int Speed = 33;

    void start();
    void stop();

}
class costomer implements vehicle32{
    @Override
    public void start() {
        System.out.println("start() for start");
    }
    @Override
    public void stop(){
        System.out.println("stop() for stop");
    }
}
public class interface___12 {
    public static void main(String[] args) {
        costomer c = new costomer();
        c.start(); c.stop();
//        System.out.println(Speed);

    }
}
