import java.util.Arrays;

public class xuanze {
    public static void main(String[] args) {
        int[] arr = {3,5,1,9,4,2,0};
        xuanze1(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void xuanze1(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int temp=i;
            int j;
            for (j=i+1;j<arr.length;j++){
                if(arr[j]<arr[temp]){
                    temp=j;
//                    System.out.println(temp);
                }
            }
            if(i!=temp){
                int t;
                t=arr[temp];
                arr[temp]=arr[i];
                arr[i]=t;
            }
//            System.out.println(Arrays.toString(arr));
        }
    }
}
