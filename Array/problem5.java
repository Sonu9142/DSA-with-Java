public class problem5 {
    public static void PrintArray(int[] arr){
        // int n= arr.length;
        for(int num:arr){
            System.err.println(num);
        }
    }

    // find 2nd maximum value in array

    public static int SecMax(int[] arr){
        int max= Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                secmax=max;
                max=arr[i];
            }else if(arr[i]>secmax && arr[i] != max){
                secmax=arr[i];
            }
        }
        return secmax;
    }

    public static void main(String[] args) {
        int[] myarr= {33,34,35,35};
        PrintArray(myarr);

        System.out.println(SecMax(myarr));
    }
}
