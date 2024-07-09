import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			String word = br.readLine().toUpperCase();
			int max = Integer.MIN_VALUE;
			char maxChar = 0;
			boolean isDup = false;

			for(int i = 'A'; i <= 'Z'; i++) {
				
				int cnt = 0;
				
				for(int j = 0; j < word.length(); j++) {
					if(i == word.charAt(j)) cnt++;
				}
				
				if(cnt > max) {
					max = cnt;
					maxChar = (char)i;
					isDup = false;
				} else if(cnt == max) {
					isDup = true;
				}
			}

			bw.write((isDup == true) ? "?" : String.valueOf(maxChar));
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}