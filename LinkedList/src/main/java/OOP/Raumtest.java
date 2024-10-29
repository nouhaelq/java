package OOP;

public class Raumtest {
  public static void main(String[] args) {
      Raumverwalltung raumverwaltung = new Raumverwalltung ();

      Professor prof1 = new Professor("Konstantin Koll");
      Professor prof2 = new Professor("Michael Stark");

      Raum raum1 = new Raum('C', '2', "30");
      Raum raum2 = new Raum('C', '2', "40");
      Raum raum3 = new Raum('A', '2', "02");
      Raum raum4 = new Raum('A', '2', "03");

      raumverwaltung.addRaum(raum1);
      raumverwaltung.addRaum(raum2);
      raumverwaltung.addRaum(raum3);
      raumverwaltung.addRaum(raum4);


      raum1.setNutzer(prof1);
      raum2.setNutzer(prof2);


      raumverwaltung.ausgabeRaumliste();
    }
  }

