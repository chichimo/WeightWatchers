package interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryEX {

	public static void main(String[] args) throws FileNotFoundException {
		String line;
		
		Scanner scn = new Scanner (new File("C:\\Users\\hashi\\OneDrive\\Desktop\\Dictionary.txt")).useDelimiter("-|,");

		List<String>words = new ArrayList<String>();
		while (scn.hasNext()) {
			line = scn.next();
			words.add(line);
		}
		scn.close();
		
		String [] wordsArray = words.toArray(new String[0]);
		
		for (String s: wordsArray) {
			System.out.println(s);
		}
	}

}
