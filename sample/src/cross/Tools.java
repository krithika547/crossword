package cross;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Tools {
	public static String getTime() {
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return formatter.format(now);
	}

}
