class TrieNode {
    public boolean EOL; 
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
}

class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode tn=root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (tn.children[c-'a']==null)
                tn.children[c-'a']=new TrieNode();
            tn=tn.children[c-'a'];
        }
        tn.EOL=true;
    }
    
    public boolean search(String word) {
        TrieNode tn=root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (tn.children[c-'a']==null) return false;
            tn=tn.children[c-'a'];
        }
        return tn.EOL;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode tn=root;
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            if (tn.children[c-'a']==null) return false;
            tn=tn.children[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */