class Solution {
    public String reverseWords(String s) {
        String[] sa = s.trim().split("\\s+");
        int i = 0, j = sa.length - 1;

        while (i < j) {
            String t = sa[i];
            sa[i] = sa[j];
            sa[j] = t;
            i++;
            j--;
        }

        return String.join(" ", sa);
    }
}