//1046 - Last Stone Weight
import java.util.*;
class P2StoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int s:stones) pq.add(s);
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b){
                pq.add(a-b);
            }
        }
        return pq.isEmpty()?0:pq.peek();
    }
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}