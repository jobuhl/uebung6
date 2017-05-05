package vehicles;

/**
 * Created by Rackenrotz on 20.05.15.
 */
public interface vehicle {

    int getMaxSpeed();

    String moveTo(Position newPosition);
}
