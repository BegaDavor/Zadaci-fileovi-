import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PocetnoVelikoSlovo {
	
	public static String povecajPrvoSlovo(String rijec) {
		String novaRijec = ("" + rijec.charAt(0)).toUpperCase();
		for (int i = 1; i < rijec.length(); i++) {
				novaRijec += rijec.charAt(i);
		}
		return novaRijec;
	}

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
		
		while(input.hasNext()) {
			String rijec = povecajPrvoSlovo(input.next());
			text += rijec + " ";
		}
		
		input.close();
		unos.close();
		
		System.out.println(text);

	}

}
