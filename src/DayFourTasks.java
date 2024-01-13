import java.util.Random;
import java.util.Scanner;

public class DayFourTasks {

    public static void firstTask() {
        int arraySize;
        try (Scanner sc = new Scanner(System.in)) {
            arraySize = sc.nextInt();
        }
        int[] array = new int[arraySize];
        Random random = new Random();

        int moreThanEight = 0;
        int equalOne = 0;
        int even = 0;
        int odd = 0;
        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            arraySum += array[i];
            if (array[i] > 8) {
                moreThanEight++;
            }
            if (array[i] == 1) {
                equalOne++;
            }
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        for (int i : array) {
            System.out.print(i);
        }
        System.out.printf("\nДлина массива: - %d\n" +
                "Количество чисел больше 8: - %d\n" +
                "Количестве чисел равных 1 - %d\n" +
                "Количестве четных чисел - %d \n" +
                "Количестве нечетных чисел - %d\n" +
                "Сумме всех элементов массива - %d\n", array.length, moreThanEight, equalOne, even, odd, arraySum);
    }


    public static void secondTask() {
        int[] array = new int[100];
        Random random = new Random();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sumOfTen = 0;
        int countOfTen = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);

        }
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            if (i % 10 == 0) {
                countOfTen++;
                sumOfTen += i;
            }
            System.out.print(i + " ");
        }
        System.out.printf("\nнаибольший элемент массива: - %d\n" +
                        "наименьший элемент массива: - %d\n" +
                        "количество элементов массива, оканчивающихся на 0 - %d\n" +
                        "сумму элементов массива, оканчивающихся на 0 - %d \n"
                , max, min, countOfTen, sumOfTen);
    }

    public static void thirdTask() {
        int fistArraySize;
        int secondArraySize;

        Random random = new Random();

        try (Scanner sc = new Scanner(System.in)) {
            fistArraySize = sc.nextInt();
            secondArraySize = sc.nextInt();
        }
        int[][] arrayOuter = new int[fistArraySize][secondArraySize];

        int sum = 0;
        int index = 0;


        for (int i = 0; i < arrayOuter.length; i++) {
            int sumArray = 0;
            for (int t = 0; t < arrayOuter[i].length; t++) {
                arrayOuter[i][t] = random.nextInt(51);
                sumArray += arrayOuter[i][t];
                System.out.printf("[%d]", arrayOuter[i][t]);
            }
            System.out.println();
            if (sumArray >= sum) {
                sum = sumArray;
                index = i;
            }
        }

        System.out.printf("Сумма чисел в наибольшем массиве - %d\n" +
                "Индекс массива - %d\n", sum, index);

    }

    public static void fourthTask(){
        Random random = new Random();
          int[] array = new int[10];
          for(int i = 0; i < array.length;i++){
              array[i] = random.nextInt(10001);
              System.out.print("[" + array[i] + "]");
          }

          int maxSum = 0;
          int indexMaxSum = 0;

          for(int i = 0; i < array.length - 2; i++){
              int maxSum1 = array[i] + array[i + 1] + array[i + 2];
              if(maxSum1 > maxSum) {
                  maxSum = maxSum1;
                  indexMaxSum = i;
              }
          }
        System.out.printf(" \nСумма большего подмассива из 3 - %d, индекс - %d", maxSum, indexMaxSum);
    }

    public static void main(String[] args) {
        //   firstTask();
        // secondTask();
        // thirdTask();
        fourthTask();
    }

}

