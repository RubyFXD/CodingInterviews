import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GED {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String String1=br.readLine();
        String String2=br.readLine();


        int len1=String1.length();
        int len2=String2.length();

        if (len1==0){
            System.out.println(len2);
        }

        if(len2==0){
            System.out.println(len1);
        }

        int[][] ged=new int[len1+1][len2+1];

        for(int i=0; i<=len1;i++){
            ged[i][0]=i;
        }
        for(int j=0;j<+len2;j++){
            ged[0][j]=j;
        }

        for(int i=1; i<=len1; i++){
            char si=String1.charAt(i-1);
            for(int j=1;j<=len2;j++){
                char sj=String2.charAt(j-1);
                if(si==sj){
                    ged[i][j]=ged[i-1][j-1];
                }else{
                    ged[i][j]=minal(ged[i-1][j],ged[i][j-1],ged[i-1][j-1])+1;
                }
            }
        }
        System.out.println(ged[len1][len2]);
    }

    public static int minal(int a, int b, int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}
