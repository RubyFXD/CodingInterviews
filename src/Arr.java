import java.util.Scanner;

public class Arr {

    public static void main(String[] args) {
        int N=0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            N=scanner.nextInt();
        }
        int arr[] =new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }

        sort(arr);
//        for(int i=0;i<N;i++){
//            System.out.println(arr[i]);
//        }

        int M=N/2;
        int[] addresult=new int[M];
        int start=0;
        int end=arr.length-1;
        int count=0;
        while(start<end){
            addresult[count]=arr[start]+arr[end];
            count++;
            start++;
            end--;
        }

        sort(addresult);
//        for(int i=0;i<M;i++){
//            System.out.println(addresult[i]);
//        }
        System.out.println(addresult[M-1]-addresult[0]);

    }

    public static void sort (int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
