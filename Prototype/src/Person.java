import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
    private String name;
    private int age;
    private String sex;
    private List<String> friends=new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //拷贝分为浅拷贝和深拷贝
    //数值类型的用浅拷贝即可，深拷贝要拷贝里面的引用

    /*
    public Person clone(){
        try {
            return (Person)super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
   }
     */

    public Person clone(){
        try {
            Person person=(Person)super.clone();
            //这个需要构建一个新的
            List<String> friends=new ArrayList<>();
            for (String friend:this.friends){
                friends.add(friend);
            }
            person.setFriends(friends);
            return person;
        }catch (CloneNotSupportedException e){
            return null;
        }
    }



}
