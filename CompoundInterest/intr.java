import java.util.*;

//program to calculate simpleinterest and compound interest
class intr {
	public static void main(String[] args) {
		double p, t, r, ci, si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of p");
		p = sc.nextDouble();
		System.out.println("Enter value of p");
		t = sc.nextDouble();
		System.out.println("Enter value of r");
		r = sc.nextDouble();
		// simple interest
		si = (p * t * r) / 100;
		// compound interest
		ci = p * Math.pow(1.0 + r / 100.0, t) - p;
		System.out.println("si=" + si);
		System.out.println("ci=" + ci);
	}
}