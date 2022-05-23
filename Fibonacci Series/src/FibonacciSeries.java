
public class FibonacciSeries {
	static int fib(int n)
	{
		// Base Case
		if (n <= 1)
			return n;

		// Recursive call
		return fib(n - 1)
			+ fib(n - 2);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given Number N
		int N = 10;

		// Print the first N numbers
		for (int i = 0; i < N; i++) {

			System.out.print(fib(i) + " ");

	}

  } 
}
