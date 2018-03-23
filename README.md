Projet Scolaire Java de 3ème année 

On souhaite automatiser la production de fiches pour des produits dans un système de gestion de stock.

Le système accepte en entrée un fichier au format CSV contenant la liste des produits. Un produit est défini
par un code, un nom, une description, une catégorie et un prix à l’unité HT (hors taxe).

Exemple de fichier d’entrée :

XV13948573;Mysterium;jeu d'enquête coopératif;jeu;30,21

VT66556555;The Witcher 3;Incarnez un tueur de monstres et vivez son épopée !;jeu video;32,12

GF55556566;Wonder Woman DVD;L’adaptation cinéma du DC Comics;film;16,55

Le fichier définit pour chaque ligne : le code, le nom, la description, la catégorie et le prix HT.

Les fichiers produits sont au format PDF.

Le système se limite à un utilitaire que l’on peut lancer en ligne de commande. Comme il s’agit d’un
programme Java, la ligne de commande sera de la forme :

java classpath <CLASSPATH> NomDeLaClasse <PARAMETRES>

Les paramètres possibles sont les suivants :
 - h:
  pour afficher l’aide
 - i:
  suivi du chemin du fichier CSV d’entrée
  
Pour produire un fichier des fiches produit :

java -classpath <CLASSPATH> NomDeLaClasse -i produits.csv --fiche out/fiches.pdf

Structure du projet :

src : ce répertoire contient les packages et les sources de votre application. Les sources doivent être
compatibles avec le JDK 1.8 de Oracle.

lib : ce répertoire contient les fichiers JAR des bibliothèques tierces que vous utiliserez.

Bibliothèques tierces pour le projet:

iText

iText permet de produire des fichiers PDF.

commons-cli

commonscli est une bibliothèque pour interpréter les paramètres passés à votre application (cli est la
contraction de command line interface).

