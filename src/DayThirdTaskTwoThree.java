import java.util.Scanner;

public class DayThirdTaskTwoThree {

public static void taskTwo() {
        try (Scanner sc = new Scanner(System.in)){
               while (sc.hasNext()) {
                    if(sc.hasNextDouble() || sc.hasNextInt()) {
                        double dividend = sc.nextDouble();
                        double divisor = sc.nextDouble();
                        if (divisor == 0) {
                            System.out.println("нельзя делить на 0");

                        }
                        System.out.println(dividend / divisor);

                        } else {
                        System.out.println("Неверный ввод");
                        break;
                    }
                }
            }
    }

    public static void taskThree (){
    try (Scanner sc = new Scanner(System.in)){
        int count = 0;
        while (count < 5){
            double divid = sc.nextDouble();
            double divis = sc.nextDouble();
            if (divis == 0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(divid / divis);
            count++;
        }
    }
    }


    public static void main(String[] args) {

     taskTwo();
     taskThree();
 }
        }


