import java.util.Random;

public enum State {

    NATIONAL,
    NON_NATIONAL,
    SWINDLE;


    public static State generateRandom() {
        Random random = new Random();

        State[] values = State.values();

        int length = values.length;
        int randomIndex = random.nextInt(length);

        return values[randomIndex];
    }
}
