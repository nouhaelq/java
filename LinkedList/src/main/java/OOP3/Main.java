package OOP3;

public class Main {
  public static void main(String[] args) {


    Spieler spieler1 = new Spieler ( "Götze", "Mario", "Mittelfeld", 5 );

    Spieler spieler2 = new Spieler("Aubameyang","Pierre-Emerik", "Sturm",18);

    Trainer trainer = new Trainer ( "Tuchel", "Thomas");
    trainer.getLieblingsspieler (spieler2);

    Ärzte arzt = new Ärzte ( "Braun", "Markus", "Orthopädie" );


    Mitglieder [] mitglieder = {spieler1, spieler2, trainer, arzt};

    System.out.printf("%s%30s%30s%30s%50s", "Type", "Name", "Vorname", "Jahresgehalt", "Sonsiges");
    for (int i = 0; i < mitglieder.length; i++) {
      System.out.printf("\n%c%35s%30s%30.2f%50s", '#', mitglieder[i].getName (), mitglieder[i].getVorname(),
                                     mitglieder[i].jahresgehalt (), mitglieder[i].getSonstiges ());
    }

  }
}
