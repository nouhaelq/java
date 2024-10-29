package OOP;

import java.util.ArrayList;
import java.util.List;

public class Raumverwalltung extends Raum {
  private List<Raum> raeume;

  public Raumverwalltung() {
    this.raeume = new ArrayList<> ();
  }

  public void addRaum(Raum raum) {
    raeume.add(raum);
  }

  public void ausgabeRaumliste() {
    for (Raum raum : raeume) {
      System.out.println(raum);
    }
  }
}