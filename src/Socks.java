import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Socks {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String arr=br.readLine();
        String D=br.readLine();

        int d=Integer.valueOf(D);
        arr=arr.substring(1,arr.length()-1);
        String[] stringArr= arr.split(",\\s+");
        int [] S=new int[stringArr.length];
        for(int i=0;i<S.length;i++){
            S[i]=Integer.valueOf(stringArr[i]);
        }

        Double results[]=fitNumber(S, d);

        double result=(results[0]/results[1]);

        DecimalFormat df= new DecimalFormat("0.000000");

        System.out.println(df.format(result));


    }

    public static Double[] fitNumber(int[] S,int d){
        Double [] result=new Double[2];
        int count=0;
        int totalCombine=0;
        for(int i=0;i<S.length;i++){
            for(int j=i+1;j<S.length;j++){
                totalCombine++;
                if(Math.abs(S[i]-S[j])<=d){
                    count++;
                }
            }
        }
        result[0]=new Double(count);
        result[1]=new Double(totalCombine);
        return result;
    }

}
