package week13.slot02.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RetrieveDataUsingRegex {

	public static void main(String[] args) {
		String html =
				"<html>" +
				"<h1>My HTML Page</h1>" +
				"<p>This is the detail of my page</p>" +
				"<p>Additional details</p>" +
				"</html>";
		System.out.println(html);
		
		Pattern htmlPattern = 
				Pattern.compile("<p>(.*?)</p>");
		Matcher htmlMatcher = htmlPattern.matcher(html);
		
		int count = 0;
		while(htmlMatcher.find()) {
			count++;
			System.out.println(htmlMatcher.group(1));
			System.out.println(htmlMatcher.start());
			System.out.println(htmlMatcher.end());
		}
		System.out.println(count);
	}
	
}
