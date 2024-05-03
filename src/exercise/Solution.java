package exercise;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int index = 0; index < 3; index++) {
            String language = sc.next();
            int score = sc.nextInt();
            System.out.printf("%-15s%03d%n", language, score);
        }
        System.out.println("================================");
    }
}