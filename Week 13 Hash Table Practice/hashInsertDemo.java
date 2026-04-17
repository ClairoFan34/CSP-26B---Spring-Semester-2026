public class hashInsertDemo {
    public static void main(String[] args) {
        // hash codes are determined by key % 10
        // its then put in the corresponding index of my arraylist, acting as my hashtable
        hashTable table = new hashTable(5);

        table.hashInsert(10, "Apple");
        table.hashInsert(15, "Banana");
        table.hashInsert(20, "Cherry");
        table.hashInsert(7, "Mango");
        table.hashInsert(12, "Orange");

        table.hashInsert(25, "Updated Banana");

        System.out.println("Insertion complete!");
        printTable();
    }
}
