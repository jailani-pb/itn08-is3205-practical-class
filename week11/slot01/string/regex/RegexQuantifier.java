package week11.slot01.string.regex;

public class RegexQuantifier {

	public static void main(String[] args) {
		String random = "AAAAbbbTYoooplkgtoooop";
		
		System.out.println(random.replaceAll("ooop", "####"));
		System.out.println(random.replaceAll("o{3}p", "####"));
		System.out.println(random.replaceAll("o{4}p", "#####"));
		System.out.println(random.replaceAll("o{3,}p", "#"));
		
		System.out.println(random.replaceAll("[Ao]{4,}", "#"));
		
		String[] sict = {"IS3205", "IS4308", "NS3304", "NS3302", "LC3211", "DM1222",
				"DMEABC", "1234IS", "55LC23", "OOP123"};
		
		for(String module : sict) {
//			String pattern = "[A-Z][A-Z][1-6][0-9][0-9][0-9]";
			String pattern = "[A-Z]{2}[1-6][0-9]{3}";
			System.out.println(module + ": " + module.matches(pattern));
		}
	}
	
}
