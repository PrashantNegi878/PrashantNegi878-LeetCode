/*
// Definition for a Node.
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
     public static Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Integer, Node> nodeMap = new HashMap<>();
        fillUniqueNodeMap(node, nodeMap);
        addNeighbours(node, nodeMap, new HashSet<>());
        return nodeMap.get(node.val);
    }


    public static void fillUniqueNodeMap(Node node, Map<Integer, Node> nodeMap) {
        if (node == null || nodeMap.containsKey(node.val)) return;
        nodeMap.put(node.val, new Node(node.val));
        for (Node n : node.neighbors) {
            fillUniqueNodeMap(n, nodeMap);
        }
    }


    public static void addNeighbours(Node node, Map<Integer, Node> nodeMap, Set<Integer> visited) {
        if (node == null || visited.contains(node.val)) return;
        visited.add(node.val);
        Node cloneNode = nodeMap.get(node.val);
        for (Node n : node.neighbors) {
            cloneNode.neighbors.add(nodeMap.get(n.val));
            addNeighbours(n, nodeMap, visited);
        }
    }
}