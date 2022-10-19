package L01_WorkingWithAbstraction.Labs.P03_StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

            String[] input = scanner.nextLine().split("\\s+");

            while (!input[0].equals("Exit")){
                studentSystem.ParseCommand(input);
                input = scanner.nextLine().split("\\s+");
            }

    }
}
