/* Q2: First Occurrence using Binary Search
Description: Given a sorted array that may contain duplicate elements, write an efficient algorithm
to find the index of the first occurrence of a given target value. Your solution must use Binary
Search and should run in O(log n) time complexity.
Input: arr = [1, 2, 2, 2, 3], target = 2
Output: 1
Explanation: Even after finding the target, we continue searching on the left half to ensure we get
the first occurrence index. */

class P2FirstOcc{
    public static void main(String[] args) {
        int[] a = {1,2,2,2,3};
        int target = 2;
        int l = 0;
        int r = a.length - 1;
        int index = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid]==target){
                index = mid;
                r = mid - 1; 
            }
            else if(a[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        System.out.println("First occurrence of " + target + " is at index: " + index);
    }
}