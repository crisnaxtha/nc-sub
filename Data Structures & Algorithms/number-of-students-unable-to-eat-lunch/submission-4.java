class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < students.length; i++) {
            queue.offer(students[i]);
        }

        for(int i = sandwiches.length - 1; i >= 0; i--) {
            stack.push(sandwiches[i]);
        }

        int rotate = 0;

        while(!stack.isEmpty() && rotate <= queue.size()) {
            if(stack.peek() == queue.peek()) {
                stack.pop();
                queue.poll();
                rotate = 0;
            } else if(stack.peek() != queue.peek()) {
                int temp = queue.poll();
                queue.offer(temp);
                rotate++;
            }
        }

        return queue.size();
    }
}