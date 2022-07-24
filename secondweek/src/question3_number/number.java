package question3_number;
import java.util.Scanner;

public class number {
    static int n=0;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        backtrack(0,new StringBuilder("0"),0);
    }
    static  void backtrack(int sum,StringBuilder track,int front){
        if(sum==n&&track.length()>3){
//            track.delete(0,1);
            System.out.println(track.substring(2,track.length()));
        }else{
            for (int i = 1; i <=n-sum; i++) {
                if(i<front)continue;
                track.append('+');
                track.append(i);
                backtrack(sum+i,track,i);
                track.delete(track.length()-2,track.length());


            }
        }
    }
}

