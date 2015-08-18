package testJspon;

import java.io.File;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyHtmlSerializer;
import org.htmlcleaner.TagNode;


public class run {

	public static void main(String[] args) {
		try {
			
			
			CleanerProperties props = new CleanerProperties();
			props.setRecognizeUnicodeChars(true);

			TagNode tagNode = new HtmlCleaner(props).clean(new File("C:\\root\\test2.html"), "UTF-8");

			System.out.println(tagNode.getName());
			System.out.println(tagNode.getName());
				
				tagNode.setAttribute("style", "height:101%;");
			
	
			new PrettyHtmlSerializer(props).writeToFile(tagNode, "C:\\root\\test.html",
					"UTF-8");
			

		} catch (Throwable e) {
			e.printStackTrace();
		}

	}
}

