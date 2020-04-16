import java.util.Arrays;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);


        System.out.println("Input the 1st test score: ");
        int num1 = keybd.nextInt();

        System.out.println("Input the 2nd test score: ");
        int num2 = keybd.nextInt();

        System.out.println("Input the 3rd test score: ");
        int num3 = keybd.nextInt();

        System.out.println("Input the 4th test score: ");
        int num4 = keybd.nextInt();

        System.out.println("Input the 5th test score: ");
        int num5 = keybd.nextInt();

        System.out.println("Input the 6th test score: ");
        int num6 = keybd.nextInt();

        System.out.println("Input the 7th test score: ");
        int num7 = keybd.nextInt();

        System.out.println("Input the 8th test score: ");
        int num8 = keybd.nextInt();

        System.out.println("Input the 9th test score: ");
        int num9 = keybd.nextInt();

        System.out.println("Input the 10th test score: ");
        int num10 = keybd.nextInt();

        int testScores[] = {
                num1, num2, num3, num4, num5, num6, num7, num8, num9, num10
        };
        System.out.println(Arrays.toString(testScores));

        // Test every number to find and print the highest score
        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5) && (num1 > num6) && (num1 > num7) && (num1 > num8) && (num1 > num9) && (num1 > num10)) {
            System.out.println("The highest score is: " + num1);
        } else if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5) && (num2 > num6) && (num2 > num7) && (num2 > num8) && (num2 > num9) && (num2 > num10)) {
            System.out.println("The highest score is: " + num2);
        } else if ((num3 > num2) && (num3 > num1) && (num3 > num4) && (num3 > num5) && (num3 > num6) && (num3 > num7) && (num3 > num8) && (num3 > num9) && (num3 > num10)) {
            System.out.println("The highest score is: " + num3);}
        else if ((num4 > num2) && (num4 > num3) && (num4 > num1) && (num4 > num5) && (num4 > num6) && (num4 > num7) && (num4 > num8) && (num4 > num9) && (num4 > num10)) {
            System.out.println("The highest score is: " + num4);
        } else if ((num5 > num2) && (num5 > num3) && (num5 > num4) && (num5 > num5) && (num5 > num6) && (num5 > num7) && (num5 > num8) && (num5 > num9) && (num5 > num10)) {
            System.out.println("The highest score is: " + num5);
        } else if ((num6 > num1) && (num6 > num3) && (num6 > num4) && (num6 > num5) && (num6 > num2) && (num6 > num7) && (num6 > num8) && (num6 > num9) && (num6 > num10)) {
            System.out.println("The highest score is: " + num6);
        } else if ((num7 > num2) && (num7 > num1) && (num7 > num4) && (num7 > num5) && (num7 > num6) && (num7 > num3) && (num7 > num8) && (num7 > num9) && (num7 > num10)) {
            System.out.println("The highest score is: " + num7);}
        else if ((num8 > num2) && (num4 > num3) && (num4 > num1) && (num4 > num5) && (num4 > num6) && (num4 > num7) && (num4 > num8) && (num4 > num9) && (num4 > num10)) {
            System.out.println("The highest score is: " + num8);
        } else if ((num9 > num2) && (num5 > num3) && (num5 > num4) && (num5 > num5) && (num5 > num6) && (num5 > num7) && (num5 > num8) && (num5 > num9) && (num5 > num10)) {
            System.out.println("The highest score is: " + num9);
        } else {
            System.out.println("The highest score is: " + num10);
        }


        // Test every number to find and print the lowest score
        if ((num1 < num2) && (num1 < num3) && (num1 < num4) && (num1 < num5) && (num1 < num6) && (num1 < num7) && (num1 < num8) && (num1 < num9) && (num1 < num10)) {
            System.out.println("The lowest score is: " + num1);
        } else if ((num2 < num1) && (num2 < num3) && (num2 < num4) && (num2 < num5) && (num2 < num6) && (num2 < num7) && (num2 < num8) && (num2 < num9) && (num2 < num10)) {
            System.out.println("The lowest score is: " + num2);
        } else if ((num3 < num2) && (num3 < num1) && (num3 < num4) && (num3 < num5) && (num3 <num6) && (num3 < num7) && (num3 < num8) && (num3 < num9) && (num3 < num10)) {
            System.out.println("The lowest score is: " + num3);}
        else if ((num4 < num2) && (num4 < num3) && (num4 < num1) && (num4 < num5) && (num4 < num6) && (num4 < num7) && (num4 < num8) && (num4 < num9) && (num4 < num10)) {
            System.out.println("The lowest score is: " + num4);
        } else if ((num5 < num2) && (num5 < num3) && (num5 < num4) && (num5 < num5) && (num5 < num6) && (num5 < num7) && (num5 < num8) && (num5 < num9) && (num5 < num10)) {
            System.out.println("The lowest score is: " + num5);
        } else if ((num6 < num1) && (num6 < num3) && (num6 < num4) && (num6 < num5) && (num6 < num2) && (num6 < num7) && (num6 < num8) && (num6 < num9) && (num6 < num10)) {
            System.out.println("The lowest score is: " + num6);
        } else if ((num7 < num2) && (num7 < num1) && (num7 < num4) && (num7 < num5) && (num7 < num6) && (num7 < num3) && (num7 < num8) && (num7 < num9) && (num7 < num10)) {
            System.out.println("The lowest score is: " + num7);}
        else if ((num8 < num2) && (num4 < num3) && (num4 < num1) && (num4 < num5) && (num4 < num6) && (num4 < num7) && (num4 < num8) && (num4 < num9) && (num4 < num10)) {
            System.out.println("The lowest score is: " + num8);
        } else if ((num9 < num2) && (num5 < num3) && (num5 < num4) && (num5 < num5) && (num5 < num6) && (num5 < num7) && (num5 < num8) && (num5 < num9) && (num5 < num10)) {
            System.out.println("The lowest score is: " + num9);
        } else {
            System.out.println("The lowest score is: " + num10);
        }

        int total = 0;
            for (int i = 0; i < 10; i++) {
                total = total + testScores[i];
            }
            System.out.println("The Average score is " + total / testScores.length);
    }
}