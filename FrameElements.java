public class FrameElements {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int sum = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || i == n-1 || j == 0 || j == n -1){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}