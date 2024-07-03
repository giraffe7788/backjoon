import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st1.nextToken());
		int minute = Integer.parseInt(st1.nextToken());
		int cookTime = Integer.parseInt(st2.nextToken());
		
		minute += cookTime;
		
		if(minute >= 60) {
			hour += minute/60;
			minute = minute%60;
			
			if(hour >= 24) {
				hour -= 24;
			}
		}
		
		System.out.println(hour + " " + minute);
		
		br.close();
	}
}