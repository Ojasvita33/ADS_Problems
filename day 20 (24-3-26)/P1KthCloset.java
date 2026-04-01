//#973 - K Closest Points to Origin
import java.util.*;
class P1KthCloset {
    public static int[][] kClosest(int[][] points, int k) {
        //first we have to calculate distance of each point 
        //The calculated distance....priority queue
        //Top k elements 
        PriorityQueue<int[]> pri=new PriorityQueue<>((a,b)->((a[0]*a[0])+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));
        for(int[] p:points) {
        pri.add(p);
        }
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++){
            res[i]=pri.poll();
        }   
        return res;
    }
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        int[][] res = kClosest(points, k);
        for(int[] point : res) {
            System.out.println(Arrays.toString(point));
        }
    }
}