import java.util.Scanner;

public class WY_20190803_Main3 {
    public static void main(String[] args) {
        int number=0,inquery=0;
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNextInt()){
            number=scanner.nextInt();
            inquery=scanner.nextInt();
        }
        int[] numbers=new int[number];
        for(int i=0;i<number;i++){
            numbers[i]=scanner.nextInt();
        }
        int[] queries=new int[inquery];
        for(int j=0;j<inquery;j++){
            queries[j]=scanner.nextInt();
        }

        for(int i=0;i<inquery;i++){
            int count=0;
            for(int j=0;j<number;j++){
                if(numbers[j]>=queries[i]){
                    numbers[j]=numbers[j]-1;
                    count=count+1;
                }
            }
            System.out.println(count);
        }
    }
}
