package class4;

import class4.StaticX;

public class StaticApp {

    public static void main(String[] args) {
        StaticX st1 = new StaticX();
        StaticX st2 = new StaticX();
        st1.age =33;
        st2.age= 44;
        st1.smth = 66;
        st2.smth = 77;
        System.out.println(st1.smth);
        System.out.println(st2.smth);

    }
}
