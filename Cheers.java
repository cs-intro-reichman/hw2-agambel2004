//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String str = args[0];
                int num = Integer.parseInt(args[1]);
                String upper = str.toUpperCase();


                for(int i = 0; i < upper.length(); i++){
                       if ("AEFHILMNORSX".indexOf(upper.charAt(i)) >= 0) {
                        System.out.print("Give me an " + upper.charAt(i) + ": ");
                       }else {
                        System.out.print("Give me a  " + upper.charAt(i) + ": ");
                       }
                         System.out.println(upper.charAt(i)+ "!");
                }

                System.out.println("What does that spell?");

                for(int j = 0 ; j < num ; j++){
                        System.out.println(upper + "!!!");
                }
                

        }
}
