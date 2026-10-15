import java.util.Scanner; //import the Scanner class to handle user input
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //create a Scanner object to read input
        int x;
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("x = " + x);
        sc.close();
    }
}
