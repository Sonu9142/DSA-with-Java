public class Problem8 {
    public static void PrintArray(int[] arr){
        // int n= arr.length;
        for(int num:arr){
            System.err.println(num);
        }
    }

    //find a missing number in array 
    // given an array of n-1 dinstict numbers in the range of 1  to n. find the missing number in it
    // 1,2,3,4,5,7,8
    // we will find the sum of 1st n natural number using mathematic formula and substract all the value from it

    public static int MissValue(int[] arr){
        int n = arr.length+1;
        int sum= n*(n+1)/2;
        for(int i=0; i<arr.length; i++){
            sum=sum-arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myarr={1,2,3,4,5,7,8};
        System.out.println(MissValue(myarr));
    }
}
