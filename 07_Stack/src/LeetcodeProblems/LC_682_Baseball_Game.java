import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int[] top = {0, 0};
                int i = 0;
                for (int v : stack) { top[i++] = v; if (i == 2) break; }
                stack.push(top[0] + top[1]);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int v : stack) sum += v;
        return sum;
    }
}
