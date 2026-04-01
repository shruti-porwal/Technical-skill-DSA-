import java.util.Stack;

public class BalanceString{
    public static void main(String[] args) {
        String s = "()()";
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    System.out.println(0);
                    return;
                }
                st.pop();
            }
        
        System.out.println(st.isEmpty() ? 1 : 0);
    }
}
}
/*given A string consisting of only ( , )  you need to find  whether it is balanced or not . if it is balanced then return 1 and else return 0.
ex - A = "()()" 

Algorithm -- 
-if we have ) push into the stack.
-when ) appear pop from the stack.
-if stack becomes empty when trying to pop is not balanced
-After traversing the whole string , stack becomes empty -- thats means it is balanced */ 