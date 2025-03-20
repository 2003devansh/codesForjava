package queues.circularqueue;

public class circularQ {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


   private int end = 0;// check notes if gets confused
   private int front = 0;
   private int size = 0;


    public circularQ(){
        this(DEFAULT_SIZE);
    // if size is not pased in the constructor this will execute
    }

    public circularQ(int size){
        this.data = new int[size];
    }


    public boolean isFull(){
        return size == data.length ;
        // poinetr is at last index
    }



     public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end] = item;
        end =  end % data.length;
        size++;
        return true; 
    }

    public boolean remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
    
        }
     
        int removed = data[front];
        // shifting the element towards left
     
        end--;
        return remove();

    }

}
