package singlylinkedLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(6);
        list.insertfirst(9);
        list.insertfirst(8);
        list.insertinindex(100,3);
        list.inserlast(99);  

        // System.out.println(list.deletefirst());
        // list.display();
      
        System.out.println(list.delete(1));
        list.display();
    }
}
 