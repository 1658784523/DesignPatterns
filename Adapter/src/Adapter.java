public class Adapter extends Current{
    public void use10v(){
        System.out.println("使用适配器");
        this.user220v();
    }
}
