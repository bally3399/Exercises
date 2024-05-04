package exercise;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
            int number=in.nextInt();
            for(int index = 0; index < number; index++){
                int num = in.nextInt();
                int num2 = in.nextInt();
                int num3 = in.nextInt();
                int result = num;
                for (int idx = 0; idx < num3; idx++) {
                    result += (int) (Math.pow(2, idx) * num2);
                    System.out.print(result + " ");
                }
                System.out.println();

            }

        }


}
