class MyHashSet {
    boolean[] myHashSet;

    public MyHashSet() {
        myHashSet=new boolean[1000001];
    }
    
    public void add(int key) {
        myHashSet[key]=true;
    }
    
    public void remove(int key) {
        myHashSet[key]=false;
    }
    
    public boolean contains(int key) {
        return myHashSet[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */