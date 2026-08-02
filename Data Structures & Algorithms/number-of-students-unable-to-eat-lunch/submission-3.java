class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new ArrayDeque<>();

        for(int i = sandwiches.length - 1; i >= 0; i--) {
            stack.add(sandwiches[i]);
        }

        for(int i = 0; i < students.length; i++) {
            q.offer(students[i]);
        }

        int rotations = 0;
        while(!stack.isEmpty() && rotations < q.size()) {
            if(stack.peek() == q.peek()) {
                stack.pop();
                q.poll();
                rotations = 0;
            } else {
                int temp = q.poll();
                q.add(temp);
                rotations++;
            }
        }

        return q.size();
    }
}