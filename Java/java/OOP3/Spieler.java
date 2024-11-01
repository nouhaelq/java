package Java.java.OOP3;

import OOP3.Mitglieder;

public class Spieler extends Mitglieder {
  private String spielposition;
  private int anzahlSpieleinsätze;

  public Spieler(String name, String vorname, String spielposition, int anzahlSpieleins) {
    super(name, vorname);
    this.spielposition = spielposition;
    this.anzahlSpieleinsätze = anzahlSpieleins;
  }
  public String getSpielposition() {
    return spielposition;
  }

  public int getAnzahlSpieleinsätze(){
    return anzahlSpieleinsätze;
  }
@Override
  public double jahresgehalt(){
    return 180000 * 12 + 5000 * anzahlSpieleinsätze;
  }

  @Override
  public String getSonstiges(){
    return "Position: " +  spielposition + "/" + "Spieleinsätze: " +  anzahlSpieleinsätze;
  }

  @Override
  public String toString(){
    return getName () + " " + getVorname();
  }

}
