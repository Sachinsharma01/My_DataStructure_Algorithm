package Leetcode;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        int lb = 1, ub = n;
//        int p = 1;
//        while (lb <= ub) {
//            int mid = lb + (ub - lb) / 2;
//            boolean r = isBadVersion(mid);
//            if (r == true) {
//                p = mid;
//                ub = mid - 1;
//            } else {
//                lb = mid + 1;
//            }
//        }
//        return p;
//    }
//}