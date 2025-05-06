class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int num : arr) {
            hash.merge(num, 1, Integer::sum); 
        }

        return hash.entrySet()
                   .stream()
                   .filter(entry -> entry.getKey() == entry.getValue())
                   .mapToInt(Map.Entry::getKey)
                   .max()
                   .orElse(-1);
    }
}