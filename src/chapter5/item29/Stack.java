package chapter5.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

// 아이템 7에서 다룬 Stack을 제네릭으로 변경
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // 하지만 여기서 컴파일 되지 않는다.
    // 실체화 불가 타입으로는 배열을 만들 수 없다.
    // 제약을 대놓고 우회해서 제네릭 배열 생성
    // 컴파일러는 오류 대신 경고를 표시함
    public Stack(){
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
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
