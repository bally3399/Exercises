package exercise;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length() + B.length();

        boolean comparison = A.compareTo(B) > 0;
        String capitalizedS1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedS2 = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(sum);
        if(comparison){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(capitalizedS1 + " " + capitalizedS2);
    }
}
