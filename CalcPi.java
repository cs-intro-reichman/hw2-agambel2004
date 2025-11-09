// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		double sum = 0.0;
		    for (int i = 0; i < num; i++) {
        		double term = Math.pow(-1, i) / (2.0 * i + 1.0);
        		sum += term;
			}
    	double approximated = 4.0 * sum;

    	System.out.println("pi according to Java: " + Math.PI);
    	System.out.println("pi, approximated:     " + approximated);
	}
}
