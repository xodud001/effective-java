package chapter3.item13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        elements[size++] = e;
    }

    public Object pop(){
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;

    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        // Stack 내부에 있는 elements라는 가변 객체는 clone될 때 복사되지 않아서
        // s1과 s2는 다른 객체지만 각각의 내부에 있는 elements는 같은 객체를 참조하기 때문에 치명적인 오류가 발생할 수 있다.
        Stack s1 = new Stack();
        Stack s2 = (Stack) s1.clone();
    }
}
