package Java.java.OOP2;

import OOP2.Mitarbeiter;

public class Arbeiter extends Mitarbeiter {
  private double stundenlohn;
  private double anzahlStunden;
  private double ueberstundenZuschlag;
  private double anzahlUeberstunden;

  public Arbeiter(String name, double stundenlohn, double anzahlStunden, double ueberstundenZuschlag) {
    super(name);
    this.stundenlohn = stundenlohn;
    this.anzahlStunden = anzahlStunden;
    this.ueberstundenZuschlag = ueberstundenZuschlag;
  }

  public double setAnzahlUeberstunden(double anzahlUeberstunden) {
    return anzahlUeberstunden;
  }

  @Override
  public double berechneGehalt(){
    return (anzahlStunden + anzahlUeberstunden) * stundenlohn + anzahlUeberstunden * ueberstundenZuschlag;
  }


}
