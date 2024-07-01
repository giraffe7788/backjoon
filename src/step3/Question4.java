package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question4 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int total = Integer.parseInt(br.readLine());
		int repeat = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < repeat; i++) {
			
			st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int qt = Integer.parseInt(st.nextToken());
			total -= price*qt;
		}
		
		if(total==0) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}