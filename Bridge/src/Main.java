public class Main {
    public static void main(String[] args) {
        Engine engine2000=new Engine2000();
        Engine engine2200=new Engine2200();
        Car car1=new Bus(engine2000);
        car1.installEngine();
        Car jeep1=new Jeep(engine2200);
        jeep1.installEngine();
    }
}
