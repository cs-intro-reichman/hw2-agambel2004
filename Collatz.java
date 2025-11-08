// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            int n = seed;
            int steps = 1; 
			if (verbose){
				System.out.print(n);
			}
			while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                steps++;
                if (verbose){
					System.out.print(" " + n);
				}
            }
			 if (verbose) {
                System.out.println(" (" + steps + ")");
            }
		}
	System.out.println("Every one of the first " + N +
	" hailstone sequences reached 1.");
	}
}

