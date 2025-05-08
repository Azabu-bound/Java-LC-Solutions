class Solution {
    public char findTheDifference(String s, String t) {
        return (char) IntStream.concat(s.chars(), t.chars())
                            .reduce(0, (acc, ch) -> acc ^ ch);
    }
}