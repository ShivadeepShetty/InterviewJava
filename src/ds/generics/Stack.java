package ds.generics;

public class Stack<E>{

    private final int size;
    private  int top;
    private E[] elements;

    public Stack(){
        this(10);
    }

    public Stack(int size){
        this.size =size;
        top = -1;
        elements = (E[])new Object[size];
    }
    public void push(E value) throws FullStackException {
        if(top == size -1){
            throw new FullStackException(String.format("stack is full,cannot push %s",value));
        }

        elements[++top] = value;
    }



    public E pop() throws EmptyStackException {
       if(top == -1){
           throw  new EmptyStackException("Stack is empty,cannot pop");
       }
       return elements[top--];
    }
}
