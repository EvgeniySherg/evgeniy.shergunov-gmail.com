

public class DayFirst {
    public static void main(String[] args) {
        System.out.print("First homework");


        System.out.println("First task - while \n");
        int count = 0;
        while (count < 10) {
            System.out.print("Java ");
            count++;
        }
        System.out.println("\n__________________________");

        System.out.println("Second task - for \n");
        for (int i = 0; i < 10; i++) {
            System.out.print("Java " );
        }
        System.out.println("\n__________________________");

        System.out.print("Third task - for or while");
        for (int i = 0; i < 10; i++) {
            System.out.println("Java " );
        }
        System.out.println("__________________________");

        System.out.println("Four task - olimpic games \n");
        int countYear = 1980;
        while (countYear <= 2020) {
            System.out.printf("Олимпиада - %d года \n", countYear);
            countYear += 4;
        }
        System.out.println("__________________________");

        System.out.print("Fifth task - olimpic games with for");
        for (int i = 1980; i <= 2020; i+=4) {
            System.out.printf("Олимпиада - %d года \n", i);
        }
        System.out.println("__________________________");

        System.out.print("Six task - multiplication table");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("5 x %d = %d\n", i, i*5);
        }
        System.out.println("__________________________");
    }
}