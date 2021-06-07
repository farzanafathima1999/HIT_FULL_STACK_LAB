import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("ENTER THE LENGHT:");
		double lenght = scan.nextDouble();

		System.out.println("ENTER THE WIDTH:");
		double width = scan.nextDouble();

		double area = lenght * width;
		System.out.println("Area of Rectangle is :" + area);

	}
}
