package oct25;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Settask {

    public static final int SET_SIZE_REQUIRED = 20;

    public static void main(String[] args) {
        Random random = new Random();


        Set set = new HashSet<Integer>(SET_SIZE_REQUIRED);

        while(set.size()< SET_SIZE_REQUIRED) {
            int NUMBER_RANGE = random.nextInt(21) - 10;
            set.add(NUMBER_RANGE);

        }

        assert set.size() == SET_SIZE_REQUIRED;
        System.out.println(set);
    }
}