public class XORCipher {
	
	private static String cryption(String message,String title) {
		StringBuilder output = new StringBuilder();
		int lenght = Math.max(message.length(), title.length());
		
		for (int i = 0; i < lenght; i++) {
			output.append(((char) (message.charAt(i % message.length()) ^ title.charAt(i % title.length())))+0);
			output.append(", ");
		}
		System.out.println(output);

		return "";
	}

	public static void main(String[] args) {
		cryption("This is a password.", "password");
		
	}

}
