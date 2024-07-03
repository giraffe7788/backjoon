import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			int repeat = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i = 0; i < repeat; i++) {
				int currentNum = Integer.parseInt(st.nextToken());
				if(currentNum < min) min = currentNum;
				if(currentNum > max) max = currentNum;
			}
			
			bw.write(min + " " + max);
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}