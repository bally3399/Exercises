package exercise;

public class ExceptionHandling {
    public static int exception(int x , int y) {
            if (y == 0) {
                throw new ArithmeticException("java.lang.ArithmeticException: / by zero");
            }
           return  x / y;
    }
}
