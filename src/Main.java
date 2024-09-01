import java.util.Scanner;

/**
 * Copyright: Khatch Shah
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] products = new int[3];
        int loop = 0;

        System.out.println("Ange användarnamn: ");
        String username = scanner.nextLine();

        if(username.length() > 5) {
            System.out.print("Ange produktnamn och spara i variabeln prodA: ");
            String prodA = scanner.nextLine();

            System.out.print("Ange pris: ");
            int price = scanner.nextInt();

            
        }
    }


}
