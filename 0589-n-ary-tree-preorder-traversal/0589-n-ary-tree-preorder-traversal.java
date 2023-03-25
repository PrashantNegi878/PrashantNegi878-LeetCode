/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        Stack<Node> s = new Stack<>();
        s.add(root);
        List<Integer> l= new ArrayList<>();
        if (root==null)
            return l;
        while(!s.isEmpty())
        {
            Node temp= s.pop();
            l.add(temp.val);
            if(temp.children!=null) 
            // temp.children).forEach(child->q.add(child));
            for(int i=temp.children.size()-1;i>=0;i--)
                s.add(temp.children.get(i));
        }
        return l;
    }
}