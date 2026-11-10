class Solution {
    Map<Integer, List<Integer>> nodeMap = new HashMap<>();
    Set<Integer> visiting = new HashSet<>();

    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false;

        for(int i = 0; i < n; i++) {
            nodeMap.put(i,  new ArrayList<>());
        }

        for(int[] edge : edges) {
            nodeMap.get(edge[0]).add(edge[1]);
            nodeMap.get(edge[1]).add(edge[0]);
        }
        
        if(!dfs(0, -1)) return false;
        
        return visiting.size() == n;
    }

    boolean dfs(int node, int prev) {
        if(visiting.contains(node)) return false;

        visiting.add(node);
        for(int nd : nodeMap.get(node)) {
            if (nd == prev) continue;
            if(!dfs(nd, node)) return false;
        }
        
        return true;
    }
}