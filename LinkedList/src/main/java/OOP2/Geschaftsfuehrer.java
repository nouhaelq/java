package OOP2;

public class Geschaftsfuehrer extends  Manager{
  private double zulage;

  public Geschaftsfuehrer(String name, double festgehalt, double provision, double zulage) {
    super(name, festgehalt, provision);
    this.zulage = zulage;
  }

  @Override
  public double berechneGehalt(){
  return super.berechneGehalt () + zulage;
  }
}
