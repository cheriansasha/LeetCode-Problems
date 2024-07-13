class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int num : nums) {
            heap.add(num);
        }
        int val = -1;
        for (int i = 0; i < k; ++i) {
            val = heap.poll();
        }
        return val;
    }
}