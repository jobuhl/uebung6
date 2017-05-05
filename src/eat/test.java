package eat;

/**
 * Created by Rackenrotz on 20.05.15.
 */
public class test {

    public static void main(String[] args) {
        Broccoli a = new Broccoli();
        System.out.println("");
        Broccoli b = new Broccoli("Hallo");

        a.getClass();

    }

    //35.1
    // Ich erhatle alle Klassennamen, da durch die Vererbung jede Überklasse zustätzlich mit ausgegeben wird, da
    // die Eigenschaften von Food an Vegetable und diese an Broccoli vererbt

    //35.2
    /*Da die vererbenden Klassen keinen Eingabeparameter besitzen wird der Parameterlose Konstruktor aufgerufen.
     Bei der Untersten Klasse wird dann der Konstruktor mit Eingabeparameter aufgerufen der den String ausgibt.

    */
}
