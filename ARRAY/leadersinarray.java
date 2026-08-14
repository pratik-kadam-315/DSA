import java.util.*;
class leadersinarray{

    public static ArrayList<Integer> leader(int arr[]){
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int maxright=arr[n-1];
        ans.add(maxright);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxright){
                ans.add(arr[i]);
                maxright=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[]args){
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leader(arr));
    }
}