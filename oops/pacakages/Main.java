package oops.pacakages;

import question.happynumber;
import randomjavaprograme.greeting;

public class Main {
    public static void main(String[] args) {
        Human devansh = new Human(20000,"devansh", 20, false);
        Human person2 = new Human(1000, "person2", 20, false);

        
       System.out.println(Human.population);
       // population is an static kwyword 
       // it can be accessed with out even mentionaing the obejct of the human class
       // means if we delete both the object we can still access the populatuion 

       greeting();
    
    
 }

//  void greeting(){
//     System.out.println("hello world");
//  }
 // upon calling this in main class it will throw error 
 // because in static main class we can not call something non static
 //  we know sommething which is non static belongs to an instatance




 // ---> on the other hand if we call it like this :->

 static void greeting(){
    System.out.println("hellol world");
 }

 static void fun(){
   System.out.println("hello there");
   
   Main obj = new Main();
   obj.imagination();
   // you cannot access non static stuff without refrencing their instances
   //in a static content.
   // hence here i am refrencibng it
 }

 void imagination(){
    System.out.println("hi amimagination");
 }

}
   
// any function that contain stattic ... it self does not depends o0n the instances
// then how you can call something (non static function) that depends on the instances