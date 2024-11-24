public class Problem6 {

    public static void PrintArray(int[] arr){
        // int n= arr.length;
        for(int num:arr){
            System.err.println(num);
        }
    }

    //moves zero of an array in end
    public static void MoveZero(int[] arr, int size){
        int j=0;
        for(int i=0; i<size; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int[] myarr={1,0,2,0,3,0,4,0};

        MoveZero(myarr, myarr.length);

        PrintArray(myarr);
    }
}