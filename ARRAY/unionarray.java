import java.util.*;
class unionarray{
    public static ArrayList<Integer> unionarray01(int arr1[],int arr2[]){

        int i=0;
        int j=0;
        ArrayList<Integer> ans=new ArrayList<>();

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }else if(arr1[i]>arr2[j]){
                while(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }else{
                if(ans.size()==0||ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }
        while(i<arr1.length){
            if(ans.size()==0||ans.get(ans.size()-1)!=arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(ans.size()==0||ans.get(ans.size()-1)!=arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }
        return ans;
    }
    public static void main(String[]args){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={1,2,5,7,8,9};
        System.out.println(unionarray01(arr1, arr2));
    }
}