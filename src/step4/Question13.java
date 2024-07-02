package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question13 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int repeat = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < repeat; i++) {
				int currentNum = Integer.parseInt(st.nextToken());
				if(currentNum < num) bw.write(currentNum + " ");
			}
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}