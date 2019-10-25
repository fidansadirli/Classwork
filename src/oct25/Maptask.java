package oct25;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Maptask {

    public static final int SET_SIZE_REQUIRED = 20;

    public static void main(String[] args) {
        Map map = new HashMap();
        Random random = new Random();

        //    HashMap<String, Integer> map
        //          = new HashMap<>();

        for (int i = 1; i < 21; i++) {
            int num = (random.nextInt(31) - 10);
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < num; k++) {
                sb.append((char) (random.nextInt(('Z' - 'A' + 1)) + 'A'));

            }
            map.put(i, sb);
        }

        System.out.println(map.toString());


    }
}