public class SwimCarDecorator  extends CarDecorator{
    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }
    public SwimCarDecorator(Car car){
        super(car);
    }
     public void swim(){
        System.out.println("车会游泳");
     }

    @Override
    public void run() {

    }
}
