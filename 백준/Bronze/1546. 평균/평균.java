import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			int repeat = Integer.parseInt(br.readLine());
			int[] scoreArr = new int[repeat];
			int max = Integer.MIN_VALUE;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < repeat; i++) {
				int score = Integer.parseInt(st.nextToken());
				scoreArr[i] = score;
				if(max < score) max = score;
			}
			
			double sum = 0;
			for(int i = 0; i < repeat; i++) {
				sum += (double)scoreArr[i] / max * 100;
			}
			
			bw.write((double)sum/repeat + "");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}