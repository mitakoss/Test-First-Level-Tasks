import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristamsTree(getNumber());
    }


    public static int getNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Моля, въведете цяло положително число: ");
        int number = input.nextInt();

        if (number < 4 || number > 100) {
            System.out.println("Моля, въведете число в диапазона от 4 до 100.");
            getNumber();
        }

        return number;
    }

    public static void printChristamsTree(int n) {
        int stars = 1;
        int dots = 1;

        for (int i = 0; i < n - 2; i++) {
            dots += 2;
        }

        if ((n % 2) == 0) {
            n++;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < dots / 2; j++) {
                System.out.print(".");
            }
            for (int s = 0; s < stars; s++) {
                System.out.print("*");
            }
            for (int z = 0; z < dots / 2; z++) {
                System.out.print(".");
            }
            System.out.println();
            stars += 2;
            dots -= 2;
        }

        for (int i = 1; i < (n - 1) / 2; i++) {
            for (int j = 0; j < (stars % n) - 1; j++) {
                System.out.print(".");
            }
            for (int s = 0; s < stars / n; s++) {
                System.out.print("*");
            }
            for (int j = 0; j < (stars % n) - 1; j++) {
                System.out.print(".");
            }
            stars += 2;
            dots -= 2;
        }
    }
}