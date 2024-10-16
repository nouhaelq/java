package aufgaben;
public class spiel {
  public static void main(String[] args) {
    // Anzahl der Zeilen und Spalten festlegen
    int zeilen = 5;
    int spalten = 5;

    // Zweidimensionales Array für das Muster erstellen
    String[][] musterArray = new String[zeilen][spalten];

    for (int i = 0; i < zeilen; i++) {
      for (int j = 0; j < spalten; j++) {
        if (j < spalten / 2) {
          musterArray[i][j] = "L";

        } else if (j > spalten / 2) {
          musterArray[i][j] = "R";

        } else {
          musterArray[i][j] = "X";
        }
      }
      System.out.println ();
    }


    for (int i = 0; i < zeilen; i++) {
      for (int j = 0; j < spalten; j++) {
        System.out.print(musterArray[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println ();

    int Zeilen  = 7;
    int Spalten = 7;
    String [][] array = new String[Zeilen][Spalten];

    for (int i = 0; i < Zeilen; i++) {
      for (int j = 0; j < Spalten; j++) {

        if (i + j == 3 && i <= 3 || i + j == 9 && i >= 3) {
          System.out.print ( "B" );
        } else if (j == i + 3 & j > 3  || i == j + 3 && j < 3) {
          System.out.print ( "C" );
        } else {
          System.out.print (" ");
        }
      }
      System.out.println ();
    }
    System.out.println ();

    int zeilen1 = 9;
    int spalten1 = 9;


    String[][] feld = new String[zeilen1][spalten1];


    for (int i = 0; i < zeilen1; i++) {
      for (int j = 0; j < spalten1; j++) {
        feld[i][j] = " "; // Leerzeichen als Standardwert
      }
    }


    for (int i = 0; i < zeilen1; i++) {
      for (int j = 0; j < spalten1; j++) {
        if (i == j || i + j == spalten1 - 1) {
          feld[i][j] = "*";
        } else if (i < spalten1 / 2 && j > i && j < spalten1 - i - 1) {
          feld[i][j] = "1";
        } else if (i > spalten1 / 2 && j > spalten1 - i - 1 && j < i) {
          feld[i][j] = "3";
        } else if (j < spalten1 / 2    ) {
          feld[i][j] = "4";
        } else {
          feld[i][j] = "2";
        }
      }
    }

    // Array ausgeben
    for (int i = 0; i < zeilen1; i++) {
      for (int j = 0; j < spalten1; j++) {
        System.out.print(feld[i][j] + "  ");
      }
      System.out.println();
    }
    System.out.println ();

    int zeilen2 = 5;
    int spalten2 = 9;

    String [][] Feld = new String[zeilen2][spalten2];

    for (int i = 0; i < zeilen2; i++) {
      for (int j = 0; j < spalten2; j++) {
        if (i + j == 4 && j <= spalten2 / 2 ||
            j - i == 4 && j > spalten2 / 2  ||
            i == zeilen2 / 2 && j < spalten2 - i - 1 && j > zeilen2 -i - 1){
          System.out.print ("*");
        } else {
          System.out.print (" ");
        }
      }
      System.out.println ();
    }



  }

  }

