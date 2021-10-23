package chapter3.item13;

public class HashTable implements Cloneable{
    private Entry[] buckets = new Entry[10];
    private int SIZE = 0;
    private static class Entry{
        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Entry deepCopy(){
            //재귀적으로 복사할 경우 리스트의 크기가 너무 커져 스택오버플로우가 발생할 수 있음
            //반복자를 써서 순회하는 방식으로 수정
            Entry result = new Entry(key, value, next);
            for(Entry p = result ; p.next != null ; p = p.next)
                p.next = new Entry(p.next.key, p.next.value, p.next.next);

            return result;
        }
    }

    public void put(Object key, Object value){
        buckets[SIZE++] = new Entry(key, value, null);
    }

    @Override
    public HashTable clone() {
        try{
            HashTable result = (HashTable)super.clone();
            result.buckets = new Entry[buckets.length];
            // buckets가 담고 있는 객체까지 복제를 해줘야 한다.
            for (int i = 0; i < buckets.length; i++) {
                if(buckets[i] != null)
                    result.buckets[i] = buckets[i].deepCopy();
            }
            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }

    }

    public static void main(String[] args) {
        HashTable h1 = new HashTable();
        h1.put("key", "value");
        HashTable h2 = h1.clone();
    }
}
