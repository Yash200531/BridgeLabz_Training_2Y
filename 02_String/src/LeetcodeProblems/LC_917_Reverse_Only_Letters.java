class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(arr[left])) left++;
            while (left < right && !Character.isLetter(arr[right])) right--;
            char tmp = arr[left]; arr[left++] = arr[right]; arr[right--] = tmp;
        }
        return new String(arr);
    }
}
