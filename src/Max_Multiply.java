import java.util.Scanner;

/**
 * 拼多多最大乘积
 *
 */
public class Max_Multiply {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        if(scanner.hasNextInt()){
            n=scanner.nextInt();
        }
        Long[] array=new Long[n];

        for(int i=0;i<n;i++){
            array[i]=scanner.nextLong();
        }
        long max=0, second_max=0, third_max=0;
        long min=0, second_min=0;
        for(int j=0;j<n;j++){
            if(array[j]>max){
                third_max=second_max;
                second_max=max;
                max=array[j];
            }
            else if(array[j]>second_max){
                third_max=second_max;
                second_max=array[j];
            }
            else if(array[j]>third_max){
                third_max=array[j];
            }
            else if(array[j]<min){
                second_min=min;
                min=array[j];
            }
            else if(array[j]<second_min){
                second_min=array[j];
            }
        }

        if(min*second_min>second_max*third_max){
            System.out.println(min*second_min*max);
        }else{
            System.out.println(max*second_max*third_max);
        }
    }
}

//        sample solution
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        InputStreamReader ir = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(ir);
//        int n = Integer.parseInt(bf.readLine());
//        String[] str = bf.readLine().split(" ");
//        int[] nums=new int[str.length];
//        for (int i=0;i<str.length;++i){
//            nums[i]=Integer.parseInt(str[i]);
//        }
//        System.out.println(maximumProduct(nums));
//    }
//    public static long maximumProduct(int[] nums) {
//        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
//        for (int n : nums) {
//            if (n > max1) {
//                max3 = max2;
//                max2 = max1;
//                max1 = n;
//            } else if (n > max2) {
//                max3 = max2;
//                max2 = n;
//            } else if (n > max3) {
//                max3 = n;
//            }
//
//            if (n < min1) {
//                min2 = min1;
//                min1 = n;
//            } else if (n < min2) {
//                min2 = n;
//            }
//        }
//        return Math.max((long)max1*max2*max3, (long)max1*min1*min2);
//    }
//}
