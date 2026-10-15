public class Lab {
    public static void main(String[] args) {
        sayHi();         //call the static sayHi method from the main execution
    }
    int getSum(int x, int y) {
        int sum = x + y; //add x and y
        return sum;      //return the computed sum
    }
    static void sayHi() {
        System.out.println("Butterfly");
    }
}
