import java.util.Scanner;

public class SumOfArrayElements {
        public static void main(String[] args)
        {
            System.out.println("Please enter 10 values");

            Scanner scanner = new Scanner(System.in);

            int[] my_array = new int[10];

            for (int i = 0; i < my_array.length; i++){
                my_array[i] = scanner.nextInt();
            }

            int sum_of_elements = 0;

            for (int k : my_array){
                sum_of_elements += k;
            }

            System.out.println("Sum of elements is:" + sum_of_elements);
        }
}