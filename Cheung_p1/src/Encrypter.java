
public class Encrypter {
	public static String encrypt(int numbers) {
		int first, second, third, fourth;
		
		first=numbers/1000;
		second=numbers /100 % 10;
		third=numbers/10 % 10;
		fourth=numbers % 10;
		
		first=(first+7)%10;
		second=(second+7)%10;
		third=(third+7)%10;
		fourth=(fourth+7)%10;
	
		String encrypted=""+third+fourth+first+second;
		
		return encrypted;
		
	}

}
