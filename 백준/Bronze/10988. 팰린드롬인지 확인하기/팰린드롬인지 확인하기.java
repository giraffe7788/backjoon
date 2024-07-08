import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			String word = br.readLine();
			int isPal = 0;
			int start = 0;
			int end = word.length() - 1;
			
			while(start <= end) {
				if(word.charAt(start) != word.charAt(end)) break;
				start++;
				end--;
				if(start >= end) isPal = 1;
			}
			
			bw.write(isPal + "");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}