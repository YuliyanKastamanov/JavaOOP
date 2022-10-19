package L04_InterfacesAndAbstraction_Labs_P05_BorderControl;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> identifiables = new ArrayList<>();
        String line = scanner.nextLine();
        while (!"End".equals(line)){
            String[] input = line.split("\\s+");
            if (input.length == 2){
                identifiables.add(new Robot(input[0],input[1]));
            }else {
                identifiables.add(new Citizen(input[0],
                        Integer.parseInt(input[1]),input[2]));
            }
            line = scanner.nextLine();
        }
        String fakeId = scanner.nextLine();
        for (Identifiable identifiable : identifiables) {
            if (identifiable.getId().endsWith(fakeId)){
                System.out.println(identifiable.getId());
            }
        }
    }
}
