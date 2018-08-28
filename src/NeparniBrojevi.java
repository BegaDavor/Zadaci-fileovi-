import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NeparniBrojevi {

	public static void main(String[] args) throws FileNotFoundException {
		
		// File

		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca27/src/Brojevi");

		// File scanner

		Scanner input = new Scanner(file);
		
		// File Writer
		
		PrintWriter output = new PrintWriter(file);
		
		for (int i = 0; i < 100; i++) {
			int broj = (int) (Math.random() * 1001);
			
			output.print(broj + " ");
		}
		
		output.close();
		
		while (input.hasNext()) {
			int broj = input.nextInt();
			if (broj % 2 == 1) {
				
				System.out.print(broj + " ");
				
			}
		}
		
		input.close();

	}

}
