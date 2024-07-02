package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question10_1 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			StringTokenizer st = null;
			
			int repeat = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= repeat; i++) {
				
				for(int j = 0; j < repeat; j++) {
					if(i+j >= repeat) bw.write("*");
					else bw.write(" ");
				}
				bw.newLine();
			}
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}