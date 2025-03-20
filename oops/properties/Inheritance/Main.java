package oops.properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();

        System.out.println(box1.height + " "+  box1.width + " "+  box1.length);

        Boxwweigth box3 = new Boxwweigth();
     // extending the boxweight class using the inheritance
        System.out.println(box3.height + " " + box3.weight);

        Box box4 = new Boxwweigth(2,3,4,5);
        System.out.println(box4.length);
        // System.out.println(box4.weight);
        // weigth can't be access because it is refrencing class (box that
        // determine what properties can be accsessed not the one 

        BoxPrice box = new BoxPrice(5,8,200);



    }
    
}
