class Solution {
    Map<Integer, List<Integer>> nodeMap = new HashMap<>();
    Set<Integer> seen = new HashSet<>();

    public int countComponents(int n, int[][] edges) {

        for(int i = 0; i < n; i++) {
            nodeMap.put(i, new ArrayList<>());
        }

        for(int[] edge : edges)
        {
            nodeMap.get(edge[1]).add(edge[0]);
            nodeMap.get(edge[0]).add(edge[1]);
        }

        int res = 0;
        for(Map.Entry<Integer, List<Integer>> entity : nodeMap.entrySet()) {
            if(!seen.contains(entity.getKey())) {
                res += dfs(entity.getKey(), seen);
            }
        }
        return res;
    }

    int dfs(Integer node, Set<Integer> seen) {
        seen.add(node);
        for (int neighbor : nodeMap.get(node)) {
            if (!seen.contains(neighbor)) {
                dfs(neighbor, seen);
            }
        }
        return 1;
    }
}