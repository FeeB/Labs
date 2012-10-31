public class TwentyBits {

	static long number = 1048576;
	// static long num = 1048577;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		TwentyBits.computePrime();
		System.out.println("Time: " + (System.currentTimeMillis() - start));
	}

	public static void computePrime() {
		for (long i = number; i < number +100; i++) {
			boolean prime = true;
			for (long j = 2; j < number + 100; j++) {
				if (i != j && i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i + " is a prime number!");
			}
			// else {
			// System.out.println(i + " is not a prime number!");
			// }
		}
	}
}