package T5;

public class Ex1 {

    public static void main(String arg[]) {

        double value = 0;

        try {
            value = Math.sqrt(-2);
        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException error");

        }

        System.out.println(value);

    }

}
