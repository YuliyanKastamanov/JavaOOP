package L01_WorkingWithAbstraction.Exercises.P04_TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] colors = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());

        List<Lights> lights = new ArrayList<>();

        for (String color: colors) {
            Lights light =  new Lights(Color.valueOf(color));
            lights.add(light);
        }



        for (int i = 0; i < number; i++) {

            List<Lights> currentLights = new ArrayList<>();

            for (int j = 0; j < lights.size(); j++) {
                Lights currentLight = lights.get(j);
                System.out.print(currentLight.getColor().getColor() + " ");
                Lights light =  new Lights(Color.valueOf(currentLight.getColor().getColor()));
                currentLights.add(light);

            }

            lights = currentLights;

            System.out.println();

        }


    }
}
