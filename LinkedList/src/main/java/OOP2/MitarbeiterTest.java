package OOP2;

public class MitarbeiterTest {
  public static void main(String[] args) {

    Manager manager = new Manager ( "Heinrich Müller", 50000, 45 );

    Geschaftsfuehrer geschaftsfuehrer = new Geschaftsfuehrer ( "Erika Schmidt",100000,50,20000 );

    System.out.println ("Manager: " );
    System.out.println ( "Name : " + manager.getName ()
                       + " Personalnummer : " + manager.getPersonalnummer ()
                       + " Gehalt : " + manager.berechneGehalt ());

    System.out.println ();

    System.out.println ("Geschatsfuehrer: " );
    System.out.println ( "Name : " + geschaftsfuehrer.getName ()
                       + " Personalnummer : " + geschaftsfuehrer.getPersonalnummer ()
                       + " Gehalt : " + geschaftsfuehrer.berechneGehalt ());




  }
}
