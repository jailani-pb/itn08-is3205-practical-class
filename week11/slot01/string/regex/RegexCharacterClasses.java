package week11.slot01.string.regex;

public class RegexCharacterClasses {

	public static void main(String[] args) {
		String is3205 = "IS3205 Object Oriented Programming";
		System.out.println(is3205);
		
		// Replace letter a, i OR o TO #
		System.out.println(is3205.replaceAll("[aio]", "#"));
		
		// Replace letter Ob, ob, Or, or, Og OR og to ##
		System.out.println(is3205.replaceAll("[Oo][brg]", "##"));
		
		// Replace any characters that is not a, i OR o TO #
		System.out.println(is3205.replaceAll("[^aio]", "#"));
		System.out.println(is3205.replaceAll
				("[bcdefghjklmnpqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ]", "#"));
		
		// Replace lowercase letters to #
		System.out.println(is3205.replaceAll("[a-z]", "#"));
		
		// Replace uppercase letters to #
		System.out.println(is3205.replaceAll("[A-Z]", "#"));
		
		// Replace lowercase and uppercase letters to #
		System.out.println(is3205.replaceAll("[a-zA-Z]", "#"));
		
		// Replace all numbers to #
		System.out.println(is3205.replaceAll("[0-9]", "#"));
		
		System.out.println(is3205.replaceAll("[b-hj-np-zA-Z0-9 ]", "#"));
		System.out.println(is3205.replaceAll("[a-zA-Z0-9 &&[^aio]]", "#"));
		System.out.println(is3205.replaceAll("[a-zA-Z0-9&&[^aio]]", "#"));
		
		String[] sict = {"IS3205", "IS4308", "NS3304", "NS3302", "LC3211", "DM1222",
				"DMEABC", "1234IS", "55LC23", "OOP123"};
		
		for(String module : sict) {
			String pattern = "[A-Z][A-Z][1-6][0-9][0-9][0-9]";
			System.out.println(module + ": " + module.matches(pattern));
		}
		
	}
	
}






