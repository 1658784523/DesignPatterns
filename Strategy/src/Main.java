public class Main {
    public static void main(String[] args) {
        Context context=new Context(new MD5Strategy());
        context.encrypt();
    }
}
