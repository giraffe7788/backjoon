import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int money = 0;
		
		if(a == b && b == c) {
			money = 10000 + a * 1000;
		} else if(a != b && a != c && b != c) {
			if(a > b && a > c) {
				money = a * 100;
			} else if(b > a && b > c) {
				money = b * 100;
			} else {
				money = c * 100;
			}
		} else {
			if(a==b) {
				money = 1000 + a * 100;
			} else if(b==c) {
				money = 1000 + b * 100;
			} else {
				money = 1000 + c * 100;				
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(money + "");
		bw.flush();
		
		br.close();
		bw.close();
	}
}