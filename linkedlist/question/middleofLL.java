package question;

public class middleofLL {
    
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f=head;
        while(f!=null && f.next != null){
          s = s.next;
          f = f.next.next;

        }
        return s;
    }
    
  
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}

      ListNode(int val){
        this.val = val; 
    }
      ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
     }
  }
 
}
