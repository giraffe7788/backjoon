import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			StringBuilder sb = new StringBuilder();
			
			int testCase = Integer.parseInt(br.readLine());
			for(int i = 0; i < testCase; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int repeat = Integer.parseInt(st.nextToken());
				String str = st.nextToken();
				
				for(int j = 0; j < str.length(); j++) {
					for(int k = 0; k < repeat; k++) {
						sb.append(str.charAt((int)j));
					}
				}
				sb.append("\n");
			}
			
			bw.write(sb.toString().trim());
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}