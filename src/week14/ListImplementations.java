package week14;


import java.util.*;

public class ListImplementations {

    public static void main(String[] args) {

        List<String> groceryList = new ArrayList<>();

        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Eggs");
        groceryList.add("Apples");

        System.out.println("Grocery List: " + groceryList);

        System.out.println("First Item: " + groceryList.get(0));
        groceryList.set(1, "Whole Grain Bread");
        System.out.println("After updating: " + groceryList);

        groceryList.remove(2);
        System.out.println("After removing: " + groceryList);

        if (groceryList.contains("Milk")){
            System.out.println("Milk is in the List");
        }else{
            System.out.println("Milk is not in the List");
        }

        System.out.println("Items in the grocery list:");
        for (String each : groceryList){
            System.out.println("- " + each);
        }

        System.out.println("Total items: " + groceryList.size());


        System.out.println("-----LinkedList-----");

        List<String> teamList = new LinkedList<>();
        teamList.addAll(List.of("SDET", "Developer", "Manual QA", "BA", "Scrum Master", "PO", "DevOps"));
        System.out.println("Team: " + teamList);

        teamList.set(0, "Software Development Engineer in Test");
        System.out.println("After update: " + teamList);

        System.out.println("First: " + teamList.get(0));
        System.out.println("Last: " + teamList.get(teamList.size()-1));

        teamList.remove("BA");
        teamList.remove("PO");
        System.out.println("After removing: " + teamList);

        System.out.println("Team structure:");
        for(String role : teamList) {
            System.out.println("- " + role);
        }

        System.out.println("-----Vector-----");

        /*
        Legacy version of ArrayList , it is thread safe/syncronized
         */

        List<Integer> vector = new Vector<>();
        vector.add(234);
        vector.add(123);
        vector.add(765);

        System.out.println("vector = " + vector);
        int sum = 0;
        for(int num : vector) {
            sum += num;
        }
        System.out.println("Sum = " + sum);

        System.out.println("-----Stack-----");

        /*
        LIFO -> Last in First out
        push() -> adds to top of stack
        peek() -> returns value at top of stack
        pop() -> removes and returns value from top of stack
         */
        Stack<String> browserHistory = new Stack<>();
        browserHistory.push("Home Page");
        browserHistory.push("About Us");
        browserHistory.push("Contact Page");
        browserHistory.push("Blog Page");

        System.out.println("browserHistory = " + browserHistory);
        System.out.println("current page : " + browserHistory.peek());//does not remove
        System.out.println("going back from : " + browserHistory.pop()); //removes value and returns
        System.out.println("Now we are at : " + browserHistory.peek());

        if (browserHistory.contains("Home Page")) {
            System.out.println("Home Page is in history");
        }

        System.out.println("Pages size : " + browserHistory.size());


    }
    /*

     List<Integer> nums = randomList(100);
        System.out.println("nums = " + nums);

        System.out.println("-------for each loop-----------");
        for (int num : nums){
            System.out.print(num + " ");
        }

        System.out.println("\n-------for loop-------------");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");

        }

        System.out.println("\n------forEach()-------");
        nums.forEach(num -> System.out.print(num + " "));


        System.out.println("\n------Iterator-------");
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println("-----Streams------");
        System.out.println("-----Streams------");
        //source -> operations(filter) -> return value
        List<Integer> smallNumbers = nums.stream().filter(num -> num <= 500).toList();
        List<Integer> bigNumbers = nums.stream().filter(num -> num > 500).toList();

        System.out.println("smallNumbers = " + smallNumbers.size() + " => " + smallNumbers);
        System.out.println("bigNumbers = " + bigNumbers.size() + " => " + bigNumbers);

        System.out.println("---- Iterator remove() ----");
//
//            difference between for each loop and iterator:
//                Iterator can remove() inside loop
//                For each cannot -> ConcurrentModification exception
//
    //remove numbers more than 200
    Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
        int current = iter.next();
        if (current > 200) {
            iter.remove();
        }
    }

        System.out.println("After removing > 200 : " + nums);

        System.out.println("----removeIf()----");
        nums.removeIf(n -> n > 10);
        System.out.println("nums = " + nums);
}




}

public static List<Integer> randomList(int count) {
    Random rd = new Random();
    List<Integer> nums = new ArrayList<>();
    for (int i = 1; i <= count; i++) {
        nums.add(rd.nextInt(1000)); //get random number 0-1000 and add to list
    }
    return nums;
}

     */

}
