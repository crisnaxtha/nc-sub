/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        return dfs(node);
    }

    public Node dfs(Node node) {
        if(node == null) {
            return node;
        }

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        ArrayList<Node> newNei = new ArrayList<>();
        Node node1 = new Node(node.val, newNei);
        visited.put(node, node1);

        if(!node.neighbors.isEmpty()) {
            List<Node> nei = node.neighbors;
            for(Node n : nei) {
                newNei.add(dfs(n));
            }
        }

        return node1;
    }
}