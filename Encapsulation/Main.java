package Encapsulation;
class Student{
    private String Name;
    private int Age;
    private String Course;

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public int getAge(){
        return Age;
    }
    public void  setAge(int Age){
        this.Age = Age;
    }
    public  String getCourse(){
        return Course;
    }
    public void setCourse(String Course){
        this.Course = Course;
    }
}


class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        student.setCourse("Computer Science");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());
        System.out.println("My name is " + student.getName() + ", and I am " + student.getAge() + " years old, and I study " + student.getCourse() + ".");


    }
}


