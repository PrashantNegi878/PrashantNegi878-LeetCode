class SmallestInfiniteSet {
    Set<Integer> s;
    int min;
    public SmallestInfiniteSet() {
        s= new HashSet<>();
        min = 1;
    }
    
    public int popSmallest() {
        while(s.contains(min)) min+=1;
        s.add(min);
        return min;
    }
    
    public void addBack(int num) {
        s.remove(num);
        if(num<min) min=num;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */