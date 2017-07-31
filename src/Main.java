import java.util.Scanner;

/**
 * Created by adavi on 31.07.2017.
 */
public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BuildArray array = new BuildArray();





        int [] myArray = array.arrayBild();

        array.equalsArray(myArray);
    }
}
