package class23oct;

import java.util.ArrayList;
import java.util.Random;

public class Arraytask {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        Random rand = new Random();


        for (int i = 0; i < 100; i++) {
            int pick = rand.nextInt(100);
            list.add(pick);
        }

        for (int i = 0; i < 100; i++) {
            if( list.get(i)%2==1){
                odd.add(list.get(i));

            }else{
                even.add(list.get(i));

            }

        }

        list.forEach((Integer item) -> System.out.println(item));
        System.out.println();
        odd.forEach((Integer item) -> System.out.println(item));
        System.out.println();
        even.forEach((Integer item) -> System.out.println(item));

    }

}