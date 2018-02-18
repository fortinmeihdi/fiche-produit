package javaproduit;

public class Produit {
		static String code;
		static String nom;
		static String categorie;
		static String description;
		static String montantHt;
		static String tva;
		static String montantTtc;

		public Produit(String[] value) {
			code = value[0];
			nom = value[1];
			categorie = value[3];
			description = value[2];
			montantHt = value[4];
			tva = null;
			montantTtc = null;
		}
}
