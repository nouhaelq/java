package OOP3;

public abstract class Mitglieder {
  private String name;
  private String vorname;

  public Mitglieder(String name, String vorname) {
    this.name = name;
    this.vorname = vorname;
  }

  public String getName() {
    return name;
  }

  public String getVorname() {
    return vorname;
  }


  public abstract double jahresgehalt();

  public abstract String getSonstiges();

}
