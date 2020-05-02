public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        //一定要记得注册观察者,否则无法进行观察,不要重复注册观察者
        person.addObserver(new MyObserver());
        person.setName("徐淼");
        person.setAge(20);
        person.setSex("man");
    }
}
