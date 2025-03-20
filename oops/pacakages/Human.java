package oops.pacakages;

public class Human {

    int salary ;
    String name;
    int age ;
    boolean married;
    static long population;

    static void message(){
        System.out.println("hello everyone!!!");
     //   System.out.println(this.age);
     // can not use this over here because this depends upon the 
     // the objects and static does not depends upon 
     // the objects
    }

    public Human(int salary,String name,int age,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population  += 1;
        Human.message();
    }

    
}
