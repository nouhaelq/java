package aufgaben;

public class DozentTest {
  public static void main(String[] args) {
    Dozent dieDozentin = new Dozent ( "paula","mathe",'w' );
    Dozent derDozent = new Dozent ( "ben","inform",'m' );
    System.out.println (derDozent.getLehrgebiet ());
    System.out.println (dieDozentin.getGeschlecht ());
    System.out.println (dieDozentin.getName ());

    // Hier steht ein Fehler, ich weiß nicht warum

    // String neuLehrgebiet = dieDozentin.setLehrgebiet ( "SWT" );
    //   System.out.println (neuLehrgebiet);
  }
}
