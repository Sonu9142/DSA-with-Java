public class Problem1{
    public static void PrintArray(int[] arr){ // take parameter as an array and print it using for loop
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] myarr=new int[5]; //array declaration by defaut array of intger by default its assign 0 for all indexes
        int[] arr={1,2,3,4,5,6,8}; //array declaration with inialization
        PrintArray(arr); // this function is used to print the array element here
        PrintArray(myarr);
        
    }
}