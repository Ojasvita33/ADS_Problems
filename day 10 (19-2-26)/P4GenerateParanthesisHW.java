//#22 - Generate Parenthesis
import java.util.ArrayList;
import java.util.List;
public class P4GenerateParanthesisHW {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0,0,n);
        return res;
    }

    public static void backtrack(List<String> res, String curr, int open, int close, int N){
        if(curr.length() == 2*N){
            res.add(curr);
            return;
        }
        if(open < N){
            backtrack(res, curr + "(", open + 1, close, N);
        }
        if(close < open){
            backtrack(res, curr + ")", open, close + 1, N);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
