import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))	) {
		
			String inputStr = br.readLine();
			String[] croatiaArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
			int cnt = 0;
			boolean flag = false;

			while(inputStr.length() > 0) {
				flag = false;
				for(String croatiaStr : croatiaArr) {
					if(inputStr.indexOf(croatiaStr) == 0) {
						inputStr = inputStr.replaceFirst(croatiaStr, "");
						cnt++;
						flag = true;
					}
				}
				
				if(flag) continue;
				inputStr = inputStr.replaceFirst(String.valueOf(inputStr.charAt(0)), "");
				cnt++;
			}
			bw.write(cnt + "");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
