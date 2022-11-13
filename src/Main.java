import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);//get value from user
        System.out.print("pls enter first number for combination: ");//get value from user
        int num1 = dat.nextInt();
        System.out.print("pls enter second number (must be smaller than first number) for combination: ");//get value from user
        int num2 = dat.nextInt();

        long num1f = 1;//factorial for first number
        long num2f = 1;//factorial for second number
        long numf = 1;//factorial for subtract num1 and num2

        for (int i = 1; i <= num1; i++) {//for loop for factorial for first number
            num1f = num1f * i;
        }

        for (int i = 1; i <= num2; i++) {//for loop for factorial for second number
            num2f = num2f * i;
        }

        for (int i = 1; i <= (num1 - num2); i++) {//for loop for factorial for subtract num1 and num2
            numf = numf * i;
        }

        System.out.println("C(" + num1 + "," + num2 + ")= " + (num1f / (num2f * numf)));//calculate combination
    }
}
