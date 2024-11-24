public class Problem9 {
    public static void PrintArray(int[] arr){
        // int n= arr.length;
        for(int num:arr){
            System.err.println(num);
        }
    }
    //check a string is pelindrome or not
    public static boolean isPelindrome(String word){
        char[] charArray= word.toCharArray();
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
            
        }
        return true;
    }

    public static void main(String[] args) {
        String sc="rotato";
        System.out.println(isPelindrome(sc));
        
    }
}
