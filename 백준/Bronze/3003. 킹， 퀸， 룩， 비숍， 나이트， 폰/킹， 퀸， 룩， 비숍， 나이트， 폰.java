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
			StringBuilder sb = new StringBuilder();
			
			int[] chessPieces = {1, 1, 2, 2, 2, 8};
			
			for(int piece : chessPieces) {
				sb.append((piece - Integer.parseInt(st.nextToken())) + " ");
			}
			
			bw.write(sb.toString().trim());
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}