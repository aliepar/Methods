import java.util.Scanner;

public class MinMaxDouble {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter first number : ");

        double numb1 = number.nextDouble();
        System.out.println(numb1);
        //System.out.println("you entered number:" + numb1);
        System.out.println("Please enter second number : ");
        double numb2 = number.nextDouble();
        System.out.println("Please enter third number : ");
        double numb3 = number.nextDouble();
       if (numb1 % 1 == 0 && numb2 % 1 == 0 && numb3 % 1 == 0) {

           System.out.println("The biggest number is " + maxMethod(numb1, numb2, numb3));
           System.out.println("The smallest number is " + minMethod(numb1, numb2, numb3));
       }
       else {
           System.out.println("The biggest number is " + maxMethod(numb1, numb2, numb3));
           System.out.println("The smallest number is " + minMethod(numb1, numb2, numb3));
       }
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
    static double maxMethod(double a, double b , double c){
        if (a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else return c;
    }
    static double minMethod(double a, double b , double c){
        if (a < b && a < c)
            return a;
        else if(b < a && b < c)
            return b;
        else return c;
    }
}