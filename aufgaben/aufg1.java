package aufgaben;

import java.util.Scanner;

public class aufg1 {
  public static void main(String[] args) {

    // Loops Aufgaben
    // 1. Einfache Zählschleife

    for (int i = 0; i <= 50; i++) {
      System.out.println ( i );
    }
    System.out.println ();

    // 2. Ungerade Zahlen
    int i = 1;
    while (i <= 100) {
      if (i % 2 != 0) {
        System.out.println ( i );
      }
      i++;
    }
    System.out.println ();

    // 3. Summe einer Zahlenreihe
    int summe = 0;
    while (summe <= 100) {
      summe = summe + i;
      i++;
    }
    System.out.println ( summe );
    System.out.println ();

    // 4. Faktorielle Berechnung

    Scanner sc = new Scanner ( System.in );
    System.out.println ( "Zahl geben :" );
    int zahl = sc.nextInt ();

    int fakt = 1;
    for (int j = 1; j <= zahl; j++) {
      fakt = fakt * j;
    }
    System.out.println ( fakt );
    System.out.println ();

    // 5. Zahlenumkehrung
    Scanner sc2 = new Scanner ( System.in );
    System.out.println ( "Zahl geben :" );
    int zahl2 = sc2.nextInt ();

    int rest;
    int umkehzahl = 0;
    while (zahl2 > 0) {
      rest = zahl2 % 10;
      umkehzahl = umkehzahl * 10 + rest;
      zahl2 = zahl2 / 10;
    }
    System.out.println ( umkehzahl );
    System.out.println ();

    // 6. Primzahlprüfer
    boolean primzahl = true;
    if (zahl2 < 2){
      primzahl = false;
    }else {
      for (int j = 2; j * j <= zahl2 ; j++) {
        if (zahl2 % j == 0) {
          primzahl = false;
        }
      }
    }
    System.out.println ( primzahl );
    System.out.println ();



    //8. Tabelle eines wertes

    Scanner sc3 = new Scanner ( System.in );
    System.out.println ("n geben:");
    int n = sc3.nextInt ();
    for (int k = 0; k <= 10; k++) {
      int ergebnis = n * k;
      System.out.println ( n + "*" + k + "=" + ergebnis );
    }
    System.out.println ();

    //9. Summe der Ziffern
    int sum = 0;
    while (n > 0){
      sum = sum + n % 10;
      n = n / 10;
    }
    System.out.println ( sum );
    System.out.println ();

    //10. Pyramidenmuster

    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Geben Sie die Anzahl der Ebenen der Pyramide ein: ");
    int ebenen = scanner1.nextInt();


    for (int l = 1; l <= ebenen; l++) {

      for (int j = 1; j <= ebenen - l; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * l - 1); k++) {
        System.out.print("*");
      }
      // Zeilenumbruch nach jeder Ebene
      System.out.println();

    }
    }
  }