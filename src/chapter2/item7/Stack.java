package chapter2.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

// 여기서 메모리 누수가 일어나는 위치는 어디인가?
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        elements[size++] = e;
    }
    
    // 활성 영역 밖의 원소들의 참조를 해제해서 가비지 컬렉터에 의해 회수되도록 함
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
}
