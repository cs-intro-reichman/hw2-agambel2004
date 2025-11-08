// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		double sum = 0;
		int diviser = 3;
		boolean add = true;

		for(int i = 1; i < num ; i++){
			double fraction = 1.0 / diviser;
			if(add == true){
				sum = sum + fraction;
			}else {
				sum = sum - fraction;
			}
			add =! add;
			diviser = diviser + 2;
		}
		double approximated = (1 - sum) * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + approximated);
	}
}
