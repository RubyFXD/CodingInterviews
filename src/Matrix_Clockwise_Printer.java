import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Matrix_Clockwise_Printer {
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        int row_start=0, row_end=n-1, col_start=0, col_end=m-1;

        int cycle=1;
        int[] result=new int[n*m];
        int count=0;
        while(row_start<=row_end && col_start<=col_end){
            if(cycle%4==1){
                for(int j=col_start;j<=col_end;j++){
                    result[count++]=mat[row_start][j];
                }
                row_start++;
            }
            if(cycle%4==2){
                for(int i=row_start;i<=row_end;i++){
                    result[count++]=mat[i][col_end];
                }
                col_end--;
            }
            if(cycle%4==3){
                for(int j=col_end;j>=col_start;j--){
                    result[count++]=mat[row_end][j];
                }
                row_end--;
            }
            if(cycle%4==0){
                for(int i=row_end;i>=row_start;i--){
                    result[count++]=mat[i][col_start];
                }
                col_start++;
            }
            cycle++;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();

        String[] strings=s1.split(",");
        String[] strings1=s2.split(",");
        int n=Integer.valueOf(strings1[0]);
        int m=Integer.valueOf(strings1[1]);

        int c=0;
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=Integer.valueOf(strings[c++]);
            }
        }

        int[] res=clockwisePrint(mat,n,m);
        System.out.println(Arrays.toString(res));
    }
}