import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringNaopako {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String string = "N/A";
		Scanner unos = new Scanner(System.in);
		// File
		
		File file = new File("/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca27/stringovi");
		
		
		// Writer
		
		PrintWriter output = new PrintWriter(file);
		
		System.out.println("Unosite stringove (\"kraj\" prekida unos): ");
		while (string.equals("kraj") == false){
			string = unos.next();
			if (string.equals("kraj") == false)
			output.print(string + " ");
		}
		
		output.close();
		
		// Scanners
		
		Scanner input = new Scanner(file);
				
		System.out.println("Naopako stringovi uneseni u file: ");
		while (input.hasNext()) {
			string = input.next();
			for (int i = string.length() - 1; i >= 0; i-- ) {
				System.out.print(string.charAt(i));
			}
			System.out.println();
		}
		input.close();
		unos.close();
		
	}

}
