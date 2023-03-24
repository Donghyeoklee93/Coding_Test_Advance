import java.io.*;
import java.util.*;

public class Greedy15{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        StringBuilder sb = new StringBuilder();
        // A의 개수가 0개부터 n개 까지 있을 수 있는 경우를 체크한다.
        for(int i=n; i >= 0; i--){
            int A = i;
            int B = n - i;

            // A*B가 K보다 작다면 K개의 AB 쌍을 만들 수 없으므로 넘어간다.
            if(A * B < k) continue;

            // cnt는 전체 문자를 몇개 적었는지 확인하기 위해 사용하는 변수
            int cnt = 0;

            // K부터 시작하여 0이 되면 AB쌍을 K개 만들었음을 확인하기 위한 변수
            int temp = k;

            // 우선 가능한 B를 모두 위치시키고 처음 및 각 B의 중간 위치에
            // A를 몇 개씩 놓아야 전체 쌍이 형성될 수 있는지를 체크
            for(int j=B; j >= 0; j--){

                // A의 개수를 각 위치에 놓는다.
                for(int a=i; a >= 0; a--){

                    // 현재 위치한 B의 앞에 A를 놓는데
                    // A*B가 temp보다 작은 경우에는 A는 a개 만큼 위치하고 B를 하나만 우선 놓는다.
                    if(temp > a*j){
                        temp -= a*j;
                        for(int t=0; t < a; t++){
                            sb.append("A");
                            cnt++;
                        }
                        sb.append("B");
                        cnt++;
                        break;
                        // A*B가 temp와 같다면 A와 B 모두 가능한 만큼 다 놓아야 한다.
                    } else if(temp == a*j){
                        temp -= a*j;
                        for(int t=0; t < a; t++){
                            sb.append("A");
                            cnt++;
                        }
                        for(int t=0; t < j; t++){
                            sb.append("B");
                            cnt++;
                        }
                        break;
                    }
                }

                // temp==0이라면 AB의 K쌍이 모두 만들어진 것
                if(temp == 0) {

                    // 만약 N개의 전체 문자를 다 못채웠다면 "A"를 뒤에 계속 붙인다.
                    while(cnt++ < n){
                        sb.append("A");
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }
        System.out.println(-1);
        br.close();
    }
}