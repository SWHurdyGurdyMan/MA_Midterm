import java.util.*;
public class StringsAndCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a double-lettered string: ");
		String word = input.nextLine();
		for(int i = 0; i < word.length(); i++) {
			for(int x = i + 1; x < word.length(); x++) {
				char firstCharacter = word.charAt(i);
				char secondCharacter = word.charAt(x);
				if(firstCharacter == secondCharacter) {
					word = word.replace(secondCharacter, ' ');
				}
			}
		}
		System.out.println(word);
		input.close();
	}
}