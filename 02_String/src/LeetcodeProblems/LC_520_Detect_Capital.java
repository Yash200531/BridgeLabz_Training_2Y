class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;
        boolean allCap = Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1));
        boolean allLow = Character.isLowerCase(word.charAt(1));
        for (int i = 2; i < word.length(); i++) {
            if (allCap && !Character.isUpperCase(word.charAt(i))) return false;
            if (allLow && !Character.isLowerCase(word.charAt(i))) return false;
        }
        return allCap || allLow;
    }
}
