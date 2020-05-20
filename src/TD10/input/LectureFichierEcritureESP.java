package input;

import java.io.*;

public class LectureFichierEcritureESP {

	public static void main(String[] args) {
		
		try {

			FileReader cp2009 = new FileReader("-France_Codepostal_2009_esp.txt");
			FileWriter FC2009 = new FileWriter("France_Code_Postal_2009ESP.txt");
			FileWriter C2009 = new FileWriter("France_Communes_2009ESP.txt");
			
			BufferedReader readerCP2009 = new BufferedReader(cp2009);
			BufferedWriter bufferCP = new BufferedWriter(C2009);
			BufferedWriter bufferCommune = new BufferedWriter(FC2009);



			
			while (readerCP2009.ready()) {
				String displayLine = readerCP2009.readLine();
				String[] tabs = displayLine.split(" ");
				
				tabs[(tabs.length) - 1] = "\t" + tabs[(tabs.length) - 1];

				for (int i = 0; i < (tabs.length - 1); i++) {
					bufferCP.write(tabs[i] + " ");
				}				
				bufferCP.newLine();
				
				bufferCommune.write(tabs.length);
				bufferCommune.newLine();
				
			}

			readerCP2009.close();
			cp2009.close();
			FC2009.close();
			C2009.close();
			

		} catch(FileNotFoundException e) {

			System.err.println("Fichier non trouve");

		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Fichier indisponible");
		}

	}

}
