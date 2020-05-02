public class Jeep extends Car {
    public Jeep(Engine engine){
        super(engine);
    }

    public void installEngine(){
        System.out.print("吉普安装:");
        this.getEngine().installEngine();
    }

}
