package oops.Constructor;

/**
 * video1
 */
public class constructor {

    public static void main(String[] args) {
         
        Student name1 = new Student();
        System.out.println(name1.roll);

        Student name2 = new Student(14,"devansh",65.45f);
        System.out.println(name2.name);
        }
}
class Student{
    int roll;
    String name;
    float marks;


    // if no value is given this will take palace
    Student(){
        this.roll= 19;
        this.name = "default";
        this.marks= 00 ;
    } 

    // if the three value is given then the this will take place
    Student ( int roll , String name, float marks){
       
        this.roll = roll;
       this.name= name;
       this.marks = marks;
        
    }
}