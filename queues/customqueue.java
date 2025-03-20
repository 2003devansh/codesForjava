package queues;

public class customqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    int end = 0  ;// check notes if gets confused

    public customqueue(){
        this(DEFAULT_SIZE);
    // if size is not pased in the constructor this will execute
    }

    public customqueue(int size){
        this.data = new int[size];
    }


    public boolean isFull(){
        return end == data.length ;
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
        end++;
        return true; 
    }

    public boolean remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
    
        }
     
        int removed = data[0];
        // shifting the element towards left
        for(int i = 1;i< end;i++){
            data[i-1]  = data[i];
            // data of previous one is equal to the next one
        }
        end--;
        return remove();

    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
    
        }

        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
            

        }
        System.out.println("end");
    }
}
