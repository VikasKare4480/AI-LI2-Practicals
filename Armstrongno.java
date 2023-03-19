import java.util.Scanner;

public class Armstrongno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print(" Enter No to find is Armstrin of Not :");

        int num = sc.nextInt();

        int temp = num;

        for (int i = 1; i <= num; i++) {

            int rem = num % 10; // for accsing the last digit of the number

            sum = sum + (rem * rem * rem);

            num = num / 10; // for decreasing the num by single digit at the end by single digit

        }

        if (sum == temp) {

            System.out.println(temp + " is armstrong no ");

        } else {

            System.out.println(temp + " is not armastrong no ");
        }
    }

}