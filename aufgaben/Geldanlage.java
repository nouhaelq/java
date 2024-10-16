package aufgaben;

import java.util.Scanner;

public class Geldanlage {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

      System.out.print("Geben Sie die Laufzeit ein: ");
      int laufzeit = scanner.nextInt();

      System.out.print("Geben Sie den Anlagebetrag ein: ");
      double anlagebetrag = scanner.nextDouble();

      System.out.println("Wählen Sie eine der folgenden Optionen:");
      System.out.println("1. 1,5 % Verzinsung ohne Bonuszahlung");
      System.out.println("2. 0,7 % Verzinsung mit 15 Euro Bonuszahlung");
      System.out.println("3. 0,4 % Verzinsung mit 20 Euro Bonuszahlung");
      System.out.println("4. 0,1 % Verzinsung mit 50 Euro Bonuszahlung");
      System.out.println("5. Fertig");

      System.out.print("Ihre Wahl: ");
      int auswahl = scanner.nextInt();

      if (auswahl < 1 || auswahl > 5) {
        System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5 aus.");

      }

      if (auswahl == 5) {
        System.out.println("Programm beendet.");

      }

      double zinssatz = 0;
      double bonus = 0;

      switch (auswahl) {
        case 1:
          zinssatz = 1.5;
          bonus = 0;
          break;
        case 2:
          zinssatz = 0.7;
          bonus = 15;
          break;
        case 3:
          zinssatz = 0.4;
          bonus = 20;
          break;
        case 4:
          zinssatz = 0.1;
          bonus = 50;
          break;
        default:
          System.out.println("Ungültige Auswahl.");
      }

      double kapital = berechneKapital(zinssatz, bonus, anlagebetrag, laufzeit);

      System.out.println("Das Kapital im jahr " + laufzeit + " beträgt: " + kapital  );

  }

  public static double berechneKapital(double zinssatz, double bonus, double anlagebetrag, int laufzeit) {
    double kapital = anlagebetrag;
    for (int i = 0; i < laufzeit; i++) {
      kapital = kapital * (1 + zinssatz / 100) + bonus;
    }
    return kapital;
  }
}
