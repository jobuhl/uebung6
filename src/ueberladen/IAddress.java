package ueberladen;

/**
 * Created by Rackenrotz on 20.05.15.
 */
public interface IAddress {

    void getStreet();

    void setStreet();

    void getPostcode();

    void setPostcode();

    void getCity();

    void setCity(int zip);

    void setCity(String city);

    void setCity( int zip, String city);

}

