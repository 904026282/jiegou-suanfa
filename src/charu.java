import java.util.Arrays;

public class charu {
    public static void main(String[] args) {
        int[] arr = {3,5,1,9,4,2,0};
        charu(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void charu(int[] arr){
        for(int i=1;i<arr.length;i++){
           if(arr[i]<arr[i-1]){
               int temp=arr[i];
               int j;
               for(j=i-1;j>=0&&arr[j]>temp;j--){
                   arr[j+1]=arr[j];
               }
               arr[j+1]=temp;
           }

        }
    }
}
