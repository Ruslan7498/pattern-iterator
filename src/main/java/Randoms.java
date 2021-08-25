import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int randomValue = getRandomValue();

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                randomValue = getRandomValue();
                return randomValue;
            }
        };
    }

    public int getRandomValue() {
        int randomValue;
        while (true) {
            randomValue = random.nextInt(max + 1);
            if (randomValue >= min & randomValue <= max) break;
        }
        return randomValue;
    }
}