package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question4 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			int index = 0;
			int max = Integer.MIN_VALUE;
			
			for(int i = 1; i <= 9; i++) {
				int currentNum = Integer.parseInt(br.readLine());
				if(currentNum > max) {
					max = currentNum;
					index = i;
				}
			}
			
			bw.write(max + "\n" + index);
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}