/**
 * Created by Harish choudhary on 17-09-2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TheMagic {
    public static void main(String args[] ) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i= 0; i <= N; i++) {
            int T=Integer.parseInt(br.readLine());
            int count=0;
            while(T!=0){
                if(T%2==1){
                    count++;
                }
                T=T/2;
            }

            System.out.println(count);
        }
    }
}

