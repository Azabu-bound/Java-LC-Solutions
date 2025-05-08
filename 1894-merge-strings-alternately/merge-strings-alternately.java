class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = Math.min(word1.length(), word2.length());

        for (int i = 0; i < n; ++i) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (word1.length() > word2.length()) {
            String temp = word1.substring(n, word1.length());
            sb.append(temp);
        } else {
            String temp = word2.substring(n, word2.length());
            sb.append(temp);
        }

        return sb.toString();
    }
}