import java.util.Scanner;

public class Main {

    public static void main (String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = sc.nextLine();

        int count = 0;

        String lowerCase = input.toLowerCase();

        for (char c : lowerCase.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        sc.close();
    }
}