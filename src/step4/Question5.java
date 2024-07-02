package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Question5 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int bucketQt = Integer.parseInt(st.nextToken());
			int[] bucket = new int[bucketQt];
			int cnt = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < cnt; i++) {
				st = new StringTokenizer(br.readLine());
				int start 	= Integer.parseInt(st.nextToken());
				int end 	= Integer.parseInt(st.nextToken());
				int number 	= Integer.parseInt(st.nextToken());
				
				for(int j = start-1; j < end; j++) {
					bucket[j] = number;
				}
			}
			
			StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bucket.length; i++) {
                sb.append(bucket[i]).append(" ");
            }
            
            bw.write(sb.toString().trim());
            bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}