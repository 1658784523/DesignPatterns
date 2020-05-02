public class Main {
    public static void main(String[] args) {
        Car fly=new RunCar();
        CarDecorator carDecorator=new SwimCarDecorator(fly);
        CarDecorator flyCar=new FlyCarDecorator(carDecorator);
        flyCar.show();
    }
}
