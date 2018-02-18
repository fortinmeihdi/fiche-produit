package javaproduit;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;

public class Param {
	public static void main(String[] args) {
		try {
			Options options = new Options();
			options.addOption("h", false, "pour affichr l'aide");
			options.addOption("i", false, "fichier CSV d'entr�e");
			options.addOption("categorie", false, "cat�gorie pour filtrer les produits");
			options.addOption("etiquette", false, "etiquettes produit");
			options.addOption("fiche", false, "fiches produit");
			options.addOption("tva", false, "calcule le prix TTC");
			CommandLineParser parser = new DefaultParser();
			CommandLine cmd = parser.parse( options, args);
			
			if(cmd.hasOption("h")) {
				H();
			}
			if(cmd.hasOption("i")) {
				if(cmd.hasOption("fiche")) {
					Fiche.fiche(args[1], args[3]);}
				}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void H() {
		System.out.println("pour produire un fichier des �tiquettes :");
		System.out.println(" ");
		System.out.println("java -classpath <CLASSPATH> NomDeLaClasse -i produits.csv -etiquette out/etiquettes.pdf");
		System.out.println(" ");
		System.out.println("Pour produire un fichier des fiches produit :");
		System.out.println(" ");
		System.out.println("java -classpath <CLASSPATH> NomDeLaClasse -i produits.csv --fiche out/fiches.pdf");
		System.out.println(" ");
		System.out.println("Pour produire un fichier des �tiquettes et un fichie des fiches produit: ");
		System.out.println(" ");
		System.out.println("java -classpath <CLASSPATH> NomDeLaClasse -i produits.csv -etiquette etiquettes.pdf -fiche fiches.pdf");
		System.out.println(" ");
		System.out.println("Pour produire un fichier des �tiquettes uniquement pour la cat�gorie <<film>> :");
		System.out.println(" ");
		System.out.println("java -classpath <CLASSPATH> NomDeLaClasse -i produits.csv -categorie film -etiquette out/etiquettes.pdf");
		System.out.println(" ");
		System.out.println("Pour produire un fichier des �tiquettes en utilisant une TVA � 5% :");
		System.out.println(" ");
		System.out.println("java -classpath <CLASSPATH> NomDeLaClasse -i produits.csv -etiquette out/etiquettes.pdf -tva 5.0");
		
	}
}
