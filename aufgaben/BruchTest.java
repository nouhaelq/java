package aufgaben;

public class BruchTest {
  public static void main(String[] args) {
    Bruch bruch = new Bruch(5,2);

    System.out.println(bruch.kehrwert ());
    System.out.println (bruch.addieren ( bruch));
    System.out.println (bruch.multiplizieren ( bruch ));
    System.out.println (bruch.toString ());
  }
}
