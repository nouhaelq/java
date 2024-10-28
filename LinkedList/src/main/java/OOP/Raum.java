package OOP;

public class Raum extends Professor{
  private char trakt;
  private char etage;
  private String nummer;
  private Professor prof;

  public Raum() {}

  public Raum(char trakt, char etage, String nummer) {
    this.trakt = trakt;
    this.etage = etage;
    this.nummer = nummer;
  }

  public char getTrakt() {
    return trakt;
  }

  public char getEtage(){
    return etage;
  }

  public String getNummer() {
    return nummer;
  }

  public void setNutzer(Professor prof) {
    this.prof = prof;
  }

  public Professor getNutzer(){
    return prof;
  }
  public void removeNutzer(){
    this.prof = null;
  }

  public String Raumbezeichnung(){
    return trakt + "." + etage + "." + nummer + ": " + prof;
  }
}
