public class Problem7 {
    public static void PrintArray(int[] arr){
        // int n= arr.length;
        for(int num:arr){
            System.err.println(num);
        }
    }

    //resize an array
    public static int[] Resize(int[] arr, int capacity){
        int temp[]= new int[capacity];

        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int myarr[]={1,2,3,4,5};
        System.out.println(myarr.length);

        myarr=Resize(myarr, myarr.length*2);

        System.out.println(myarr.length);
    }
}
