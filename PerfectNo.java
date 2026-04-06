/*GIVEN an integer A, you have to  find the Ath perfect no .
A perfect no has the following  prpoperties --
1. it consists 1 amd 2
2. the no of digits in perfect no is an even 
3. it is palindrome number.
for ex - 11,22,1111,112211 */

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        int A = 4;
        for(int i = 0;i<A;i++){
            String front = q.poll();

            String rev = new StringBuilder(front).reverse().toString();
            String perfect = front + rev;

            System.out.println(perfect);

            q.add(front + "1");
            q.add(front + "2");
        }
    }
}

