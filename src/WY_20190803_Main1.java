import java.util.Scanner;

public class WY_20190803_Main1 {
    public static void main(String[] args) {
        int testcases=0;
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNextInt()){
            testcases=scanner.nextInt();
        }
        int[][] array=new int[testcases][];
        int tempCol=0;
        for(int i=0;i<testcases;i++){
            tempCol=scanner.nextInt();
            array[i]=new int[tempCol];
            for(int j=0;j<tempCol;j++){
                array[i][j]=scanner.nextInt();
            }
        }

        for(int i=0;i<testcases;i++){
            System.out.println(isRing(array,i));
        }

    }
    public static String isRing(int[][] array, int row){
        if(array[row].length<=2){
            return "NO";
        }
        for(int i=1;i<array[row].length-1;i++){
            if(array[row][i]>array[row][i-1]+array[row][i+1]){
                return "NO";
            }
            if(array[row][0]>array[row][1]+array[row][array[row].length-1]){
                return "NO";
            }
            if(array[row][array[row].length-1]>array[row][0]+array[row][array[row].length-2]){
                return "NO";
            }
        }
        return "YES";
    }
}
