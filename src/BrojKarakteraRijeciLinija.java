import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrojKarakteraRijeciLinija {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int charCounter = 0;
		int wordCounter = 0;
		int lineCounter = 0;
		
		// File
		
		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca27/src/Zadatak1");
		
		// Scanner
		
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			
			String line = input.nextLine();
			charCounter += line.length();
			lineCounter++;
			
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == ' ') {
					wordCounter++;
				}
			}
			
		}
		input.close();
		System.out.println("Broj karaktera: " + charCounter);
		System.out.println("Broj rijeci: " + (wordCounter + lineCounter));
		System.out.println("Broj linija: " + lineCounter);
	}

}
