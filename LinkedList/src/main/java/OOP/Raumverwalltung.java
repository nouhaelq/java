package OOP;

public class Raumverwalltung extends Raum {
  private Raum raum;

  public Raumverwalltung() {}

  public void addRaum(Raum raum) {

  }

  public void ausgabeRaumliste() {
    if (raum.getNutzer () != null) {
      System.out.println (raum.Raumbezeichnung ());    }
    else {
      System.out.println ();
    }
  }
}