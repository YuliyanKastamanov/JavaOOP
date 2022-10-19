package L01_WorkingWithAbstraction.Labs.P02_PointInRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        Point bottomLeft = new Point(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
        Point topRight = new Point(Integer.parseInt(data[2]), Integer.parseInt(data[3]));

        Rectangle currentRectangle = new Rectangle(bottomLeft, topRight);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] currentData = scanner.nextLine().split("\\s+");

            int currentX = Integer.parseInt(currentData[0]);
            int currentY = Integer.parseInt(currentData[1]);

            System.out.println(currentRectangle.contains(currentX, currentY));

        }


    }
}
