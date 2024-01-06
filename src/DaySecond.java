import java.util.Scanner;

public class DaySecond {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("First task\n");

            int levelCount = scanner.nextInt();

            if (levelCount > 0 && levelCount <= 4) {
                System.out.println("Малоэтажный дом");
            } else if (levelCount > 4 && levelCount <= 8) {
                System.out.println("Среднеэтажный дом");
            } else if (levelCount > 8) {
                System.out.println("Многоэтажный дом");
            } else {
                System.out.println("подземные парковки не строим");
            }

            System.out.println("_______________________ \n");
            System.out.println("Second task\n");

            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();

            if (firstNum >= secondNum) {
                System.out.println("Некорректный ввод");
            } else {
                for (int i = firstNum; i <= secondNum; i++) {
                    if (i % 5 == 0 && i % 10 != 0) {
                        System.out.print(" " + i);
                    }
                }
            }

            System.out.println("\n_______________________");
            System.out.println("Third task - with while\n");


            while (firstNum <= secondNum) {
                if (firstNum % 5 == 0 && firstNum % 10 != 0) {
                    System.out.print(" " + firstNum);
                }
                firstNum++;
            }
            System.out.println("\n_______________________");
            System.out.println("Four task\n  введите число формата double");

            double x = scanner.nextDouble();
            double y;


            if (x >= 5) {
                y = (Math.pow(x, 2) - 10) / (x + 7);
                System.out.println(y);

            } else if (x > -3 && x < 5) {
                y = (x + 3) * (Math.pow(x, 2) - 2);
                System.out.println(y);
            } else {
                y = 420;
                System.out.println(y);
            }


        }


    }
}
