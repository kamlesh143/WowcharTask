import java.util.Arrays;
import java.util.List;

public interface ClockConstants {
	String COLON = ":";
	String FORMAT_MSG = "Please enter valid time in HH:MM formt";
	String INVALID_TIME_MSG = "Please enter valid time";
	String PREFIX = "It's ";
	String MIDDAY = "Midday";
	String MIDNIGHT = "Midnight";
	String BLANK_SPACE = " ";
	String BLANK = "";
	String MINUTES = " minutes";
	List<String> digits = Arrays.asList("","One","Two","Three", "Four","Five","Six","Seven","Eight","Nine");
	List<String> tenToNinteen = Arrays.asList("Ten","Eleven","Twelve","Thirteen", "Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen","Twenty");
	List<String> multiplesOfTen = Arrays.asList("","","Twenty","Thirty", "Fourty","Fifty");
}
