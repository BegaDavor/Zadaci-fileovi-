import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReceniceBezRazmaka {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner unos = new Scanner(System.in);
		String text = "";
		

		System.out.println("Unesite ime file-a: ");
		String nameOfFile = unos.next();

		// File

		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca27/src/" + nameOfFile);

		// File scanner

		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			text += input.next();
		}
		
		input.close();
		
		System.out.println(text);
		
		unos.close();
	}

}
