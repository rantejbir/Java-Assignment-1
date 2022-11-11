import java.util.Scanner;
/**
 * 
 * @author Rantejbir Singh
 * @see MyHealthDataTest
 * Purpose: This is main class making an instance of MyHealthData and Scanner class.
 * It will get input from user and display their information and calculate their age and BMI.
 */
 public class MyHealthDataTest {
/**
 * 
 * @param args main args
 */
	public static void main(String[] args) {
		
		MyHealthData data = new MyHealthData("x", "x", "x", 1, 1, 1, 1);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println ("Please enter your First Name: ");
		data.setFirstName(input.next());
		
		System.out.println ("Please enter your Last Name: ");
		data.setLastName(input.next());
		
		System.out.println ("Please enter your Gender: ");
		data.setGender(input.next());
		
		System.out.println ("Please enter your Birth Year: ");
		data.setBirthYear(input.nextInt());
		
		System.out.println ("Please enter the Current Year: ");
		data.setCurrentYear(input.nextInt());
		
		System.out.println ("Please enter your height in Inches: ");
		data.setHeight(input.nextInt());
		
		System.out.println ("Please enter your weight: ");
		data.setWeight(input.nextDouble());
		
		data.displayMyHealthData();
		
	}
													
		

}
