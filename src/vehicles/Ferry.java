package vehicles;

/**
 * Created by Rackenrotz on 20.05.15.
 */
public class Ferry implements vehicle {

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String moveTo(Position newPosition) {
        return null;
    }
}
