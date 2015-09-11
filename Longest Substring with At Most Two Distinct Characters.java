public int lengthOfLongestSubstringTwoDistinct(String s) {

    if (s == null || s.length() == 0) {
        return 0;
    }
    int n = s.length();
    if (n == 1)
        return 1;

    int maxLen = 0, i = 0;
    while (i < n) {
        char firstChar = s.charAt(i);
        int j = i + 1;
        int len = 0;
        while (j < n && s.charAt(j) == firstChar) {
            j++;
        }
        if (j < n) {
            char secondChar = s.charAt(j);
            while (j < n && (s.charAt(j) == firstChar || s.charAt(j) == secondChar)) {
                j++;
            }
        }
        len = j - i;
        maxLen = Math.max(maxLen, len);

        while (i < n && s.charAt(i) == firstChar) i++; // Move to the next char.

    }
    return maxLen;
}
