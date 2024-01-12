class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i=0,j=s.length()-1;
        int result=0;
        while(i<j)
        {
            if(vowels.contains(s.charAt(i++))) result+=1;
            if(vowels.contains(s.charAt(j--))) result-=1;
        }
        return (result==0)?true:false;
    }
}