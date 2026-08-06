public class missingnumber {

    public static int missing(int arr[]){
        int n=arr.length;
        int totalsum=n*(n+1)/2;
        int actualsum=0;
        for(int num:arr){
            actualsum +=num;
        }
        return totalsum-actualsum;
    }
    public static void main(String[]args){
        int arr[]={0,1,2,3,4,5,6,7,9};
        System.out.println(missing(arr));
    }
}
