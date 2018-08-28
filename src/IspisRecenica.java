import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IspisRecenica {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite ime file-a: ");
		String nameOfFile = unos.next();

		// File

		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca27/src/" + nameOfFile);
		
		// File scanner
		
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			String skraceniLine = "";
			if (line.length() < 55) {
				System.out.println(line);
			} else {
				for (int i = 0; i < 40; i++) {
					skraceniLine += line.charAt(i);
				}
				System.out.println(skraceniLine + "... <Read More>");
			}
		}
		input.close();
		unos.close();

	}

}
