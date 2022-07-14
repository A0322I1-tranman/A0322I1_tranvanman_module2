package TH.Optional.Mystack;

public class MyStack {
    private int arr[];
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if(ifFull()){
            throw new StackOverflowError("Stack is Full");
        }
        arr[index] = element;
        index++ ;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
    public boolean isEmpty(){
        if (index==0){
            return true;
        }
        return false;
    }

    public boolean ifFull() {
        if (index == size) {
           return true;

        }
        return false;
    }
}
