import java.util.*;

class Decoder {

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);

		String keyphrase = scanner.nextLine();
		String encoded = scanner.nextLine();
		String decoded = "";
		String[] encodedArray = encoded.split(" ");

		for(int i = 0; i < encodedArray.length; i++) {
			decoded = decoded + keyphrase.charAt(Integer.parseInt(encodedArray[i]));
		}

		System.out.println(decoded);
	}
}