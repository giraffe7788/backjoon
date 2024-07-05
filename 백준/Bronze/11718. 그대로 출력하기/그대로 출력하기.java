import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) != null) {
				sb.append(input + "\n");
			}
			
			bw.write(sb.toString());
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}