package TD10.input;

import java.io.*;

public class LectureFichierAffichage {

	public static void main(String[] args) {
		
		try {

			FileReader cp2009 = new FileReader("-France_Codepostal_2009.txt");
			BufferedReader readerCP2009 = new BufferedReader(cp2009);
			
			while (readerCP2009.ready()) {
				String displayLine = readerCP2009.readLine();
				System.out.println(displayLine);
				
			}

			readerCP2009.close();
			cp2009.close();

		} catch(FileNotFoundException e) {

			System.err.println("Fichier non trouve");

		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Fichier indisponible");
		}

	}

}
