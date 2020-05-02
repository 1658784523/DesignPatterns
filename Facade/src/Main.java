public class Main {
    public static void main(String[] args) {
        /*
         //实现A子系统功能
        SystemA systemA=new SystemA();
        systemA.doSomething();
        //实现B子系统功能
        SystemB systemB=new SystemB();
        systemB.doSomething();
        //实现C子系统功能
        SystemC systemC=new SystemC();
        systemC.doSomething();
         */
       Facade facade=new Facade();
       facade.doSomething();


    }
}
