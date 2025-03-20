package oops.pacakages;


// this is a demo to show initialize of stattic variable
public class StaticBlock {

    static int a = 4;
    static int b;


    // will only run once , when the first ob is created i.e. when the class is loaded for the first time
    static{
        System.out.println("i am in a static block ");
        b = a * 5;

    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " "+  StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " "+  StaticBlock.b);
    }
    
}
