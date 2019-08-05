/**
 * 2019-08-03 网易笔试
 */

import java.util.Scanner;

public class WY_20190803_Main {
    public static void main(String[] args) {
        int student=0,inquery=0;
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNextInt()){
            student=scanner.nextInt();
        }
        int [] scores=new int[student];
        for(int i=0;i<student;i++){
            scores[i]=scanner.nextInt();
        }
        if(scanner.hasNextInt()){
            inquery=scanner.nextInt();
        }
        int[] number=new int[inquery];
        for(int j=0;j<inquery;j++){
            number[j]=scanner.nextInt();
        }


        for(int k=0;k<inquery;k++){
            double ranklist=getRank(scores,scores[number[k]-1]);
            String result=String.format("%.6f",ranklist);
            System.out.println(result);
        }

    }
    public static double getRank(int[] score, int targetScore){
        double count=0.0;
        double result=0.0;
        for(int i=0;i<score.length;i++){
            if(score[i]<=targetScore){
                count=count+1.0;
            }
        }
        result=(count-1)/(double)score.length*100;
        return result;

    }
}
