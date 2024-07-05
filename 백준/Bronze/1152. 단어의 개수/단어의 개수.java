import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

			String[] words = br.readLine().trim().split(" ");
			int length = words.length;
			if(length == 1 && words[0].equals("")) length=0;
			bw.write(length + "");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}