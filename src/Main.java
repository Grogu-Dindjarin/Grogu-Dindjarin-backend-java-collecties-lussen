import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht
    Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
    String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
    String invalid = "ongeldige invoer";
    Scanner scanner = new Scanner(System.in);

    Translator translator = new Translator(alphabetic, numeric);

    boolean play = true;
    while (play) {
        System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
        String input = scanner.nextLine();
        if (Objects.equals(input, "x")) {
            play = false;
            scanner.close(); // Closing the scanner when terminating the program
        } else if (Objects.equals(input, "v")) {
            System.out.println("Type een cijfer in van 0 t/m 9");
            int number;
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(invalid);
                continue; // Skip to the next iteration of the loop
            }

            if (number >= 0 && number <= 9) {
                String result = translator.translate(number);
                System.out.println("De vertaling van " + number + " is " + result);
            } else {
                System.out.println(invalid);
            }
        }
    }

    }
}
