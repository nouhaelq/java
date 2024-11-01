package OOP3;

public class Ärzte extends Mitglieder{
  private String fachrichtung;

  public Ärzte(String name, String vorname, String fachrichtung){
    super(name, vorname);
    this.fachrichtung = fachrichtung;
  }

  public String getFachrichtung(){
return fachrichtung;
  }

@Override
  public double jahresgehalt() {
    return 10000 * 12;
  }

  @Override
  public String getSonstiges() {
    return "Fachrichtung: " + fachrichtung;
  }

}
