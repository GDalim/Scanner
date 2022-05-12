package learnStatic;

// static is a keyword
// If we use static keyword then we can call variable, method by its class name.

public class HwStatic {

    static String name="dalim";
        String name2="Gabriel";

    public static void main(String[] args) {
        System.out.println("My name is "+name);
        System.out.println("My name is " +HwStatic.name);
        System.out.println("--------");

// Create object

        HwStatic learn=new HwStatic();
        System.out.println(learn.name2);

        HwStatic.hw(); //called by class name because of static method
        learn.hw1(); // called by object name because of non-static method
    }
// Method called with static
    public static void hw(){
        System.out.println("This ia static method"); //check line 21, have to create object
    }
// Method called without static
    public void hw1(){
        System.out.println("This is a non static method"); //check line 22
    }

}
