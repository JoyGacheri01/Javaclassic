package Overriding;

class School{
    public void study(){
        System.out.println("The Students are studying");
    }
}
class English extends School{
    public void read(){
        System.out.println("The Students are reading English");
    }
}
class Games extends School{
    public void play(){
        System.out.println("The Students are playing games");
    }
}
class Main{
    public static void main(String[] args) {
        School s = new School();
        s.study();
        English e = new English();
        e.read();
        Games g = new Games();
        g.play();
        
    }
}