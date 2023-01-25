import java.util.Scanner;

public class MinMaxMethod {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int numb1 = number.nextInt();
        System.out.println("Please enter second number : ");
        int numb2 = number.nextInt();
        System.out.println("Please enter third number : ");
        int numb3 = number.nextInt();
        System.out.println("The biggest number is " + maxMethod(numb1 ,numb2 ,numb3));
        System.out.println("The smallest number is " + minMethod(numb1 ,numb2 ,numb3));
    }
    static int maxMethod(int x, int y , int z){
        if (x > y && x > z)
            return x;
        else if(y > x && y > z)
            return y;
        else return z;
    }
    static int minMethod(int x, int y , int z){
        if (x < y && x < z)
            return x;
        else if(y < x && y < z)
            return y;
        else return z;
    }
}
