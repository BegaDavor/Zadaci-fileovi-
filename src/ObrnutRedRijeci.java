import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ObrnutRedRijeci {

	public static void main(String[] args) throws FileNotFoundException {
		String rijec = "n/a";
		Scanner unos = new Scanner(System.in);
		ArrayList<String> rijeci = new ArrayList<>();

		System.out.println("Unesite ime file-a: ");
		String nameOfFile = unos.next();

		// File

		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca27/src/" + nameOfFile);

		// Scanners

		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			rijec = input.next();
			rijeci.add(rijec);
		}

		input.close();

		for (int i = rijeci.size() - 1; i >= 0; i--) {
			System.out.print(rijeci.get(i) + " ");
		}
		unos.close();
	}

}
