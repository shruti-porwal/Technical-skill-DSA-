public class targetMatrix_sum {
    public static void main(String[] args) {
        int[] arr = { 1, 4 , 5 ,7 ,8,4};
        int k = 12;
        for(int i = 0;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                if(i != j && arr[i] + arr[j] == k){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}
