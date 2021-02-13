package domain;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise 
{	
	private static final ThreadLocalRandom rnd = ThreadLocalRandom.current();
	
	public static int[] creature(int size) 
        {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) 
                {
			array[i] = rnd.nextInt(10);
		}
		return array;
	}	
	
	public static int reveal(int[] arr) 
        {
		Map<Integer, Integer> nums = new HashMap<>();
		for (int number : arr) {
			Integer i = nums.get(number);
			nums.put(number, i == null ? 1 : i+1);
		}		
		int max = Collections.max(nums.values());
		for (Map.Entry<Integer, Integer> number : nums.entrySet()) 
                {
			if (number.getValue() == max)
				return number.getKey();
		}
		return -1;
	}
}