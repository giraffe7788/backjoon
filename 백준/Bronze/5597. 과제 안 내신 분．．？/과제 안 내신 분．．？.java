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
			
			int[] attendance = new int[30];
			
			for(int i = 0; i < 28; i++) {
				int num = Integer.parseInt(br.readLine());
				attendance[num-1] = 1;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < attendance.length; i++) {
				if(attendance[i] == 0) sb.append((i+1) + "\n");
			}

			bw.write(sb.toString().trim());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}