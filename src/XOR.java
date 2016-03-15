public class XOR {

	public static void main(String[] args) {
		String password="";//password
		char message[] = {};//key
		char[] key = password.toCharArray();
		
		int l = message.length;
		int l1 = key.length;
		
		
		for(int i=0;i<l;i++) {
			message[i] = (char) (message[i] ^ key[i% l1]);
		}
		
		System.out.println(message);
	
	
	}
	
	

}
