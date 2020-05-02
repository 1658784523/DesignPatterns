public class Main {
    public static void main(String[] args) {
        /*
        MyCharacter myCHar1=new MyCharacter('a');
        MyCharacter myCHar2=new MyCharacter('b');
        MyCharacter myCHar3=new MyCharacter('a');
        MyCharacter myCHar4=new MyCharacter('d');

        myCHar1.display();
        myCHar2.display();
        myCHar3.display();
        myCHar4.display();
        //由此可见并不是同一个对象
        if(myCHar1==myCHar3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
         */
        //1 创建一个MyCharacter工厂
        MyCharacterFactory factory=new MyCharacterFactory();
        //从工厂中取出来MyCharacter
        MyCharacter myCHar1=factory.getMyCharacter('a');
        MyCharacter myCHar2=factory.getMyCharacter('b');
        MyCharacter myCHar3=factory.getMyCharacter('a');
        MyCharacter myCHar4=factory.getMyCharacter('d');

        myCHar1.display();
        myCHar2.display();
        myCHar3.display();
        myCHar4.display();

        //由此可见是同一个对象
        if(myCHar1==myCHar3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
