import java.util.Scanner;
public class MyCalculatorMethod {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("Enter two numbers : ");

        int number1 = number.nextInt();
        int number2 = number.nextInt();

        // 3. call the methods to compute
        System.out.println(number1 + " + " + number2 + " = " + addNum(number1 , number2));
        System.out.println(number1 + " - " + number2 + " = " + subNum(number1 , number2));
        System.out.println(number1 + " * " + number2 + " = " + mulNum(number1 , number2));
        System.out.println(number1 + " / " + number2 + " = " + divNum(number1 , number2));
    }
    static int addNum (int a, int b) {
        return a+b;
    }
    static int subNum (int x, int y){
        return x-y;
    }
    static int mulNum (int x, int y){
        return x*y;
    }
    static int divNum (int x, int y){
        return x/y;
    }
}
