package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question5 {
	public static void main(String[] args)  {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int size = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < size/4; i++) {
				bw.write("long ");
			}
			bw.write("int");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}