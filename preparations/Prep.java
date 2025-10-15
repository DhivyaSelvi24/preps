package preparations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Prep {

	public static void main(String[] args) {
		  int[] arr = {5, 3, 9, 1, 3, 5, 6};
	        HashSet<Integer> set = new HashSet<>();

	        System.out.println("Duplicates are:");
	        for (int num : arr) {
	            if (!set.add(num)) {  // add() returns false if num already exists
	                System.out.println(num);
	            }
	        }
	        
	        int[] arr1 = {5, 3, 9, 1, 3, 5, 6};
	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int num : arr1) {
	            map.put(num, map.getOrDefault(num, 0) + 1); // increment if exists, else 1
	        }

	        System.out.println("Frequency of elements:");
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
	        }

	}

}
