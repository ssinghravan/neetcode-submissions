class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int originalK = k;
        int[] res = new int[k];

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));

        for (int key : count.keySet()) {
            minHeap.add(key);

            if (minHeap.size() > originalK) {
                minHeap.poll();
            }
        }

        while (originalK-- > 0) {
            res[originalK] = minHeap.poll();
        }

        return res;
    }
}