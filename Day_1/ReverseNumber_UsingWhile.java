import java.util.Scanner;

public class ReverseNumber_UsingWhile {

	public static void main(String[] args) {
		int num = 0;
		int reverse_num = 0;
		System.out.print("Input Your Number and Press ENTER..: ");

		// Input
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		int temp=num;
		while (num != 0) {
			reverse_num *= 10;
			reverse_num += num % 10;
			num /= 10;
		}
		System.out.println("Reverse Number of "+temp+" is :"+reverse_num);
	}

}
