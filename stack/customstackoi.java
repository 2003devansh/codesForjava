package stack;

public class customstackoi {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    int ptr = -1;// check notes if gets confused

    public customstackoi(){
        this(DEFAULT_SIZE);
    // if size is not pased in the constructor this will execute
    }

    public customstackoi(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
      
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        
       ptr++;
       data[ptr] = item;
       return true;
    }

    public int  pop() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop from an empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{

           if(isEmpty()){
            throw new Exception("cannot peek from an empty stack");
        }
        return data[ptr];
        //return what is  at the top
    }

    public boolean isFull(){
        return ptr == data.length - 1;
        // poinetr is at last index
    }

     public boolean isEmpty(){
        return ptr == -1;
     }
    
}
