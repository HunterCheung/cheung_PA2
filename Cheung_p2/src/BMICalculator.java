//Pseudocode
//First prompt the user to imput which formula they want to use for BMI
//then call methods to record their height/weight depending on metric/imperial
//call upon other methods in order to calculate the BMI and decide their category
import java.util.Scanner;

public class BMICalculator {
	Scanner scan = new Scanner(System.in);
		double weight;
		double height;
		double bmi;
		int choice=0;
		String bmiCategory;
		int number=0;
		
	public void readUserData() {
			int number=readUnitType();
			System.out.println(number);
			readMeasurementdata(number);
			calculateBmi();
	}
	private int readUnitType() {
		while(choice!=1 && choice!=2) {
			System.out.println("1. BMI= weightKilograms/heightMeters");
			System.out.println("2. BMI= (703 * weightPounds)/(heightInches)^2");
			System.out.printf("Enter which formula to use (1 or 2): ");
				choice=scan.nextInt();
			switch(choice) {
			case 1 :
				number=1;
				break;
			case 2 :
				number=2;
				break;
			default :
				System.out.println("Enter valid option");
			}
					
		}
		return number;
	}
	
	private void readMeasurementdata(int number) {
		if(number==1) {
			readMetricData();
		}
		else
		readImperialData();
	}
	
	private void readMetricData() {
		System.out.println("Enter weight in kilograms: ");
		weight=scan.nextDouble();
		if(weight<0) {
			return;
		}
		System.out.println("Enter height in meters: ");
		height=scan.nextDouble();
		if(height<0) {
			return;
		}
	}
	
	private void readImperialData() {
		System.out.println("Enter weight in pounds: ");
		weight=scan.nextDouble();
		if(height<0) {
			return;
		}
		System.out.println("Enter height in inches: ");
		height=scan.nextDouble();
		if(height<0) {
			return;
		}
	}
	
	public void calculateBmi() {
		if(number==1) {
			bmi=(weight/(height*height));
		}
		else
			bmi=703*weight / (height*height);
		calculateBmiCategory(bmi);
	}
	
	private void calculateBmiCategory(double bmi) {
		if(bmi<18.5) {
			bmiCategory="Underweight";
		}
		if(bmi>18.5 && bmi<24.9) {
			bmiCategory="Normal Weight";
		}
		if(bmi>25 && bmi<29.9) {
			bmiCategory="Overweight";
		}
		if(bmi>=30) {
			bmiCategory="Obese";
		}
	}
	
	public void displayBmi() {
		System.out.println("BMI Value is: "+bmi);
		System.out.println("BMI Category is: "+bmiCategory);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
			
	}
	

}
