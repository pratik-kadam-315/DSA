
class maxconsecutive{
    
    public static int consecutive(int arr[]){
        
        int maxcon=0;
        int count=1;
        for(int num :arr){
            if(num==1){
                count++;
                maxcon=Math.max(maxcon,count);
            }else{
                count=0;
            }
        }
        return maxcon;
    }

    public static void main(String[]args){
        int arr[]={1,0,1,1,1,1,0,0,0,1,1,1,1,1,1};
        System.out.println(consecutive(arr));
    }
}