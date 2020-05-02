public class Person {
    private String name;
    //饿汉式
    public static final Person person=new Person();
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //构造函数私有化
    private Person(){}

    //提供一个全局静态方法
    public static Person getPerson(){
        return person;
    }
}
