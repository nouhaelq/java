package aufgaben;

public class Bruch {
  private int zaehler;
  private int nenner;

  public Bruch() {
    this.zaehler = 0;
    this.nenner = 1;
  }
  public Bruch(int zaehler, int nenner) {
    this.zaehler = zaehler;
    this.nenner = nenner;
  }
  public int getZaehler() {
    return zaehler;
  }
  public int getNenner() {
    return nenner;
  }
  public Bruch kehrwert(){
    return new Bruch(nenner, zaehler);
  }
  public Bruch addieren(Bruch b){
    int neuZaehler = (zaehler * b.getNenner ())+(b.getZaehler () * nenner);
    int neuNenner = (nenner * b.getNenner ());

    return new Bruch(neuZaehler, neuNenner);
  }
  public Bruch multiplizieren(Bruch b){
    int neuZaehler = zaehler * b.getZaehler ();
    int neuNenner = nenner * b.getNenner ();
    return new Bruch(neuZaehler, neuNenner);
  }
  public String toString() {
    return zaehler + "/" + nenner;
  }
}
