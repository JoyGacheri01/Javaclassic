package Abstarction.Interface;

interface Animal{
    // does not  have a body

    void makeSound();
    void run();

}
class Cow implements Animal{
    public void makeSound(){
        System.out.println("Moo");
    }
    public void run(){
        System.out.println("Cow is running");
    }
}
class Main{
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.makeSound();
        cow.run();
    }
}