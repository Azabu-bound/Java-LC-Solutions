class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = String.valueOf(x)
                        .chars()
                        .map(ch -> Character.getNumericValue(ch))
                        .sum();

        return x % sum == 0 ? sum : -1;
    }
}