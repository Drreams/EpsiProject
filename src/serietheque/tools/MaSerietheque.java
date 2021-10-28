package serietheque.tools;

import java.lang.reflect.Array;

import serietheque.tools.Main;

import java.io.*;
import java.util.ArrayList;


public class MaSerietheque {
public static void main(String args[]) throws IOException
{
int z;
BufferedReader syl1=new BufferedReader (new InputStreamReader(System.in));
System.out.println("******************");
System.out.println("* Ma Serietheque *");
System.out.println("******************");
System.out.println("1- Statistique");
System.out.println("2- Liste des séries");
System.out.println("3- Détail d'une série");
System.out.println("4- Rechercher une serie");
System.out.println("5- Ajouter une serie");
System.out.println("6- Quitter l'application");
System.out.print("Choisir une option ");

z=Integer.parseInt(syl1.readLine());
switch(z)
{
case 1:{
	
	
	

//ecrire ici le programme de permutation
}
break;
case 2: {
	
	System.out.println("2- Liste des séries");
	
	
//ecrire ici le programme de la resolution de l'equation
}
break;

case 6: {
System.out.println("Aurevoir");
}
}
}
}