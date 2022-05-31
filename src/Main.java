public class Main {

    public static void main(String[] args) {
        // присвоение значения массиву
        int[] arr = generateRandomArray();

        // далее можно работать с ним, печатать и что хотите
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
		 /*
       Задание 1
       Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
       Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
       в формате: «Сумма трат за месяц составила … рублей».
        */
        System.out.println(" Задача 1");
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        //for (int colum : arr){
        //            sum += colum;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        /*
       Задание 2
       Следующая задача — найти минимальную и максимальную трату за день.
       Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
       в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за
       день составила … рублей».
        */
        System.out.println(" Задача 2");
        int minExpense = 200000;
        int maxExpense = 10000;
        for (int i = 0; i < arr.length; i++) {
            int expense = arr[i];
            if (expense < minExpense) {
                minExpense = expense;
            }

            if (expense > maxExpense) {
                maxExpense = expense;

            }
        }

        System.out.println("Минимальная сумма трат за день  составила  " + minExpense + "руб.");
        System.out.println("Максимальная сумма трат за день  составила  " + maxExpense + "руб.");


    /*
     Задание 3
     А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
     Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть
     сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в
     формате: «Средняя сумма трат за месяц составила … рублей».
      */
        System.out.println(" Задача 3");
        double average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила  " + average + "руб.");

         /*
     Задание 4

      */
        System.out.println(" Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
                // Это последний член массива
            } else {
                System.out.print(reverseFullName[i] + " ");
            }
        }



    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;


    }

}

