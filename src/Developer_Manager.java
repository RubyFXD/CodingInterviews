import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Developer_Manager {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String [][]strings=new String[10][];
        int row_count=0;

        String line=br.readLine();
        while(!line.equals("")){
            strings[row_count++]=line.split("\\s+");
            line=br.readLine();
        }

        for(int i=0;i<row_count;i++){
            for(int j=0;j<strings[i].length;j++){
                System.out.print(strings[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
