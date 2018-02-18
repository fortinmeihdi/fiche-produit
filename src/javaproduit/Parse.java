package javaproduit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*import java.util.ArrayList;*/
import java.util.List;

public class Parse {

	private List<Produit> csvparser(String csv) {
		new Produit(csv.split(";"));
		
		return null;
	}

	public List<Produit> read(String Csv) {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(Csv));
			String line = reader.readLine();
			while (line != null) {
				csvparser(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
