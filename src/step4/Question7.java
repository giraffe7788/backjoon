package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Question7 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			boolean[] isSubmit = new boolean[30];
			
			for(int i = 0; i < 28; i++) {
				int num = Integer.parseInt(br.readLine());
				isSubmit[num-1] = true;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < isSubmit.length; i++) {
				if(!isSubmit[i]) sb.append((i+1) + "\n");
			}

			bw.write(sb.toString().trim());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}