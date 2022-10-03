import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Weekopdracht {
    public static void main(String[] args) throws IOException {

        PhoneService ps = new PhoneService();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            ps.printModels();

            int userInput = 0;
            boolean continueInput = true;

            do {
                try {
                    userInput = scanner.nextInt();
                    System.out.println();
                    continueInput = false;
                } catch (InputMismatchException ex) {
                    ps.errorMessage();
                    scanner.nextLine();
                }
            } while (continueInput);

            if (userInput == 6) {
                System.out.println("Programma afgesloten.");
                break;
            }

            ps.selectModel(userInput);
            System.out.println();

            ps.returnToList();

        } while (true);
    }
}