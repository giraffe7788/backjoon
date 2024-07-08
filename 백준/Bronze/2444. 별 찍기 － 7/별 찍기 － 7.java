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
			
			for(int i = 1; i <= 2*repeat - 1; i++) {
				
				bw.write(" ".repeat(Math.abs(repeat - i)));
				
				if(i <= repeat) {
					bw.write("*".repeat(2*i - 1));
				} else {
					bw.write("*".repeat(2*(2*repeat - i) - 1));
				}
				
				bw.newLine();
			}
			
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}