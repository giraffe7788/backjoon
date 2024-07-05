import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			String i = br.readLine();
			char c = i.charAt(0);
			System.out.println((int)c);
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}