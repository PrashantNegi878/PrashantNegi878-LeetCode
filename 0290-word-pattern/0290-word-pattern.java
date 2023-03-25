class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr;
        arr=s.split(" ");
        HashSet<String>hs = new HashSet<>();
        String[] count=new String[265];
        if(pattern.length()!=arr.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            if(count[pattern.charAt(i)]== null)
            {
                count[pattern.charAt(i)]=arr[i];
                int temp = hs.size();
                hs.add(arr[i]);
                if(hs.size()==temp)
                  return false;
                continue;
            }
            if(!count[pattern.charAt(i)].equals(arr[i]))
            {
                return false;
            }
        }
        return true;
    }
}