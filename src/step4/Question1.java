package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question1 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			int cnt = 0;
			int repeat = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int search = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < repeat; i++) {
				if(Integer.parseInt(st.nextToken()) == search) cnt++;
			}
			
			bw.write(cnt + "\n");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}