import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			String[] strArr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
			String input = br.readLine();
			int sum = 0;
			
			for(int i = 0; i < input.length(); i++) {
				for(int j = 0; j < strArr.length; j++) {
					if(strArr[j].indexOf(input.charAt(i)) != -1) {
						sum += j+3;
					}
				}
			}
			
			bw.write(sum + "");
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}