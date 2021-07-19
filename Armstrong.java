import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum, temp, power, digit, sum = 0;

        System.out.print("Enter a number: ");
        userNum = scan.nextInt();
        temp = userNum;


        for (power = 0; temp > 0; power++){      //Counts how many digits there are
            temp /= 10;
        }

        while (temp > 0) {
            digit = temp % 10;
            temp /= 10;
            sum += Math.pow(digit, power);
        }

        if (userNum == sum) {
            System.out.println(userNum + " is an Armstrong number");
        }
        else {
            System.out.println(userNum + " is NOT an Armstrong number");
        }
        
    }
}


/* 
1. Count digits  > count = power
2. Split the number into single digits 
3. Raise each digit to > Math.pow(digit, power);
*/