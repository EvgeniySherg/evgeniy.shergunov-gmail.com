import java.util.Scanner;

public class DayThirdTaskOne {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
             while (scanner.hasNext()){
               String scannerString = scanner.nextLine();
               if (!scannerString.equals("Stop")){
                     switch (scannerString) {
                         case "Москва":
                         case "Владивосток":
                         case "Ростов":
                             System.out.println("Россия");
                             break;
                         case "Рим":
                         case "Милан":
                         case "Турин ":
                             System.out.println("Италия");
                             break;
                         case "Ливерпуль":
                         case "Манчестер":
                         case "Лондон":
                             System.out.println("Англия");
                             break;
                         case "Берлин":
                         case "Мюнхен":
                         case "Кёльн":
                             System.out.println("Германия");
                             break;
                         default:
                             System.out.println("Неизвестный ввод");
                             break;
                     }
                 } else {
                   break;
               }
            }
            }
        }
    }
