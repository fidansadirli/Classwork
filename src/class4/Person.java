package class4;

public class Person {

        String name;
        static int counter = 0;
        boolean isMember;


        public Person(){
            this.isMember = false;


    }
    public Person(String name_){
      //      this(name_, isMember: false);
        this.name = name_;
        this.isMember = false;
        counter+=2;
    }
    public Person(String name_, boolean isMember){
            this.name = name_;
            this.isMember = isMember;
            counter++;
        }


}
