import java.util.*;
class intersection_Two_SortedArray{

     public static ArrayList<Integer> intersection(int []arr1,int []arr2){

        ArrayList<Integer> ans =new ArrayList<>();

        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;

     }

    public static void main(String[]args){

        int arr[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        System.out.println(intersection(arr, arr2));
    }
}