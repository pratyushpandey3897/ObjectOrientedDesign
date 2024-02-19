public class StackWithArray {
    static int[] arr= new int[1000];
    static int countr;
    public StackWithArray(){
        countr=-1;
    }

    public boolean isEmpty(){
        if(countr==-1){
            return true;
        }
        return false;
    }

    public void push(int data){
        arr[++countr]=data;
    }
    public int pop(){
        if (countr ==-1){
            return -1;
        } else{
            return arr[countr--];
        }

    }
    public int peek(){
        if (countr==-1){
            return -1;
        } else{
            return arr[countr];
        }
    }

    public static void main (String[] args) {
        StackWithArray stack = new StackWithArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
