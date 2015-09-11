public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<String>();
    if (n == 0) {
        result.add("");
    } else {
        for (int i = n - 1; i >= 0; i--) {
            List<String> insertSub = generateParenthesis(i);
            List<String> tailSub = generateParenthesis(n - 1 - i);
            for (String insert : insertSub) {
                for (String tail : tailSub) {
                    result.add("(" + insert + ")" + tail);
                }
            }

        }
    }
    return result;
}
