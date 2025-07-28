package week14;

import java.util.*;

public class MapImplementations {
    public static void main(String[] args) {
        /*
        Map -> Key + Value format
        Keys -> unique
        Values -> be be duplicated
         */
        Map<String, Long> countries = new HashMap<>();
        countries.put("USA", 340000000L);
        countries.put("Turkiye", 86000000L);
        countries.put("Italy", 59000000L);
        countries.put("France", 69000000L);

        System.out.println("countries = " + countries);

        System.out.println("USA population = " + countries.get("USA"));
        System.out.println("Turkiye population = " + countries.get("Turkiye"));

        countries.remove("France");
        System.out.println("After removing = " + countries);

        //update Turkiye to 87000000
        countries.put("Turkiye", 87_000_000L);
        countries.put("USA", 347_000_000L);
        System.out.println("countries = " + countries);

        //check if Italy in map
        if (countries.containsKey("Italy")) {
            System.out.println("Italy is in the map");
        }

        //separate keys and values
        System.out.println("keys = " + countries.keySet());
        System.out.println("values = " + countries.values());

        //looping hashmap
        Map<String, Integer> studentGrades = new HashMap<>(Map.of("Bob", 92, "Alice", 85, "Diana", 90, "Charlie", 78));
        //Use for each loop with keys
        for(String key : studentGrades.keySet()) {
            System.out.println(key + " -> " + studentGrades.get(key));
        }

        studentGrades.forEach((k ,v) -> System.out.println(k + " >>> " + v));

        //Loop through map entries:
        System.out.println("\nAll student grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        //LinkedHashMap keeps insertion order

        Map<String, String> email = new LinkedHashMap<>();
        email.put("sender", "sales@amazon.com");
        email.put("receiver", "mike@google.com");
        email.put("subject", "Order confirmation 12242");
        email.put("body", "Thank you for shopping with Amazon.com");

        System.out.println("email = " + email);

        //TreeMap sorts by keys
        Map<String, String> phoneBook = new TreeMap<>();

        // ✅ Add contacts
        phoneBook.put("Charlie", "555-7890");
        phoneBook.put("Alice", "555-1234");
        phoneBook.put("Diana", "555-4567");
        phoneBook.put("Bob", "555-9999");

        System.out.println("phoneBook = " + phoneBook);


    }
}