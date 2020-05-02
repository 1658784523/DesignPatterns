import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         Person person1=new Person();
        person1.setName("徐淼");
        person1.setAge(20);
        person1.setSex("man");

        //克隆不等于引用指向的改变
        Person person2=person1.clone();
        person2.setName("孙泳");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
         */
       Person person1=new Person();
       List<String> friends=new ArrayList<>();
       friends.add("孙泳");
       friends.add("刘昱龙");
       person1.setFriends(friends);

       Person person2=person1.clone();
       friends.add("蔡逸南");
       person1.setFriends(friends);

        System.out.println(person1.getFriends());
        System .out.println(person2.getFriends());

    }
}
