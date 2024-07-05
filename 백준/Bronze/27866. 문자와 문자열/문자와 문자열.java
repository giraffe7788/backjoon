import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			String input = br.readLine();
			int index = Integer.parseInt(br.readLine());
			bw.write(input.charAt(index-1));
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}