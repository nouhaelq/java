package OOP3;

public class Trainer extends Mitglieder {
  private String lieblingsspieler;

  public Trainer(String name, String vorname) {
    super ( name, vorname );
  }

  public String getLieblingsspieler(Spieler spieler2) {
    return lieblingsspieler;
  }

  public void setLieblingsSpieler(Spieler lieblingsSpieler) {
    this.lieblingsspieler = lieblingsspieler;
  }


  @Override
  public double jahresgehalt() {
    return 165000 * 12;
  }

  @Override
  public String getSonstiges() {
return "Lieblingssoieler: " + lieblingsspieler;
  }
}