package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Question3_1 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			int repeat = Integer.parseInt(br.readLine());
			String[] strArr = br.readLine().split(" ");
			int[] intArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
			
			int max = intArr[0];
			int min = intArr[0];
			
			for(int i = 0; i < repeat; i++) {
				if(intArr[i] < min) min = intArr[i];
				if(intArr[i] > max) max = intArr[i];
			}
			
			bw.write(min + " " + max);
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}