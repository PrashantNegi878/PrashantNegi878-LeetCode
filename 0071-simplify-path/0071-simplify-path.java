class Solution {
    public String simplifyPath(String path) {
    Deque<String> stack = new ArrayDeque<>();
    Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
    for (String dir : path.split("/")) {
        if (dir.equals("..") )
         stack.poll();
        else if (!skip.contains(dir))
         stack.push(dir);
    }
    StringBuilder res = new StringBuilder();
    while(stack.peek()!=null)
    {
        res.append("/"+stack.pollLast());
    }
    return res.isEmpty() ? "/" : res.toString();
    }
}