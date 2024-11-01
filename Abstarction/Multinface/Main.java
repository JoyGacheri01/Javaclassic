package Abstarction.Multinface;

interface FirstInterface{
    public void myMethod();
}
interface SecondInterface{
    public  void mySecondMethod();

}
class MyClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("This is myMethod");
    }
    public void  mySecondMethod(){
        System.out.println("This is mySecondMethod");
    }

}
class Main{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
        obj.mySecondMethod();
    }
}
