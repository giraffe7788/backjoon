import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			StringBuilder sb = new StringBuilder();
			
			String input = br.readLine();
			for(int i = 'a'; i <= 'z'; i++) {
				sb.append(input.indexOf(i) + " ");
			}
			
			bw.write(sb.toString().trim());
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}