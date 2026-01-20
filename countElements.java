// given an array,find the count the no if elements is greater than istelf.
public class countElements {
    public static void main(String[] args) {
        int[] arr = {-3,-2,0,1,3,4,5};
        int count = 0;
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        for(int j = 0;j<arr.length;j++){
            if(arr[j] != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
