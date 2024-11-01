package Abstarction;

// acheived either by abstract or interface

abstract class Animal{
    //abstract method does not have a body
    abstract void  sound();

}
class Pig extends Animal{
    void sound(){
        System.out.println("Oink");
    }
}
class Cow  extends Pig{
    void  sound(){
        System.out.println("Moo");
    }

}

class Main{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        Cow c =  new Cow();
        c.sound();
        myPig.sound();

    }
}