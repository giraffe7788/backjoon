import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			StringBuilder sb = new StringBuilder();
			
			sb.append("         ,r'\"7" + "\n");
			sb.append("r`-_   ,'  ,/" + "\n");
			sb.append(" \\. \". L_r'" + "\n");
			sb.append("   `~\\/" + "\n");
			sb.append("      |" + "\n");
			sb.append("      |" + "\n");
			
			bw.write(sb.toString());
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}