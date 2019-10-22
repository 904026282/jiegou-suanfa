import java.util.Arrays;

public class kuaipai {
    public static void main(String[] args) {
        int[] arr = {3,5,1,9,4,2,0};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low1, int high1) {
        if(low1<high1){
        int start=arr[low1];
        int low=low1;
        int high=high1;
            while (low<high){
                while(low<high&&arr[high]>=start){
                    high--;
                }
                arr[low]=arr[high];
                while(low<high&&arr[low]<=start){
                    low++;
                }
                arr[high]=arr[low];
            }
            arr[low]=start;
            quickSort(arr,low1,low);
            quickSort(arr,low+1,high1);
        }
    }

}
