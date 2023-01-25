import java.math.BigInteger;
public class FibonacciCalc {
    public static void main(String[] args) {
        //call the fibonacci method call first 15 numbers//
       Fibonacci( 20);
    }
    public static void Fibonacci(int numb){
        BigInteger nr1 =BigInteger.ZERO;
        BigInteger nr2 = BigInteger.ONE;
         //numb= 2;
        BigInteger nextNr =BigInteger.ZERO;
        System.out.println( nr1 );
        System.out.println(nr2);
        while ( 0< numb-2){
            System.out.println(nextNr + " ");
            nr1 =nr2;
            nr2 =nextNr;
            nextNr=nr1.add(nr2);
            numb --;
        }
    }
}
