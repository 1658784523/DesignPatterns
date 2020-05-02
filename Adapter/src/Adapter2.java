public class Adapter2 {
    private Current current;
    public Adapter2(Current current){
        this.current=current;
    }
    public void use10v(){
        System.out.println("使用适配器");
        this.current.user220v();
    }
}
