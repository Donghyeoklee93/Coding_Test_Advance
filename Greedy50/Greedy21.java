import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy21 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        cost = 1000-cost;
        int num =0;
        while(cost>0){
            if(cost/500>0){
                num += cost/500;
                cost = cost%500;
            }
            else if(cost/100>0){
                num += cost/100;
                cost = cost%100;
            }
            else if(cost/50>0){
                num += cost/50;
                cost = cost%50;
            }
            else if(cost/10>0){
                num += cost/10;
                cost = cost%10;
            }
            else if(cost/5>0){
                num += cost/5;
                cost = cost%5;
            }
            else{
                num += cost/1;
            }
        }
        System.out.println(num);
    }
}