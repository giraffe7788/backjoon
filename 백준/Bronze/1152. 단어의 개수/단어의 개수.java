import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			StringTokenizer st = new StringTokenizer(br.readLine());
			System.out.println(st.countTokens());
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}