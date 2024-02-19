import java.util.ArrayList;
import java.util.List;

public class StackWithList {
    List<Integer> list;
    static int countr;
    public StackWithList(){
        countr=-1;
        list = new ArrayList<> ();
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public void push(int data){
        list.add(data);
        countr++;
    }
    public int pop(){
        if (countr ==-1){
            return -1;
        } else{
            return list.get(countr--);
        }

    }
    public int peek(){
        if (countr==-1){
            return -1;
        } else{
            return list.get(countr);
        }
    }

    public static void main (String[] args) {
        StackWithList stack = new StackWithList();
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
