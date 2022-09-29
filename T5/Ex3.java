package T5;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner myscanner = new Scanner(System.in);
        int size;
        int count = 0;
        int total = 0;
        float avg;

        try {
            System.out.println("Enter size of data : ");
            size = myscanner.nextInt();

            int data[] = new int[size];
            int index;

            System.out.print("Enter Index : ");
            index = myscanner.nextInt();

            while (index != -1) {

                System.out.print("Enter a marks : ");
                data[index] = myscanner.nextInt();

                count++;
                total += data[index];
                System.out.print("Enter Index : ");
                index = myscanner.nextInt();
            }
            for (int r = 0; r < size; r++)
                System.out.println(r + " - " + data[r]);

            avg = (float) total / count;

            System.out.println("Average : " + avg);
        } catch (InputMismatchException e) {
            System.out.println("Input type mismatch error");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException error");
        }
    }
}
