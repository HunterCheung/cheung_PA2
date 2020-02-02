//Pseudocode
//Idea is  to create a program that encrypts/decrypts a 4 digit integer from user input
//must take the 4 digit input and add 7 to each digit, if value is >=10 must take remainder
//for value then swap values
//to decrypt the input must swap first, then add 10 to each digit, then subtract 7 from each
//digit, following this the remainders need to be taken for any digit >=7 prior to adding 10
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		System.out.printf("Enter a 4 digit integer to be decrypted/encrypted: ");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		int numbers;
		numbers = Integer.parseInt(number);
		System.out.println("Encrypted number is "+Encrypter.encrypt(numbers));
		System.out.println("Decrypted number is "+Decrypter.decrypt(numbers));
	}

}
