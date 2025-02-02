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
			double sum = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < repeat; i++) {
				int score = Integer.parseInt(st.nextToken());
				scoreArr[i] = score;
				sum += score;
				if(max < score) max = score;
			}
			
			bw.write((sum / max * 100) / repeat + "");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}