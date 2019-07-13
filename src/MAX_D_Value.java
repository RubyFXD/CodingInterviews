import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MAX_D_Value {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char[] chars=s.toCharArray();
        String filterdS="";

        for(int i=0;i<chars.length;i++){
            if(chars[i]!='[' && chars[i]!=']'){
                filterdS+=chars[i];
            }
        }

        String[] strings=filterdS.split(",");
        int n=Integer.valueOf(strings[strings.length-1]);

        if(n<2||n>500){
            return;
        }

        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=Integer.valueOf(strings[i]);
        }

        quickSort(A,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }

        int maxD=0;
        if(n==2){
            maxD=Math.abs(A[0]-A[1]);
        }else{
            for(int i=0;i<=n-2;i++){
                if(Math.abs(A[i]-A[i+1])>maxD){
                    maxD=Math.abs(A[i]-A[i+1]);
                }
            }
        }
        System.out.println(maxD);

    }
    public static void quickSort(int[] array, int left, int right){
        if(left>=right){
            return;
        }

        int middle=partition(array,left,right);
        quickSort(array,left,middle-1);
        quickSort(array,middle+1,right);
    }

    public static int partition(int[] array, int left, int right){
        int base=array[left];
        while(left<right){
            while(left<right&&array[right]>=base){
                right--;
            }
            if(left<right){
                int temp=array[right];
                array[right]=base;
                array[left]=temp;
                left++;
            }
            while(left<right&&array[left]<=base){
                left++;
            }
            if(left<right){
                int temp=array[left];
                array[left]=base;
                array[right]=temp;
                right--;
            }
        }
        return left;
    }
}
