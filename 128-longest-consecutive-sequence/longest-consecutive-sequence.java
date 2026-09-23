class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        int longest = 1;

        HashSet<Integer> set = new HashSet<>();

        // Store all elements in HashSet
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // Check every element
        for (int it : set) {

            // If previous element doesn't exist,
            // this is the starting point of a sequence
            if (!set.contains(it - 1)) {

                int cnt = 1;
                int x = it;

                // Find consecutive elements
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;

    }
}