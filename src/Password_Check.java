import java.util.Scanner;

/**
 * 输入n
 * n行密码，输出YES合法，NO不合法
 *
 * 规则：
 * 1. 判断密码长度>=8?YES:NO
 * 2. 第一个字符数字？NO:YES
 * 3. 字符只能是大写字母+小写字母+数字？YES:NO
 * 4. 密码中必须出现至少三种字符类型中的两种？YES:NO
 */
public class Password_Check {

    public static void main(String[] args) {
        int num=0;

        Scanner scanner=new Scanner(System.in);

        if(scanner.hasNextInt()){
            num=scanner.nextInt();
        }else{
            System.out.println("输入非数字");
        }

        if(num<=0){
            System.out.println("请输入正整数");
        }

        String[] strs=new String[num];

        for(int i=0;i<num;i++){
            if(scanner.hasNextLine()){
                strs[i]=scanner.nextLine();
            }
        }

    }

    public String checkPass(String str){
        char[] chars=str.toCharArray();
        String no="NO";
        String yes="YES";
        int typeCount=0;
        boolean numberFlag=false;
        boolean upperCaseFlag=false;
        boolean lowCaseFlag=false;

        if(chars.length<8){
            return no;
        }else if(chars[0]>'0'&& chars[0]<'9'){
            return no;
        }else{
            for(int j=0;j<chars.length;j++){
                if('0'<chars[j]&& chars[j]<'9'){
                    if(numberFlag==false){
                        numberFlag=true;
                        typeCount++;
                    }
                }else if('a'<chars[j]&&chars[j]<'z'){
                    if(lowCaseFlag==false){
                        lowCaseFlag=true;
                        typeCount++;
                    }
                }else if('A'<chars[j]&&chars[j]<'Z'){
                    if(upperCaseFlag==false){
                        upperCaseFlag=true;
                        typeCount++;
                    }
                }else{
                    return no;
                }
            }
        }

        if(typeCount<2){
            return no;
        }

        return yes;
    }
}
