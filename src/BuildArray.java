import java.util.Scanner;

/**
 * Created by adavi on 31.07.2017.
 */
public class BuildArray {
    Scanner scanner = new Scanner(System.in);

    public int[] arrayBild() {

        boolean notTrueNumber = true;
        while (notTrueNumber) {
        System.out.println("Введіть парне число");
        int k = scanner.nextInt();


            if (k % 2 != 0) {
                System.out.println("Має бути введено парне число");
            } else {
                int arr[] = new int[k];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * 11) - 5;

                    System.out.print(arr[i]);
                    System.out.print(" ");
                    notTrueNumber = false;
                }
                return arr;
            }
        }
            return null;
    }
    public void equalsArray(int arr[]){

        int n = arr.length / 2;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n; i++){

            sumLeft+= arr[i];

        }
        for (int i = n; i < arr.length; i++){

            sumRight+= arr[i];
        }

        System.out.println();

        System.out.println(sumLeft + " - сума перших " + n + "-ти чисел\n" + sumRight + " - сума останніх " + n + "-ти чисел" );

        System.out.println(maxNumber(sumLeft,sumRight)  + " - більше число");

    }
    public int maxNumber(int number1, int number2){
        if (number1 > number2){
            return number1;
        }else{
            return number2;
        }
    }

}
