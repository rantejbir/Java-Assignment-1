import java.time.LocalDate;
/**
 * 
 * @author Rantejbir Singh
 * @see MyHealthData
 
 *
 */
public class MyHealthData {
	static LocalDate local =  LocalDate.now();

	/**
	 * First name
	 */
	private String firstName;
	/**
	 * Last name
	 */
	private	String lastName;
	/**
	 * Gender
	 */
	private	String gender;
	/**
	 * Year of birth
	 */
	private	int birthYear;
	/**
	 * Current year
	 */
	private	int currentYear;
	/**
	 * Height in inches
	 */
	private	double height;
	/**
	 * Weight in pounds 
	 */
	private	double weight;

	/**
	 * 
	 * @param firstName First name
	 * @param lastName Last name
	 * @param gender Gender
	 * @param height Height in inches
	 * @param weight Weight in pounds 
	 * @param birthYear Year of birth
	 * @param currentYear Current year
	 */
	public MyHealthData(String firstName,String lastName,String gender, double height,double weight,int birthYear,int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		this.height = height;
		this.weight = weight;	
	}

	/**
	 * 
	 * @return First name
	 */
	public String getFirstName() {
		return firstName;
	}


/**
 * 
 * @param firstName Value of firstName
 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * 
	 * @return Last name
	 */
	public String getLastName() {
		return lastName;
	}


/**
 * 
 * @param lastName Value of lastName
 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


/**
 * 
 * @return Gender
 */
	public String getGender() {
		return gender;
	}


/**
 * 
 * @param gender Value of Gender
 */
	public void setGender(String gender) {
		this.gender = gender;
	}


/**
 * 
 * @return birthYear
 */
	public int getBirthYear() {
		return birthYear;
	}


/**
 * 
 * @param birthYear Value of birthYear
 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


/**
 * 
 * @return currentYear
 */
	public int getCurrentYear() {
		return currentYear;
	}

/**
 * 
 * @param currentYear Value of currentYear
 */

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}


/**
 * 
 * @return height
 */
	public double getHeight() {
		return height;
	}


/**
 * 
 * @param height Value of height
 */
	public void setHeight(double height) {
		this.height = height;
	}

/**
 * 
 * @return weight
 */

	public double getWeight() {
		return weight;
	}


/**
 * 
 * @param weight Value of weight
 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * 
	 * @return calculated age
	 */
	public int getAge() {
		int currentYear = local.getYear();
		int result = currentYear - birthYear;
		return result;	
	}
 /**
  * 
  * @return MaximumHeartRate
  */
	
	public int getMaximumHeartRate() {
		int result = 220 - getAge();
		return result;
	}
	
	/**
	 * 
	 * @return MinimumTargetHeartRate
	 */
	public double getMinimumTargetHeartRate() {
		double result = getMaximumHeartRate() * 0.5;
		return result;	
	}
	
	/**
	 * 
	 * @return MaximumTargetHeartRate
	 */
	public double getMaximumTargetHeartRate() {
		double result = getMaximumHeartRate() * 0.85;
		return result;
	}
	/**
	 * 
	 * @return Calculated value of BMI
	 */
		
	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

/**
 * Display patients information and getMaximumTargetHeartRate, getMinimumTargetHeartRate, getMaximumHeartRate and getBMI values
 */
	public void displayMyHealthData() 
	{ 

	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");  
	   System.out.println();
	   
	   System.out.printf("Dear %s %s, here are your details: \n", getFirstName(), getLastName());
	   System.out.printf("Age: %d\n",getAge());
	   System.out.printf("Gender: %s\n",getGender());
	   System.out.printf("Height: %f\n",getHeight());
	   System.out.printf("Weight: %f\n",getWeight());
	   System.out.printf("MaximumHeartRate : %d\n",getMaximumHeartRate());
	   System.out.printf("MinimumTargetHeartRate: %f\n",getMinimumTargetHeartRate());
	   System.out.printf("MaximumTargetHeartRate: %f\n",getMaximumTargetHeartRate());
	   
	   System.out.printf("Your calculated BMI : %f",getBMI());
	   
	   
	} 

}
