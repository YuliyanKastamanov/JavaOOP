package L01_WorkingWithAbstraction.Labs;

import java.util.Scanner;

public class P01_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        printTopHalf(size);

        printBottomHalf(size);

    }

    private static void printBottomHalf(int n) {
        for (int startNum = n - 1; startNum > 0 ; startNum--) {
            printRow(n, startNum);
        }
    }

    private static void printTopHalf(int n) {
        for (int startNum = 1; startNum <= n; startNum++) {
            printRow(n, startNum);
        }
    }

    private static void printRow(int n, int startNum) {

        for (int i = 0; i < n -  startNum; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < startNum - 1; i++) {
            System.out.print("* ");
        }
        System.out.println("*");

    }


}
