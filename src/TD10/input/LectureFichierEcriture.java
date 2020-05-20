package TD10.input;
import java.io.*;

public class LectureFichierEcriture {

	public static void main(String[] args) {
		
		try {

			FileReader cp2009 = new FileReader("-France_Codepostal_2009.txt");
			FileWriter FC2009 = new FileWriter("France_Communes_2009.txt");
			FileWriter C2009 = new FileWriter("France_Code_Postal_2009.txt");
			
			BufferedReader readerCP2009 = new BufferedReader(cp2009);
			BufferedWriter bufferCP = new BufferedWriter(C2009);
			BufferedWriter bufferCommune = new BufferedWriter(FC2009);



			
			while (readerCP2009.ready()) {
				String displayLine = readerCP2009.readLine();
				String[] tabs = displayLine.split("\t");
				
				bufferCP.write(tabs[0]);
				bufferCP.newLine();
				bufferCommune.write(tabs[1]);
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
