public class Problem3 {

    public static void PrintArray(int[] arr){
        // int n= arr.length;
        for(int num:arr){
            System.err.println(num);
        }
    }
     //reverse the array problem 3
    public static int[] ReverseArray(int[]arr, int size){
        int start=0;
        int end=size-1;
        while (start<end) {
           int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] myarr={1,2,3,4,5,6};
        System.out.println("the orginal array");
        PrintArray(myarr);

        ReverseArray(myarr, myarr.length);
        System.out.println("the reverses array");
        PrintArray(myarr);
    }
    
}