import java.util.scanner;

// program to claculate the square of a number
class sq {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sq = square(num);
		System.out.println("Square =" + sq);
	}// method to calculate square of a number and return it

	public static int square(int number) {
		int square = number * number;
		return square;
	}
}