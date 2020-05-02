public class Person2 {
    //懒汉式
    private String name;

    private static Person2 person2;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //构造函数私有化
    private Person2(){}

    /*
     //单线程可以保证唯一性
    //提供一个全局静态方法
    public static Person2 getPerson2(){
       if(person2==null){
           person2=new Person2();
       }
       return person2;
    }

     */

    public static  Person2 getPerson2(){
        if(person2==null){
            synchronized (Person2.class){
                if(person2==null){
                    person2=new Person2();
                }
            }
        }
        return person2;
    }

}
