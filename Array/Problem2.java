public class Problem2 {
    public static void PrintArray(int[] arr){  //print array
        int n= arr.length;
        for (int index = 0; index < n; index++) {
            System.out.println(arr[index]);
            
        }
    }
        //removing even interger from array
    public static int[] removeEvenInteger(int[] arr, int size){
        int oddCount=0;
        for(int i=0; i<size; i++){
            if (arr[i] % 2 !=0) {
                oddCount++; 
            }
        }
        int[] result= new int[oddCount];
        int index=0;
        for(int j=0; j<size; j++){
            if (arr[j] %2 !=0) {
                result[index]=arr[j];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        System.out.println("original array");
        PrintArray(arr);
        int[] res=removeEvenInteger(arr, arr.length);
        System.out.println("after remove even number");
        PrintArray(res);
    }
}
