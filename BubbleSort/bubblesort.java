import java.util.Scanner;

//program to sort the elements of an array
class bubblesort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter array elements");
		int n = arr.length;
		// input the elements into an array
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int temp;
		// bubble sorting
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// print the sorted array
		System.out.println("sorted arry is");
		for (int j = 0; j < n; j++) {
			System.out.println(arr[j]);
		}
	}
}