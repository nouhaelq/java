package OOP;

public class Raumtest {
  public static void main(String[] args) {

    Raumverwalltung raumverwalltung = new Raumverwalltung();

    Professor prof1 = new Professor("Konstantin Koll");
    Professor prof2 = new Professor("Michael Stark");

    Raum raum1 = new Raum ('C','2',"30");
    Raum raum2 = new Raum ('C','2',"40");
    Raum raum3 = new Raum ('C','2',"41");

    raumverwalltung.addRaum ( raum1 );

  }
}
