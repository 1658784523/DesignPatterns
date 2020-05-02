public class Main {
    public static void main(String[] args) {
        //Adapter adapter=new Adapter();
       // adapter.use10v();

        Adapter2 adapter2=new Adapter2(new Current());
        adapter2.use10v();
    }
}
