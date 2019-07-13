public class Matrix_Z_Printer {
    public int[] printMatrix(int[][] mat, int n, int m) {
        int[] result=new int[n*m];
        int count=0;
        for(int i=0;i<n;i++){
            //偶数行倒序输出
            //bug:偶数行不是（i%2==0）,应该是（i%2!=0），因为下标是从0开始的
            if(i%2==0){
                for(int j=m-1;j>=0;j--){
                    result[count++]=mat[i][j];
                }
            }
            //奇数行正序输出
            else{
                for(int j=0;j<m;j++){
                    result[count++]=mat[i][j];
                }
            }
        }
        return result;
    }
}