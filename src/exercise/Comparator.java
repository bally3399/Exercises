package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Comparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int index = 0; index < n; index++){
            player[index] = new Player(scan.next(), scan.nextInt());
        }

        Arrays.sort(player, checker);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}
