package com.simplon.theatre;

import java.util.Scanner;

public class SimplonTheater {
	
	
	public static void main(String[] args) {
		while(true) {
			Scanner clavier = new Scanner(System.in);
			System.out.println("Combien de places voulez vous acheter ?");
			int place = clavier.nextInt();
			System.out.println("A quelle rangée voulez vous aller ?");
			int range = clavier.nextInt();

			System.out.println("    ---------------------------------------------");
			System.out.println("");


			

			String s1 = "[ _ ]";
			String s2 = "[ x ]";

			String [][] a;
			a = new String [8][9];
			int compteur = 0;

			for(int i=0;i<=7;i++)  {
				for(int j=0;j<=8;j++)  {
					if(j == 0) {System.out.print(i+" | ");}
					if(i == range) {
						if(compteur < place) {
							a[i][j]=s2;
						} else {
							a[i][j]=s1;
						}
						compteur ++;
					} else {
						a[i][j]=s1;
					}
					System.out.print(a[i][j]);
				}
				System.out.println("");
			}
			System.out.print("    ");
			for (int k=0;k<=8;k++) {
				System.out.print("  "+k+"  ");
			}
			System.out.println("");
		}

	}

}
