import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PretposljednjaRijec {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite ime file-a: ");
		String nameOfFile = unos.next();
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
		System.out.println("Pretposljednje rijeci po linijama su: ");
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			String[] words = line.split(" ");
			System.out.println(words[words.length - 2]);

		}

		unos.close();


	}

}
