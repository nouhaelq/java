package aufgaben;

import java.util.Scanner;

public class aufg2 {
  public static void main(String[] args) {
    /*
    //1.Operationen
    Scanner sc = new Scanner ( System.in );
    System.out.println ( "1. Zahl geben :" );
    System.out.println ( "2. Zahl geben :" );
    int n = sc.nextInt ();
    int m = sc.nextInt ();

    System.out.println ( "add:" + (n + m) );
    System.out.println ( "subtract: " + (n - m) );
    System.out.println ( "multiply: " + (n * m) );
    System.out.println ( "divide: " + (m != 0 ? n / m : "error") );
    System.out.println ( "modulo: " + (n % m) );

    //2.nach Alter fragt
    Scanner sc1 = new Scanner ( System.in );
    System.out.println ( "Alt eingeben :" );
    int alt = sc1.nextInt ();
    if (alt < 18) {
      System.out.println ( "Sie sind ein Jugendlicher" );
    } else {
      System.out.println ( "Sie sind ein Erwachsener" );
    }

    //3.max- minimalen Werte der Datentype
    // byte
    System.out.println ( "Byte:" );
    System.out.println ( "Minimaler Wert: " + Byte.MIN_VALUE );
    System.out.println ( "Maximaler Wert: " + Byte.MAX_VALUE );

    // short
    System.out.println ( "\nShort:" );
    System.out.println ( "Minimaler Wert: " + Short.MIN_VALUE );
    System.out.println ( "Maximaler Wert: " + Short.MAX_VALUE );

    // int
    System.out.println ( "\nInteger:" );
    System.out.println ( "Minimaler Wert: " + Integer.MIN_VALUE );
    System.out.println ( "Maximaler Wert: " + Integer.MAX_VALUE );

    // long
    System.out.println ( "\nLong:" );
    System.out.println ( "Minimaler Wert: " + Long.MIN_VALUE );
    System.out.println ( "Maximaler Wert: " + Long.MAX_VALUE );

    //4. Wochentagnamen mit switch
    Scanner scanner = new Scanner ( System.in );

    System.out.print ( "Geben Sie eine Zahl für den Wochentag ein: " );
    int tag = scanner.nextInt ();
    switch (tag) {
      case 1:
        System.out.println ( "Montag" );
        break;
      case 2:
        System.out.println ( "Dienstag" );
        break;
      case 3:
        System.out.println ( "Mittwoch" );
        break;
      case 4:
        System.out.println ( "Donnerstag" );
        break;
      case 5:
        System.out.println ( "Freitag" );
        break;
      case 6:
        System.out.println ( "Samstag" );
        break;
      case 7:
        System.out.println ( "Sonntag" );
        break;
      default:
        System.out.println ( "Ungültige Eingabe" );
    }
    System.out.println ();

    //5. Punktzahl
    Scanner scanner1 = new Scanner ( System.in );
    System.out.print ( "Geben Sie die Punktzahl ein (0 - 100): " );
    int punktzahl = scanner1.nextInt ();

    if (punktzahl >= 90 && punktzahl <= 100) {
      System.out.println ( "Note: A" );
    } else if (punktzahl >= 80 && punktzahl < 90) {
      System.out.println ( "Note: B" );
    } else if (punktzahl >= 70 && punktzahl < 80) {
      System.out.println ( "Note: C" );
    } else if (punktzahl >= 60 && punktzahl < 70) {
      System.out.println ( "Note: D" );
    } else if (punktzahl >= 0 && punktzahl < 60) {
      System.out.println ( "Note: F" );
    } else {
      System.out.println ( "Ungültige Punktzahl");
    }
    System.out.println ();

    //6. Bestimmen der Jahrzeit basierend auf dem eingegebenen Monat
    Scanner scanner2 = new Scanner(System.in);
    System.out.print("Geben Sie den Monat als Zahl ein");
    int monat = scanner2.nextInt();

    switch (monat) {
      case 12:
      case 1:
      case 2:
        System.out.println("Winter");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("Frühling");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("Sommer");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("Herbst");
        break;
      default:
        System.out.println("Ungültige");
    }

     */
    System.out.println ();
    System.out.println ( größte ( 4, 7, 10 ) );

    // 8. schaltjahr
    int jahr = 2023;
    if (jahr % 400 == 0) {
      System.out.println ( "ist ein Schaltjahr" );
    } else {
      System.out.println ( "ist kein Schaltjahr" );
    }

    System.out.println ();

    //9. einen benutzernamen und ein Passwort abfregt
    String richtigerBenutzername = "admin";
    String richtigesPasswort = "1234";

    Scanner scanner = new Scanner ( System.in );
    System.out.print ( "Benutzername eingeben: " );
    String benutzername = scanner.nextLine ();
    System.out.print ( "Passwort eingeben: " );
    String passwort = scanner.nextLine ();

    if (benutzername.equals ( richtigerBenutzername ) && passwort.equals ( richtigesPasswort )) {
      System.out.println ( "Login erfolgreich" );
    } else {
      System.out.println ( "Login fehlgeschlagen" );
    }

  }

  //7.die größte von drei eigegebenen Zahlen finden
  public static int größte(int n, int m, int k) {
    if (m > n && m > k) {
      return m;
    } else if (n > k) {
      return n;
    } else {
      return k;
    }
  }

}