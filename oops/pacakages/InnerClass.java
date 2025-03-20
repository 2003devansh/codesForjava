package oops.pacakages;

/**
 * InnerClass
 */

 // outside classes can not be static  because it itself is not dependin on any other class
public class InnerClass {

  static class test{
    String name;
     

    public test(String name){
        this.name = name;
    }
  }
  public static void main(String[] args) {
    test a = new test("devansh");
    test b = new test("amit");

  }
    
}