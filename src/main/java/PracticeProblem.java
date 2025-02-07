import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		String firstChar = scanner.nextLine();
		System.out.println(firstChar.charAt(0));
		scanner.close();
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		boolean inverse = scanner.nextBoolean();
		scanner.nextLine();
		System.out.println(!inverse);
		scanner.close();
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		int check = scanner.nextInt();
		scanner.nextLine();
		System.out.println(check > 5);
		scanner.close();
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		double check = scanner.nextDouble();
		scanner.nextLine();
		System.out.println(-2 <= check && check <= 2);
		scanner.close();
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		String check = scanner.nextLine();
		System.out.println(check.equals("Hello World"));
		scanner.close();
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		int first = scanner.nextInt();
		scanner.nextLine();
		System.out.print("In: ");
		int second = scanner.nextInt();
		System.out.println(first <= second);
		scanner.close();
	}

	public static void q7() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		double first = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("In: ");
		double second = scanner.nextDouble();
		scanner.nextLine();
		System.out.println(first > second);
		scanner.close();
	}

}
