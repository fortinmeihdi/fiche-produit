package javaproduit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class Fiche {
	
	public static void fiche (String csv, String pdf) {
		fiche(csv, pdf, null);
	}
	public static void fiche(String csv, String pdf, String zero) {
		
		Parse csvParser = new Parse();
		List<Produit> produits = csvParser.read(csv);
		/*Parse produit = new csvparser(csv);*/
		//===============================================
		Fiche laFiche = new Fiche(produits);
		laFiche.generer(pdf);
		
	}
	
	public Fiche(List<Produit> produits) {

	}

	public void generer(String pdf) {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(pdf));
			
			document.open();
			document.add(new Paragraph("Code : " + Produit.code));
			document.add(new Paragraph("Nom : " + Produit.nom));
			document.add(new Paragraph("Categorie : " + Produit.categorie));
			document.add(new Paragraph("Description : " + Produit.description));
			document.add(new Paragraph("Montant HT : " + Produit.montantHt));
			document.add(new Paragraph("TVA : " + Produit.tva));
			document.add(new Paragraph("Montant TTC : " + Produit.montantTtc));
			document.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
