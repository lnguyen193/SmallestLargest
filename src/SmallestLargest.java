import java.util.Scanner;
public class SmallestLargest {
    public static void main(String[] args) {
        //Test Data
        //Input the 1st number: 25
        //Input the 2nd number: 78
        //Input the 3rd number: 87
        //
        //The smallest number: 25
        //The largest number: 87

        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();


        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest number: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest number: " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("The smallest number: " + num3);
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest: " + num2);

        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The greatest: " + num3);
        }
    }
}