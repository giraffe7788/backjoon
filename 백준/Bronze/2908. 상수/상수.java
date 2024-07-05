import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			StringBuilder sb = new StringBuilder(br.readLine());
			sb.reverse();
			
			int numA = Integer.parseInt(sb.toString().split(" ")[0]);
			int numB = Integer.parseInt(sb.toString().split(" ")[1]);
			
			bw.write((numA > numB ? numA : numB) + "");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}