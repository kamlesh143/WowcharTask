import java.util.Arrays;
import java.util.Scanner;

public class SpeakingClock implements ClockConstants{

	public static void main(String[] args) {
		System.out.println("Please enter the time in 24 hours format, eg- 08:34 or 15:00");
		String time = new Scanner(System.in).next();
		int hours;
		int minutes;
		try {
		if(!time.contains(COLON))
			throw new ClockException(FORMAT_MSG);
		else {
			String[] parts = time.split(COLON);
			hours = Integer.valueOf(parts[0]);
			minutes = Integer.valueOf(parts[1]);
			if(hours >23 || minutes >59) {
				throw new ClockException(INVALID_TIME_MSG);
			}
			else {
				System.out.println(timeInWords(hours, minutes));
			}
		}
		}catch(ClockException e) {
			e.printStackTrace();
		}

	}

	private static String timeInWords(int hours, int minutes) {
		StringBuilder sb = new StringBuilder(PREFIX);
		if(Arrays.asList(12,0).contains(hours)) {
			if(hours==12) {
				if(minutes==0)
					sb.append(MIDDAY);
				else
					sb.append(numToWord(hours).append(BLANK_SPACE + numToWord(minutes)));
			}
			else if(hours==0){
				sb.append(MIDNIGHT);
				if(minutes==0)
					sb.append(BLANK);
				else
					sb.append(BLANK_SPACE +numToWord(minutes) +MINUTES);
			}
		}
		else  {
			sb.append(numToWord(hours).append(BLANK_SPACE + numToWord(minutes)));
		}
		return sb.toString();
	}
	
	private static StringBuilder numToWord(int n) {
		StringBuilder op= new StringBuilder();
		if(n == 0) {
			op.append(BLANK);
		}
		else {
			if(n/10 == 0) {
				op.append(digits.get(n%10));
			}
			else if(n/10 ==1) {
				op.append(tenToNinteen.get(n%10));
			}
			else if(n/10>=2) {
				String digitPlace = digits.get(n%10);
				n=n/10;
				String tenthPlace = multiplesOfTen.get(n%10);
				op.append(tenthPlace).append(BLANK_SPACE +digitPlace);
			}
		}
		return op;
	}
}
