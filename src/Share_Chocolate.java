import java.util.Scanner;

/**
 * 拼多多分巧克力
 */

public class Share_Chocolate {
    public static void main(String[] args) {
        int N=0;
        int M=0;
        int count=0;
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        int[] h=new int[N];
        for(int i=0;i<N;i++){
            h[i]=scanner.nextInt();
        }
        M=scanner.nextInt();
        int[] w=new int[M];
        for(int i=0;i<M;i++){
            w[i]=scanner.nextInt();
        }


        quickSort(h,0,h.length-1);
        quickSort(w,0,w.length-1);

        int j_start=0;
        for(int i=0;i<w.length;i++){
            for(int j=j_start;j<h.length;j++){
                if(w[i]>=h[j]){
                    count++;
                    j_start=j+1;
                    break;
                }
            }
        }

        System.out.println(count);
    }

    public static void quickSort(int[] array, int left, int right){
        int middle=0;
        if(left<right){
            middle=partition(array,left,right);
            quickSort(array,left,middle-1);
            quickSort(array,middle+1,right);
        }
    }

    public static int partition(int[] array, int left, int right){
       int base=array[left];
       while(left<right){
           while(left<right&&array[right]<=base){
               right--;
           }
           if(left<right){
               int temp=array[left];
               array[left]=array[right];
               array[right]=temp;
               left++;
           }
           while(left<right&&array[left]>=base){
               left++;
           }
           if(left<right){
               int temp=array[left];
               array[left]=array[right];
               array[right]=temp;
               right--;
           }
       }
       return left;
    }
}
