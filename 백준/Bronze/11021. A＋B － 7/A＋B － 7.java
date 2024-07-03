import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			StringTokenizer st = null;
			
			int repeat = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= repeat; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write("Case #" + i + ": " + (a+b));
				bw.newLine();
			}
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}