package OOP;

public class Raumtest {
  public static void main(String[] args) {


      Raum raum1 = new Raum('C', '2', "30");

      Raum raum2 = new Raum('C', '2', "40");
      Professor prof1 = new Professor("Konstantin Koll");
      raum2.setNutzer(prof1);

      Raum raum3 = new Raum('C', '2', "41");
      Professor prof2 = new Professor("Michael Stark");
      raum3.setNutzer(prof2);

      Raum raum4 = new Raum('A', '2', "02");
      Raum raum5 = new Raum('A', '2', "03");

      Raumverwalltung raumverwaltung = new Raumverwalltung ();

      raumverwaltung.addRaum(raum1);
      raumverwaltung.addRaum(raum2);
      raumverwaltung.addRaum(raum3);
      raumverwaltung.addRaum(raum4);
      raumverwaltung.addRaum(raum5);






      raumverwaltung.ausgabeRaumliste();
    }
  }

