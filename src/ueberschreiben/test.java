package ueberschreiben;

/**
 * Created by Rackenrotz on 20.05.15.
 */
public class test {

    public static void main(String[] args) {
        Broccoli a = new Broccoli();
        a.eat(42);
        System.out.println("");
        a.eat(42.0);

        // bei  a.eat(42); erhaltet man Broccoli, da von der Klasse Foot geerbt wird und mit der Klasse Broccoli überschreiben wird.
        // bei a.eat(42.0) erhaltet man Vegetable, da die Methode dann von Vegetable erbt und dies Wert dann für Broccoli überschrieben wird.
        // Damit für jeden ersichtlich ist, dass bei gleicher Methoden signatur die Methode von einer Darüberliegenden überschrieben werden kann.


        //erstmal muss gewählt werden aus welchem datentyp gewählt werden soll. Wählt man int muss man ncihts mehr machen,
        //ansonsten muss man auf int casten. Als Ausgabe erhatlen wir diejenigen die vom Typ der supermehtode von allen Überklassen int oder double ()
        //je nach Wahl enthalten
    }
}
