import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			String[] arr = br.readLine().split(" ");
			int bucketQt = Integer.parseInt(arr[0]);
			int[] bucket = new int[bucketQt];
			int cnt = Integer.parseInt(arr[1]);
			
			for(int i = 0; i < cnt; i++) {
				arr = br.readLine().split(" ");
				int start 	= Integer.parseInt(arr[0]);
				int end 	= Integer.parseInt(arr[1]);
				int number 	= Integer.parseInt(arr[2]);
				
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