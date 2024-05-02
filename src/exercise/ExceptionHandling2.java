package exercise;

public class ExceptionHandling2 {
    public static long power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }else if(n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }
        long result = 1;
        for(int index = 0; index < p; index++){
            result *=n;
        }
        return result;
    }
}
