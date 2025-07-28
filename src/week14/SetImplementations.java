package week14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetImplementations {

    public static void main(String[] args) {

        Set<String> emails = new HashSet<>();

        emails.add("alice@gmail.com");
        emails.add("bob@gmail.com");
        emails.add("charlie@gmail.com");
        emails.add("alice@gmail.com");

        System.out.println("emails = " + emails);

        System.out.println("size = " + emails.size());
        for(String email : emails) {
            System.out.println(email);
        }

        if (emails.contains("bob@gmail.com")) {
            System.out.println("bob's email is in set");
        }

        emails.remove("bob@gmail.com");
        System.out.println("After removal = " + emails);


        System.out.println("----LinkedHashSet-----");
        /*
        Unique values - remembers insertion order
         */
        Set<String> visitedPages = new LinkedHashSet<>();
        visitedPages.add("Home");
        visitedPages.add("About");
        visitedPages.add("Contact");
        visitedPages.add("Blog");
        visitedPages.add("Blog");
        System.out.println("visitedPages = " + visitedPages);

        visitedPages.forEach(page -> System.out.println("- " + page));

    }


}

