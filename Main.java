import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many points did you achieve in the exam?");
    int points = scanner.nextInt();

    if (points <= 50) {
        System.out.println("You must learn more");
    } else if (points > 50 && points <= 70) {
        System.out.println("Mid result");
    } else if (points > 70) {
        System.out.println("Good job!");
    }

    scanner.close();
}
}