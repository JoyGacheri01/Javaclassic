
// contains many forms
class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }

}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: Oink");
    }
}
class Goat extends Animal{
    public void animalSound(){
        System.out.println("The goat says: Ma");
    }
}
class  Cow extends Animal{
    public void animalSound(){
        System.out.println("The cow says: Moo");
    }
}
class Main{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myGoat = new Goat();
        Animal myCow = new Cow();

        myAnimal.animalSound();
        myPig.animalSound();
        myGoat.animalSound();
        myCow.animalSound();

    }
}
