/**
 * Created by Harish choudhary on 17-09-2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;

class RestInPeace {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String line=br.readLine();
            int n= Integer.parseInt(line);
            if(n%21==0){
                System.out.println("The streak is broken!");
            }else if(line.contains("21")){
                System.out.println("The streak is broken!");
            }else{
                System.out.println("The streak lives still in our heart!");
            }
        }


    }
}
