package chapter4.item18;

import java.util.*;

public class InstrumentedHashSet<E> extends ForwardingSet<E> {
    //추가된 원소의 수
    private int addCount = 0;

    public InstrumentedHashSet(Set<E> s){
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>(new TreeSet<>());
        s.addAll(List.of("틱", "틱틱", "탕"));
        // 3이라고 예상하겠지만 실제로 6이 나옴
        // addAll을 하면 내부에서 반복문을 통해 add를 호출하므로
        // addAll에서 +3이 일어나고 각각의 add에서 +1씩 일어나서 총 6이 됨
        System.out.println(s.getAddCount());
    }
}
