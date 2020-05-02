public class FlyCarDecorator extends CarDecorator {

    public FlyCarDecorator(Car car){
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    public void fly(){
        System.out.println("车可以飞");
    }

    @Override
    public void run() {

    }
}
