package exercise;

import java.util.Scanner;

public class StringsToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = s.split("[^A-Za-z]+");
        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }


    }


}
