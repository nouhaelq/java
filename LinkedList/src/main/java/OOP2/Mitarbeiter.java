package OOP2;

public abstract class Mitarbeiter {
  private String name;
  private static int nextPersonalnummer = 1;
  private int personalnummer;
  private int anzahlMitarbeiter;

  public Mitarbeiter(String name){
    this.name = name;
    this.personalnummer = nextPersonalnummer++;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getPersonalnummer(){
    return personalnummer;
  }

  public abstract double berechneGehalt();

}
