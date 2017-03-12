import java.util.ArrayList;

/**
 * Created by AmmY on 11/03/17.
 */
public class ImplementStack
{
    public int stackasArray [];
    public int tos;
    public int maxSize;

    public ImplementStack(int size){
        stackasArray = new int[size];
        tos = -1;
        maxSize = size;
    }
    void push(int val){
        if(tos == maxSize-1){
            System.out.println("STACK OVERFLOW");
            return;
        }
        tos++;
        stackasArray[tos] = val;

    }
    public int pop(){
    if(tos==-1){
        System.out.println("Stack underflow");
        return -1;
    }
    return stackasArray[tos--];
    }

    int peek(){
        if(tos==-1){
            System.out.println("Empty Stack");
            return -1;
        }
        return stackasArray[tos];

    }

    public static void main(String[] args) {
        ImplementStack implementStack = new ImplementStack(10);
        implementStack.push(12);
        implementStack.push(13);
        implementStack.push(3);
        System.out.println(implementStack.pop());
        System.out.println(implementStack.peek());
    }
}
