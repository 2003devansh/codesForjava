package singlylinkedLL;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
//insertion fist element
     public void insertfirst(int val){
        Node node = new Node(val);
        node.next  = head;
        head = node;

        if(tail == null){
            tail = head;
        }

         size += 1;

     }

     //display of LL :-

     public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
            
        }
        System.out.print("end");
     }
     // insertion at last index
     public void inserlast(int val){

         if(tail == null){
            insertfirst(val); // if tail is not present aka ll is empty need to create an ll by inserting the element
            return;
         }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

     }

     //if we want to insert a element with in the ll we need to first get in to the node just the previous one where we waant to insert the element
     // means if we want to insert a element at 4th index . then we need to get on 3rd index then 
     //next is going to be the new node that we've created..
     // and we also need to remove the previous path that pointing  to the  old element
  
     public void  insertinindex(int val,int index){
        if(index== 0){
            insertfirst(val);
            return;
        }

         if(index == size ){
            inserlast(val);
            return;
        }

        Node temp = head; // this itself is a 0 so starting from 1 in loop
         for( int i = 1; i < index;i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
        // its a node that we've created

     }

     //delete first

     public int deletefirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail= null;
        }

        size--;
        return val;
     }
   
     //deletelast 
  // first we need to get the second last node
  // if we put any muber it will point refrence pointer to that node
  // if LL has an 3,5,6,9 element this get function will to get to 6 and 6 will point to 9 ,, so size will be size - 2
   public int deletelast(){
        if( size <= 1){
            return deletefirst();
        }
      Node secondLast = get(size - 2);
      int val = tail.value;
     tail = secondLast;
     tail.next = null;

      return val;

    }
    public Node get(int index){
        Node node = head;
        for( int i = 0 ; i < index ; i++){
            node = node.next;
        }
        return node;
    }
   
   // delete at perticuar index
   public int delete(int index){
    if(index==0){
        return deletefirst();
    }
    if(index == size- 1){
        return deletelast();
    }

    Node prev = get(index - 1);
    // getting to the previous index that we want to delete
    int val = prev.next.value; 
    // this is the index that we want to delete
    prev.next = prev.next.next;
    
    return val;
   }

   // to find the value if exist in LL\

   public Node find(int value){
    Node node = head;
    while (node != null){
        if(node.value ==value){
            return node;

        }
        node = node.next;
    }
    return null;
   }


     private class Node {
        private int value;
        private Node next;


        public Node(int value){
            this.value = value;

        }

            public Node(int value,Node next){
            this.value = value;
            this.next = next;
            
        }
     
    }

    
    // --> questionss ..... >> 
 // delete all the duplicate
    public void duplicate(){

         Node node = head;
          while(node.next  != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
          }
          tail = node;
          tail.next = null;
    }

// merging of two linked list in sorted manner
  public static LL merge(LL first , LL second){
    Node f = first.head;
    Node s = second.head;

    LL ans  = new LL();

     while ( f != null && s != null) {
        if( f.value < s.value){
            ans.inserlast(f.value);
            f = f.next; // passing the value of head of first LL to its second element because first element is compared to the first element of second LL
         
        }   else{
                ans.inserlast(s.value);
                s = s.next;
            }
       
            
     }

     while (f != null) {
        ans.inserlast(f.value);
       f = f.next;
        
     }

     while (s != null) {
     ans.inserlast(s.value);
     f = f.next;
        
     }
      return ans;
  }

  // to find cycle
  public boolean hasCycle(Node head) {
    Node fast = head;
    Node slow = head;
     

     while( fast != null && fast.next != null){
         fast = fast.next.next;
         slow = slow.next;
         if(fast == slow){
             return true;
         }
     }
     return false;
}


// length of the cycle 

 public int lengthCycle(Node head) {
    Node fast = head;
    Node slow = head;
     

     while( fast != null && fast.next != null){
         fast = fast.next.next;
         slow = slow.next;
         if(fast == slow){
            // calculating length
          Node temp = slow;
          int length = 0;
          do{
            temp = temp.next;
            length++ ;

          }while( temp != fast);
          return length;
         }
     }
     return 0;
}

//  finding the startong point of the cycle:- 

public Node detectCycle( Node head){
    int length = 0;
       Node fast = head;
    Node slow = head;
     

     while( fast != null && fast.next != null){
         fast = fast.next.next;
         slow = slow.next;
         if(fast == slow){
             length = lengthCycle(slow);
              break;
         }
     }
// we got the cycle now we need to find the start
// finding the start node:-
if(length == 0){
    return null;
}
Node f = head;
Node s = head;
 while (length > 0) {
    s = s.next;
    length--;
    
 }
 // keep moving both forward and they will meet atv cycle start;
  while(f!= s){
    f = f.next;
    s= s.next;
  }
   return s;
}


}
