package HashTables;

import java.util.*;

public class HashTableDSA {
    //  Hashtable = A data structure that stores unique keys to values <Integer, String>
    //              Each key/value pair is known as Entry
    //              FAST insertion, look up, deletion of key/value pairs
    //              Not ideal for small data sets, ideal with great data sets

    //  hashing = takes a key and computes an integer2 (formula will vary based on key & data type)
    //              In a hashtable, we use the hash % capacity to calculate an index number

    //              key.hashCode() % capacity = index

    //  bucket = an indexed storage location for one or more entries    
    //             can store multiple Entries in a case of collision (linked similarly as Linked List)

    //  collision = hash function generates the same index for more than one key
    //              less collision = more efficiency

    //              runtime complexity: O(1) best, O(n) worst
    public static void main(String[] args) {
        var table = new Hashtable<Integer, String>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrik");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        System.out.println("\n<Integer, String> hashtable:");

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
            // System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

        table.remove(777);

        var strTable = new Hashtable<String, String>(21);

        strTable.put("100", "Spongebob");
        strTable.put("123", "Patrik");
        strTable.put("321", "Sandy");
        strTable.put("555", "Squidward");
        strTable.put("777", "Gary");

        System.out.println("\n<String, String> hashtable:");

        for (String key : strTable.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t" + strTable.get(key));
        }
        System.out.println();
    }
}
