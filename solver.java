import java.util.ArrayList;
import java.util.Arrays;

public class solver {

    public static String reverseArray(String str){
        //2 pointer approach
        StringBuilder sb = new StringBuilder(str); 
        int i =0, j = str.length()-1;

        while (i<j) {
            
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        return sb.toString();
    }

    public static int findLargestNumber(int arr[]) {

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean isPalindrom(String str){

        int i = 0, j = str.length()-1;

        while (i<j) {
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static int sumOfArray(int arr[]){
        //if enpty
        if(arr.length == 0){
            return 0;
        }
        int sum = 0;

        for (int i =0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static int findFactorial(int num){
        //base case
        if(num == 0 || num==1){
            return 1;
        }

        return num * findFactorial( num-1);
    }

    public static int[] findEvenNumbers(int arr[]){

        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i =0 ; i< arr.length; i ++){
            if(arr[i] % 2 == 0){
                evenList.add(arr[i]);
            }
        }

        //convert list to array
        int result[] = new int[evenList.size()];

        for(int i =0; i < evenList.size(); i ++){
            result[i] = evenList.get(i);
        }

        return result;
    }

    public static int[] fibonacciSequence(int num){

        int [] result = new int[num];

        if (num >= 1){
            result[0] = 0;
        }
        if (num >= 2){
            result[1] = 1;
        }

        for(int i =2; i < num; i++){
            result[i] = result[i-1] + result[i -2];
        }

        return result;

    }

    public static void multiplicationTable(int num) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
    }
}
    
    public static int findMinNumber(int arr[]) {

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static boolean checkPrime(int num){

        if(num<=1 ){
            return false;
        }
        if(num == 2 ){
            return true;
        }

        if (num % 2 ==0){
            return false;
        }

        for (int i = 3; i * i <= num; i +=2) {
            if(num % i ==0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        
        System.err.println(reverseArray("hello word"));

        int[] nums = {-5, -2, -8, -1};
        System.out.println(findLargestNumber(nums));

        System.out.println(isPalindrom("Racecar"));

         int[] sumArr = {5, 2, 8, 1};
         System.out.println(sumOfArray(sumArr));

        System.out.println(findFactorial(5));

        int[] numsEven = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(findEvenNumbers(numsEven)));

        System.out.println(Arrays.toString(fibonacciSequence(6)));

        multiplicationTable(5);

        int[] numsMin = {5, 2, 8, 1};
        System.out.println(findMinNumber(numsMin));

        System.out.println(checkPrime(4));

    }
}