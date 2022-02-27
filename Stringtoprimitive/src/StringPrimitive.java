import java.text.ParseException;
		import java.text.SimpleDateFormat;
		import java.util.Date;

public class StringPrimitive {

	
		public static int toInt(String s) {
			return Integer.parseInt(s);
		}

		
		public static long tolong(String s) {
			return Long.parseLong(s);
		}


		public static double todouble(String s) {
			return Double.parseDouble(s);
		}

		
		public static char[] toCharArray(String s) {
			return s.toCharArray();
		}

		public static byte[] toByteArray(String s) {
			return s.getBytes();
		}

		public static boolean toboolean(String s) {
			return Boolean.parseBoolean(s);
		}

		
		public static Date toDate(String date, String pattern) throws ParseException {
			SimpleDateFormat formatter = new SimpleDateFormat(pattern);
			return formatter.parse(date);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			// Program to convert string to primitive data types in Java
			// Parse word is primitive 
				String s = "1";
				System.out.println("To primitive int: " + toInt(s));
				
			
		}
		
	}


