class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate("", n);
        return ans;
    }

    public void generate(String s, int n) {
        if (s.length() == 2 * n) {
            if (isValid(s)) {
                ans.add(s);
            }
            return;
        }

        generate(s + "(", n);
        generate(s + ")", n);
    }

    public boolean isValid(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {

            if (ch == '(')
                count++;
            else
                count--;

            if (count < 0)
                return false;
        }

        return count == 0;
    }
}