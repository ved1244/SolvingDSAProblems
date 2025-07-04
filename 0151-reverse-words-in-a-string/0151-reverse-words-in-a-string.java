class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder to build the result
        StringBuilder reversed = new StringBuilder();

        // Traverse words from the end
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
