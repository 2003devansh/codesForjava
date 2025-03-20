package oops.properties.Inheritance;

public class BoxPrice extends Boxwweigth {

    double cost ;

   BoxPrice(){
    super();
    this.cost  = -1;
   } 
   
   BoxPrice(BoxPrice other){
    super(other);
    this.cost = other.cost;
   }


  public BoxPrice(double height, double width, double length) {
    super(height, width, length, weight);
    this.cost = cost;
}
   
   

    
}
