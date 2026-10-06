public class Lab {
    public static void main(String[] args) {
        int x[][] = new int[2][3];
        x[1][1] = 10;
        x[1][0] = 20;
        int y = x[1][1] + x[1][0];
       
        System.out.println(y);
    }
}
