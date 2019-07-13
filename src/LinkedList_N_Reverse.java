import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_N_Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] strings= br.readLine().split("\\s+");
        LinkedList<Integer> list=new LinkedList<Integer>();

        for(int i=0;i<strings.length;i++){
            list.add(Integer.valueOf(strings[i]));
        }

//        LinkedList<Integer> reversedList=new LinkedList<Integer>();
//
//        for(int i=list.size()-1;i>=0;i--){
//            reversedList.add(list.size()-1-i,list.get(i));
//        }
//
//        Iterator<Integer> it=reversedList.iterator();

        //每N个反转一下
        int N=3;
        for(int i=0;i+N-1<list.size();i=i+N){
            reverse(list,i,i+N-1);
        }

        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
    //反转函数
    public static void reverse(LinkedList<Integer> list, int start, int end){
        LinkedList<Integer> tempList=new LinkedList<Integer>();
        for(int i=0;i<list.size();i++){
            tempList.add(list.get(i));
        }
        for(int i=start;i<=end;i++){
            list.set(i,tempList.get(start+end-i));
        }
    }

}
