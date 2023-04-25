import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.ToIntBiFunction;

public class Main {
    public static void main( String[] args ) {
    Scanner scan = new Scanner(System.in);
        LambdaTest calc ;
        LambdaTest calc1;
        LambdaTest calc2;
        LambdaTest calc3;
        System.out.print("Первое число = ");
        int  k=scan.nextInt();
        System.out.print("Второе число = ");
        int  m=scan.nextInt();
        calc  = (x, y) -> k + m;
        calc1 = (x, y) -> k - m;
        calc2 = (x, y) -> k * m;
        calc3 = (x, y) -> k / m;
        System.out.println(calc.calculate (0,0));
        System.out.println(calc1.calculate(0,0));
        System.out.println(calc2.calculate(0,0));
        System.out.println(calc3.calculate(0,0));
    }
}
     @FunctionalInterface
     interface LambdaTest<T,K> {
    T calculate(T x,K y);
}





