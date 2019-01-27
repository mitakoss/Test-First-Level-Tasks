import java.util.Scanner;

public class Molly {
    public static void main(String[] args) {
        printResult(getSecretKey(getNumberA(), getNumberB(), getNumberC()));
    }

    public static int getNumberA() {
        int numberA = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Моля, въведете цяло положително число за 'А': ");
        numberA = input.nextInt();

        return numberA;
    }

    public static int getNumberB() {
        int numberB = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Моля, въведете цяло положително число за 'B': ");
        numberB = input.nextInt();

        return numberB;
    }

    public static int getNumberC() {
        int numberC = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Моля, въведете цяло положително число за 'C': ");
        numberC = input.nextInt();

        return numberC;
    }

    public static int getSecretKey(int a, int b, int c) {
        int result = 0;

        if (b == 2) {
            result = a % c;
        } else if (b == 4) {
            result = a + c;
        } else if (b == 8) {
            result = a * c;
        }

        return result;
    }

    public static void printResult(int result) {
        if ((result % 4) == 0) {
            System.out.println(result / 4);
            System.out.println(result);
        } else if ((result % 4) != 0) {
            System.out.println(result % 4);
            System.out.println(result);
        }
    }
}
