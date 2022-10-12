import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		        boolean isContinue = true;
		while (isContinue) {
                    boolean isAValidInput = true;
                    Scanner userInput = new Scanner(System.in);
                    System.out.print("Enter Your Grade : ");
                    try {
                        double input = userInput.nextDouble();
                        if(input > 100 || input < 0) {
                                System.out.println("Enter A Valid Input Between 0 and 100");
                                isAValidInput = false;
                        }
                        if(isAValidInput) {
                                Grader A = new Grader(input);
                                System.out.println(A.letterGrade());
                        }
                        System.out.println("Do You Want To Continue ? (y/n)");
                        String isContinueInput = userInput.next();
                        if(isContinueInput.equals("n")){
                            isContinue = false;
                        }
                    }catch(Exception e) {
                            System.out.println("You  Must Enetr A Number!");
                    }
		}
		
		
	}
	
	

}
