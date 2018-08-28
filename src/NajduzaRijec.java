import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NajduzaRijec {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite ime file-a: ");
		String nameOfFile = unos.next();
		String najduzaRijec = "";
		ArrayList<String> lines = new ArrayList<>();
		// File

		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca27/src/" + nameOfFile);

		// File scanner

		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String line = input.nextLine();
			lines.add(line);
		}

		input.close();
		System.out.println("Najduze rijeci po linijama su: ");
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			String[] words = line.split(" ");
			for (int j = 0; j < words.length; j++) {
				for (int k = 1 + j; k < words.length; k++) {
					if (words[j].length() >= words[k].length()) {
						najduzaRijec = words[j];
					}
				}
			}
			
			System.out.println(najduzaRijec);

		}

		unos.close();

	}

}
