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
    public Stack clone() {
        try{
            Stack result = (Stack) super.clone();
            // 클래스가 참조하는 가변 객채를
            // clone 메소드 실행 시에 같이 복제되도록 해줘야 한다.
            result.elements = elements.clone();
            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Stack s1 = new Stack();
        Stack s2 = (Stack) s1.clone();
    }
}
