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

            if (price >= 0) {
                products[0] = price * 3;
                products[1] = products[0] / 2 + 1;
                products[2] = products[1] * 2;

                while (loop <= 2) {
                    System.out.print("Ange en siffra: ");
                    int siffra = scanner.nextInt();
                    if (siffra <= 0 && siffra <= 2) {
                        products[siffra] = price;
                    } else {
                        System.out.println("Ogiltig siffra. Ange en siffra mellan 0 och 2.");
                    }
                    loop++;
                }

                System.out.println("prodA har priset " + products[2]);
                System.out.println("prodB har priset " + products[0]);
                System.out.println("prodC har priset " + products[1]);
            } else {
                System.out.println("Pris måste vara ett positivt heltal.");
            }


        } else {
            System.out.println("Användarnamnet måste vara längre än 5 tecken.");
        }
    }


}
