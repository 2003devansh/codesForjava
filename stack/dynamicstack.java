package stack;
// since the stack is of fixed size and it get full to  deal with that we need a dynammic stack that nec=ver gets full
public class dynamicstack extends customstackoi {
    public dynamicstack(){
        super(); // it will call an constructor from the customstackoi that is not taking any argument AKA customstackoi()
    }

     public dynamicstack(int size){
        super(size); // it will call an constructor from the customstackoi that is  taking  argument AKA customstackoi(ont size)
    }

    // the only problem we are facing in parent class
    // is push method becausse it gets full so we can use overide method to override the  push of parent class

    @Override
    public boolean push(int item){
        //  this takes care of it being full
        if(this.isFull()){
            // double the array
            int[] temp = new int[data.length *2];

            // copy all the previous item in new data
            for(int i =0 ;i< data.length;i++){
                temp[i] = data[i];
            }
          data = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
}
