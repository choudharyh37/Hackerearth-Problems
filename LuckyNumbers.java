import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);
        int T=s.nextInt();

       for (int i = 0; i < T; i++) {
            long N=s.nextLong();
            long sum=0;
            for(long j=1;j<=N;j++){

                if(countSetBits(j)==2){
                    sum+=j;
                }
            }
            System.out.println(sum);
        }
        //int n=countSetBits(T);
        //System.out.println(n);
    }

    static int countSetBits(long n){
        int count=0;
        while(n!=0){
            count+=(int)(n & 1);
            n>>=1;
        }
        return count;
    }
}
