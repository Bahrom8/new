package week14;

import java.util.*;

public class IteratingNumbers {

    public static void main(String[] args) {
        List<Integer> nums = randomList(100);
        System.out.println("nums = " + nums);

        System.out.println("---for each loop---");
        for(int num : nums) {
            System.out.print(num +" ");
        }

        System.out.println("\n----for loop----");
        for(int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) +" ");
        }

        System.out.println("\n----forEach()----");
        nums.forEach(num -> System.out.print(num +" "));

        System.out.println("\n----Iterator----");
        // create iterator object from list then while loop
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() +" ");
        }

        System.out.println("-----Streams------");
        //source -> operations(filter) -> return value
        List<Integer> smallNumbers = nums.stream().filter(num -> num <= 500).toList();
        List<Integer> bigNumbers = nums.stream().filter(num -> num > 500).toList();

        System.out.println("smallNumbers = " + smallNumbers.size() + " => " + smallNumbers);
        System.out.println("bigNumbers = " + bigNumbers.size() + " => " + bigNumbers);

        System.out.println("---- Iterator remove() ----");
        /*
            difference between for each loop and iterator:
                Iterator can remove() inside loop
                For each cannot -> ConcurrentModification exception
         */
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

    public static List<Integer> randomList(int count) {
        Random rd = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            nums.add(rd.nextInt(1000)); //get random number 0-1000 and add to list
        }
        return nums;
    }

}
