public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String output = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(output) != 0) {
                output = output.substring(0, output.length() - 1);
            }
        }
        return output;
    }
}
