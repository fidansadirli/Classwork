package class4;

import java.util.Random;

public class Stringg {
    static StringBuilder generate(int number){
        final StringBuilder sb = new StringBuilder();
        Random sc = new Random();
        for(int i=0;i<number;i++){
            sb.append((char)(sc.nextInt(('Z'-'A'+1))+'A'));

        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(generate(6));

    }
}