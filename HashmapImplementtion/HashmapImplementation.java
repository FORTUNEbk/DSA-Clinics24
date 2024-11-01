import java.util.LinkedList;

class SimpleHashMap<K, V> {
    private class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private LinkedList<Entry<K, V>>[] map;

    public SimpleHashMap() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            map[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = map[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; 
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = map[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        SimpleHashMap<Integer, String> hashmap = new SimpleHashMap<>();

        hashmap.put(1, "one");
        hashmap.put(2, "two");
        hashmap.put(3, "three");

        System.out.println(hashmap.get(1));  
        System.out.println(hashmap.get(2));  
        System.out.println(hashmap.get(3));  
    }
}
