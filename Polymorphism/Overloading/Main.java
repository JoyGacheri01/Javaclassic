package Overloading;

class Operation{
    public int add(int a, int b){
        return (a + b);
    }
    public double add(double  a, double b){
        return (a + b);
    }

}
class Main{
    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println(op.add(10, 20)); // Output: 30
        System.out.println(op.add(10.5, 20.3)); // Output:
    }
}
