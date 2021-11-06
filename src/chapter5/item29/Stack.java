package chapter5.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

// 아이템 7에서 다룬 Stack을 제네릭으로 변경
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // 하지만 여기서 컴파일 되지 않는다.
    public Stack(){
        elements = new E[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        elements[size++] = e;
    }

    public E pop(){
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null;
        return result;

    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
