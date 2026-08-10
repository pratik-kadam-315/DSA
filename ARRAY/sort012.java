import java.util.Arrays;
class sort012 {

    public static void sort(int arr[]){
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid <=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                mid++;
                high--;
            }
        }
    }
    public static void main(String[]args){
        int[] arr = {2, 0, 2, 1, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
