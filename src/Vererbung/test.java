package Vererbung;

import java.util.Objects;

/**
 * Created by Rackenrotz on 20.05.15.
 */
public class test {


    public static void main(String[] args) {


        Vehicle[] array = new Vehicle[7];

        array[0] = new VW();
        array[1] = new Airbus();
        array[2] = new Ferry();
        array[3] = new Seaplane();
        array[4] = new Tricycle();
        array[5] = new FlyingSaucer();
        array[6] = new Porsche();

        System.out.println("Cars: ");
        for (Vehicle k : array) {



            if (k instanceof Car) System.out.println(k);


        }

        System.out.println("");
        System.out.println("Boats: ");
        for (Vehicle k : array) {


            if (k instanceof Boat) System.out.println(k);

        }

        System.out.println("");
        System.out.println("Aircrafts: ");
        for (Vehicle k : array) {

            if (k instanceof Aircraft) System.out.println(k);

        }


    }


}
