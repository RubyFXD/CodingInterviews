import java.util.Scanner;

/**
 * 拼多多大整数相乘
 */

public class BigInteger_Multiply {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String num1=scanner.next();
        String num2=scanner.next();

        char[] str1=num1.toCharArray();
        char[] str2=num2.toCharArray();

        int[] bigNum1= new int[str1.length];
        int[] bigNum2= new int[str2.length];

        for(int i=0;i<str1.length;i++){
            bigNum1[i]=str1[str1.length-1-i]-'0';
        }
        for(int j=0;j<str2.length;j++){
            bigNum2[j]=str2[str2.length-1-j]-'0';
        }

        int[] result=new int[bigNum1.length+bigNum2.length];

        for(int i=0;i<bigNum1.length;i++){
            for(int j=0;j<bigNum2.length;j++){
                result[i+j]+=bigNum1[i]*bigNum2[j];
                if(result[i+j]>=10){
                    result[i+j+1] += result[i+j]/10;
                    result[i+j] %=10;
                }
            }
        }

        StringBuffer s=new StringBuffer();
        for(int i=result.length-1;i>=0;i--){
            if((i==result.length-1)&&(result[i]==0)){
                continue;
            }
            s.append(result[i]);
        }
        System.out.println(s.toString());
    }
}
