import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SlovaUFileu {

	public static void main(String[] args) throws FileNotFoundException {
		int counterA = 0;
		int counterB = 0;
		int counterC = 0;
		int counterD = 0;
		int counterE = 0;
		int counterF = 0;
		int counterG = 0;
		int counterH = 0;
		int counterI = 0;
		int counterJ = 0;
		int counterK = 0;
		int counterL = 0;
		int counterM = 0;
		int counterN = 0;
		int counterO = 0;
		int counterP = 0;
		int counterQ = 0;
		int counterR = 0;
		int counterS = 0;
		int counterT = 0;
		int counterU = 0;
		int counterV = 0;
		int counterW = 0;
		int counterX = 0;
		int counterY = 0;
		int counterZ = 0;
		int countera = 0;
		int counterb = 0;
		int counterc = 0;
		int counterd = 0;
		int countere = 0;
		int counterf = 0;
		int counterg = 0;
		int counterh = 0;
		int counteri = 0;
		int counterj = 0;
		int counterk = 0;
		int counterl = 0;
		int counterm = 0;
		int countern = 0;
		int countero = 0;
		int counterp = 0;
		int counterq = 0;
		int counterr = 0;
		int counters = 0;
		int countert = 0;
		int counteru = 0;
		int counterv = 0;
		int counterw = 0;
		int counterx = 0;
		int countery = 0;
		int counterz = 0;

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite ime file-a: ");
		String nameOfFile = unos.next();
		// file
		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca27/src/" + nameOfFile);

		// Scanner
		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {
			String line = input.nextLine();
			for (int i = 0; i < line.length(); i++) {
				switch (line.charAt(i)) {
				
				case 'A': counterA++; break;
				case 'B': counterB++; break;
				case 'C': counterC++; break;
				case 'D': counterD++; break;
				case 'E': counterE++; break;
				case 'F': counterF++; break;
				case 'G': counterG++; break;
				case 'H': counterH++; break;
				case 'I': counterI++; break;
				case 'J': counterJ++; break;
				case 'K': counterK++; break;
				case 'L': counterL++; break;
				case 'M': counterM++; break;
				case 'N': counterN++; break;
				case 'O': counterO++; break;
				case 'P': counterP++; break;
				case 'Q': counterQ++; break;
				case 'R': counterR++; break;
				case 'S': counterS++; break;
				case 'T': counterT++; break;
				case 'U': counterU++; break;
				case 'V': counterV++; break;
				case 'W': counterW++; break;
				case 'X': counterX++; break;
				case 'Y': counterY++; break;
				case 'Z': counterZ++; break;
				case 'a': countera++; break;
				case 'b': counterb++; break;
				case 'c': counterc++; break;
				case 'd': counterd++; break;
				case 'e': countere++; break;
				case 'f': counterf++; break;
				case 'g': counterg++; break;
				case 'h': counterh++; break;
				case 'i': counteri++; break;
				case 'j': counterj++; break;
				case 'k': counterk++; break;
				case 'l': counterl++; break;
				case 'm': counterm++; break;
				case 'n': countern++; break;
				case 'o': countero++; break;
				case 'p': counterp++; break;
				case 'q': counterq++; break;
				case 'r': counterr++; break;
				case 's': counters++; break;
				case 't': countert++; break;
				case 'u': counteru++; break;
				case 'v': counterv++; break;
				case 'w': counterw++; break;
				case 'x': counterx++; break;
				case 'y': countery++; break;
				case 'z': counterz++; break;
				default: break;				
				}
			}

		}
		
		System.out.println("A: " + counterA + "\n" + 
				"B: " + counterB + "\n" + 
				"C: " + counterC + "\n" + 
				"D: " + counterD + "\n" + 
				"E: " + counterE + "\n" + 
				"F: " + counterF + "\n" + 
				"G: " + counterG + "\n" + 
				"H: " + counterH + "\n" + 
				"I: " + counterI + "\n" + 
				"J: " + counterJ + "\n" + 
				"K: " + counterK + "\n" + 
				"L: " + counterL + "\n" + 
				"M: " + counterM + "\n" + 
				"N: " + counterN + "\n" + 
				"O: " + counterO + "\n" + 
				"P: " + counterP + "\n" + 
				"Q: " + counterQ + "\n" +
				"R: " + counterR + "\n" + 
				"S: " + counterS + "\n" + 
				"T: " + counterT + "\n" + 
				"U: " + counterU + "\n" + 
				"V: " + counterV + "\n" + 
				"W: " + counterW + "\n" + 
				"X: " + counterX + "\n" + 
				"Y: " + counterY + "\n" + 
				"Z: " + counterZ + "\n" + 
				"a: " + countera + "\n" + 
				"b: " + counterb + "\n" + 
				"c: " + counterc + "\n" + 
				"d: " + counterd + "\n" + 
				"e: " + countere + "\n" + 
				"f: " + counterf + "\n" + 
				"g: " + counterg + "\n" + 
				"h: " + counterh + "\n" + 
				"i: " + counteri + "\n" + 
				"j: " + counterj + "\n" + 
				"k: " + counterk + "\n" + 
				"l: " + counterl + "\n" + 
				"m: " + counterm + "\n" + 
				"n: " + countern + "\n" + 
				"o: " + countero + "\n" + 
				"p: " + counterp + "\n" +
				"q: " + counterq + "\n" +
				"r: " + counterr + "\n" + 
				"s: " + counters + "\n" + 
				"t: " + countert + "\n" + 
				"u: " + counteru + "\n" + 
				"v: " + counterv + "\n" + 
				"w: " + counterw + "\n" + 
				"x: " + counterx + "\n" + 
				"y: " + countery + "\n" + 
				"z: " + counterz);
		
		input.close();
		unos.close();

	}

}
