// otimized or better approach to find only core elements without if condition 
// only use nested loops like i = 1 to i =n-1  and j = 1 to j = n-1
public class CoreElements2 {
    public static void main(String[] args) {
         int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int n = arr.length;
        for(int i = 1;i<n-1;i++){
            for(int j = 1;j<n-1;j++){
                    System.out.println(arr[i][j]);
            }
        }
    }
}

