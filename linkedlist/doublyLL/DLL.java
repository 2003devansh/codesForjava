 package doublyLL;


public class DLL {
     private Node head;
 // insertion in ll
      public void insertfirstDLL(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if( head != null){
            head.prev = node;
        }
        head = node;

      }
// display 
     public void display(){
        Node node = head;
        while( node != null){
            System.out.print(node.val + " ->");
            node  = node.next;
        }
        System.out.print("End");
     }
    
     // insert in last 
     public void insertlastDLL(int val){
        Node node = new Node(val);
        Node temp = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;

        }
       while(temp.next != null){
          temp = temp.next;
       }
       temp.next = node;
    node.prev = temp;
     }

     // insert after the particular value 
      public Node find(int value){
        Node node = head;
        while( node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;

        }
         return null;
      }

      public void insertaftervalue(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("does not exist");
            return;
        }
         Node node = new Node(val);
         node.next = p.next;
         p.next = node;
         node.prev = p;
         if(node.next != null){
            node.next.prev = node;
         }
      }

    private class Node{
      private  int val;
        private Node next;
        private Node prev;


        public Node(int val){
        this.val = val;
     }



    public Node(int val, Node next , Node prev){
    this.val = val;
    this.next = next;
    this.prev = prev;
   }
 }
} 