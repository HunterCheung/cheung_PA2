
public class Decrypter {
	public static String decrypt(int numbers) {
		int first, second, third, fourth;
		
		first=numbers/1000;
		second=numbers/100 % 10;
		third=numbers/10 % 10;
		fourth=numbers%10;
		
		int swap1=0,swap2=0;
		swap1=first;
		first=third;
		third=swap1;
		swap2=second;
		second=fourth;
		fourth=swap2;
		
		if(first<7) {
			first=first+10;
		}
		if(second<7) {
			second=second+10;
		}
		if(third<7) {
			third=third+10;
		}
		if(fourth<7) {
			fourth=fourth+10;
		}
		
		first=(first-7)%10;
		second=(second-7)%10;
		third=(third-7)%10;
		fourth=(fourth-7)%10;
		
		String decrypted=""+first+second+third+fourth;

		return decrypted;
	}

}
