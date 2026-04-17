public class hashInsertDemo {
    public static void main(String[] args) {
        // hash codes are determined by key % n
        // its then put in the corresponding index of my arraylist, acting as my hashtable
        hashTable table = new hashTable(5);

        // 10 % 5 = 0 , so bucket zero and so on
        table.hashInsert(10, "apple");
        table.hashInsert(15, "banana");
        table.hashInsert(20, "cherry");
        // 7 % 5 = 2, into bucket 2
        table.hashInsert(7, "mango");
        table.hashInsert(12, "orange");

        //Overwrites banana since its the same key
        table.hashInsert(15, "Banana, but again");

        System.out.println("Insertion finished");
        table.printTable();
    }
}
