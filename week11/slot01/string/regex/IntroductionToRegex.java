package week11.slot01.string.regex;

public class IntroductionToRegex {

	public static void main(String[] args) {
		String is3205 = "IS3205 Object Oriented Programming";
		System.out.println(is3205.replaceAll("O", "Z"));
		System.out.println(is3205);
		System.out.println(is3205.replaceAll("Ob", "Z"));
		System.out.println(is3205.replaceAll("O", "Z").replaceAll("o", "Z"));
		
		// Making use of regex
		System.out.println(is3205.replaceAll(".", "Z"));
		System.out.println(is3205.replaceAll("[Oo]", "Z"));
		
		System.out.println(is3205.matches("IS3205.*"));
		System.out.println(is3205.matches("IS3205............................"));
		
		String code = "IS3205";
		System.out.println(code.matches("IS3205.*"));
		System.out.println(code.matches("IS3205............................"));
		
	}
	
}
