public class Problem4 {
    public static void PrintArray(int[] arr){
        for (int num : arr) {
            System.out.println(num);
        }
    }

    //problem4 find minimum value in array

    public static int MinValue(int[] arr){
        int min=arr[0];
        for(int items:arr){
            if(items<min){
                min=items;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] myarr={12,14,12,14,12,14,101,15,10,14,12};

        // PrintArray(myarr);

        System.out.println(MinValue(myarr));
    }
}
