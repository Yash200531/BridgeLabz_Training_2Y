class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (sb.length() > 0) sb.append(' ');
            if (word.length() <= 2) sb.append(word.toLowerCase());
            else sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
        }
        return sb.toString();
    }
}
