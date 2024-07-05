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
			
			for(int i = 0; i < repeat; i++) {
				String input = br.readLine();
				int length = input.length() != 1 ? input.length() : 1;
				bw.write(input.charAt(0));
				bw.write(input.charAt(length-1) + "\n");
			}
			
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}