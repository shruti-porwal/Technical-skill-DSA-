/* give an integer a of size n in one sec you can increase the value of on  . find the minimum time in 
seconds to make all the elemnts of the array equal. */
public class Mintime {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3};
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int time = 0;
        for (int i = 0; i < arr.length;i++){
            time += (max - arr[i]);
        }
        System.out.println(time);
    }
}
 