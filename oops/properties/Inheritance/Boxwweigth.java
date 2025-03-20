package oops.properties.Inheritance;

public class Boxwweigth extends Box {
    static double weight ;
   

    public Boxwweigth(BoxPrice other) {
        this.weight = -1;
    }


     Boxwweigth(double side ,double weight){
      super(side);
        this.weight = weight;
    }

    public Boxwweigth(double height, double width, double length, double weight) {
        super(height, width, length); // super keyword :- call the parent class contructor
        // used to intialize value of parent class constructor
        this.weight = weight;
    }

    public Boxwweigth() {
        //TODO Auto-generated constructor stub
    }
    
    
}
