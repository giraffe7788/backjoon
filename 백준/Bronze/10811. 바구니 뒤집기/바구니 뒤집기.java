import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int bucketQt = Integer.parseInt(st.nextToken());
			int[] bucket = new int[bucketQt];
			int repeat 	 = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < bucketQt; i++) {
				bucket[i] = i+1;
			}
			
			for(int i = 0; i < repeat; i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken()) -1;
				int end   = Integer.parseInt(st.nextToken()) -1;

				while(start < end){
					int temp = bucket[start];
					bucket[start] = bucket[end];
					bucket[end] = temp;
					
					start++;
					end--;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int b : bucket) {
				sb.append(b + " ");
			}
			bw.write(sb.toString().trim());
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}
