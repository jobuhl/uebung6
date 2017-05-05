package ueberladen;

/**
 * Created by Rackenrotz on 20.05.15.
 */
public class Address implements  IAddress {
    @Override
    public void getStreet() {

    }

    @Override
    public void setStreet() {

    }

    @Override
    public void getPostcode() {

    }

    @Override
    public void setPostcode() {

    }

    @Override
    public void getCity() {

    }

    @Override
    public void setCity(int zip) {

        System.out.println(zip);
    }

    @Override
    public void setCity(String city) {
        System.out.println(city);
    }

    @Override
    public void setCity(int zip, String city) {

        System.out.println(zip + " " + city);
    }
}
