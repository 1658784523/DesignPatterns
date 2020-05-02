public class Bus extends Car {
    public  Bus(Engine engine){
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("汽车安装：");
        this.getEngine().installEngine();
    }
}
