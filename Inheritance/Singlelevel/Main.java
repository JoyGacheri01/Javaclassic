// Extend keyword is used(Indicates you are derived from an existing class)
// base class
// Has a superclass and a sub class

class Vehicle{
    protected String brand = "Ford";

    public void honk(){
        System.out.println("The vehicle is honking");
    }

}
class Car extends Vehicle{
    private String  model = "Mustang";

    public static  void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.model);
    }


}
// If you dont want another class to inherit from a class use final keyword



