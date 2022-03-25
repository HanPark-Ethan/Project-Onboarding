import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {

    private int[] stackArray;
    private int top;
    private int capacity;

    public MyStack(int size){
        stackArray = new int[size];
        this.capacity = size;
        top = -1;
    }

    public void push(int value){
        if(!isFull()){
            stackArray[++top] = value;
        }else{
            throw new NullPointerException();
        }
    }

    public int pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }else{
            throw new NullPointerException();
        }
    }

    public int max(){
        if(!isEmpty()){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < stackArray.length; i++){
                if(stackArray[i] > max) max = stackArray[i];
            }
            return max;

        }else{
            throw new NullPointerException();
        }
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                ", top=" + top +
                ", capacity=" + capacity +
                '}';
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(6);
        stack.push(5);
        stack.push(30);
        stack.push(10);
        System.out.println(stack);
        System.out.println(stack.max());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
