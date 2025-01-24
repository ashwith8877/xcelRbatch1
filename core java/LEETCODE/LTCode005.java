import java.util.HashMap;

class LTCode005{
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Calculate the complement
            
            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // If complement is not found, store the number with its index in the map
            map.put(nums[i], i);
        }
        
        // Since there is exactly one solution, we don't need to handle "no solution" case
        return new int[] {}; // Default return, though unnecessary because we assume a solution exists
    }
}
