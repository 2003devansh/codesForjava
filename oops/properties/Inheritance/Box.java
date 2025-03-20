package oops.properties.Inheritance;

public class Box {
    double height ;
    double width;
    double length;


 Box(double height,double width,double length){
    this.height = height;
    this.width = width;
    this.length = length;

 }

 // cube 

 Box(double side){
   this.length = side;
   this.width = side;
   this.height = side;

 }

 Box(){
   this.length = -1;
   this.width = -1;
   this.height = -1;
 }

 public void information(){
   System.out.println("running the box");
 }
    
}
