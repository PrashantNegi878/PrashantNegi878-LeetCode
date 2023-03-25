/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,r=n,m,fb=0;
        while(l<=r)
        {
            m = (r - l) / 2 + l;
            if(isBadVersion(m)){
                r = m - 1;
                continue;
            }
            l = m + 1;
        }
        return l;
    }
}