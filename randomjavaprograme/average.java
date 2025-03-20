package randomjavaprograme;
import java.util.Scanner;

/**
 * average
 */
public class average {

    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        int a = Obj.nextInt();
        int b = Obj.nextInt();
        int c = Obj.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("average =" +avg);

    }
}