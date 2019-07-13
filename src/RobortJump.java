import java.util.Scanner;

public class RobortJump {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N=0;
        if(scanner.hasNextInt()){
            N=scanner.nextInt();
        }

        int[] H=new int[N];
        for(int i=0;i<N;i++){
            H[i]=scanner.nextInt();
        }

        int E=0;
        boolean isMin=false;
        while(isMin==false){
            int minE=E;

            for(int i=0;i<N;i++){
                if(E<0){
                    break;
                }else if(H[i]>E){
                    E=E-(H[i]-E);
                }else{
                    E=E+(E-H[i]);
                }
            }

            if(E>=0){
                System.out.println(minE);
                isMin=true;
            }else{
                E=minE+1;
            }
        }
    }
}
