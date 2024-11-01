package Java.java.OOP;

import OOP.Raum;

public class Raumverwalltung {
  private Raum[] raeume;

  public Raumverwalltung() {
    this.raeume = new Raum[100];
  }

  public void addRaum(Raum raum) {
    for (int i = 0; i < raeume.length; i++) {
      if (raeume[i] == null) {
        raeume[i] = raum;
        break;
      }

    }
  }

  public void ausgabeRaumliste() {
    for (int i = 0; i < raeume.length; i++) {
      if (raeume[i] != null) {
        System.out.println(raeume[i]);
    }
    }
  }
}