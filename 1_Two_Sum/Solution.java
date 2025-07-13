import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        // build hashmap, but if answer is there, catch it.
        for (int i = 0; i < n; i++) {
            int c = target - nums[i];
            if (m.containsKey(c)) {
                return new int[] {m.get(c), i};
            } else {
                m.put(nums[i], i);
            }
        }
        return new int[]{}; // always an answer anyways
    }
}

// fast solution, but if you weren't given the constraint that there is only one answer, you would have to handle duplicates in a different way
// since you are given the constraint, you can just return the first answer you find, no need to check for duplicates
// if there wasnt the constraint, there would be more than one answer, and you would have to handle the duplicates in a different way, like using a list to store all the answers and then return them

// one thing about the second approach is that at least it returns in index order, so you can just return the first answer you find, no need to check for duplicates and you assume that leetcode crafted that answer