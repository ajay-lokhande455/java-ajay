package practiceProgram.practiceProgram.inheritance;

public class Animal {
    void makeSound(){

    }
}
class Monkey extends Animal{
    public void makeSound(){
        System.out.println("Monkey make sound .....");
    }
}
class Tiger extends Animal{
    public void makeSound(){
        System.out.println("Tiger make sound ....");
    }
}
class  Test {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.makeSound();
        Tiger tiger = new Tiger();
        tiger.makeSound();
    }

}
