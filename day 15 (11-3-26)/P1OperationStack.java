//#682 - Baseball Game
import java.util.*;

public class P1OperationStack {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String a : operations) {
            if(a.equals("C")) st.pop();
            else if(a.equals("D")) st.push(st.peek() * 2);
            else if(a.equals("+")){
                int last = st.pop();
                int updatedScore = last + st.peek();
                st.push(last);
                st.push(updatedScore);
            }
            else{
                st.push(Integer.parseInt(a));
            }
        }

        int sum = 0;
        for(int num : st){
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        P1OperationStack obj = new P1OperationStack();
        String[] operations = {"5","2","C","D","+"};
        System.out.println(obj.calPoints(operations));
    }
}
