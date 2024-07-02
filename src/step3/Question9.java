package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question9 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			StringTokenizer st = null;
			
			int repeat = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < repeat; i++) {
				
				for(int j = 0; j <= i; j++) {
					bw.write("*");
				}
				bw.newLine();
			}
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}