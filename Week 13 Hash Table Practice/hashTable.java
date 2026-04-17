import java.util.LinkedList;
import java.util.ArrayList;

public class hashTable {
    private class entry {
        int key;
        String value;

        public entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private ArrayList<LinkedList<entry>> Buckets = new ArrayList<>();
    private int n;

    public hashTable(int n) {
        this.n = n;

        for (int i = 0; i < n; i++) {
            Buckets.add(new LinkedList<>());
        }
    }

    public void hashInsert(int key, String value) {
        int index = key % n;

        LinkedList<entry> bucket = Buckets.get(index);

        for (entry node : bucket) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        bucket.add(new entry(key, value));
    }

    public void printTable() {
        for (int i = 0; i < n; i++) {
            System.out.print("Bucket " + i + ": ");

            LinkedList<entry> bucket = Buckets.get(i);

            if (bucket.isEmpty()) {
                System.out.println("empty");
                continue;
            }

            for (entry element : bucket) {
                System.out.print("(" + element.key + ", " + element.value + ") -> ");
            }

            System.out.println("empty");
        }
    }
}