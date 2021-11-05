package side.refactoring.commonutil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		PatternInspector inspector = new PhonePatternInspector();
		for (int i = 0 ; i < 1000 ; i++)
			inspector.check("010-6844-7374");
		System.out.println(System.currentTimeMillis() - start);

//		phoneTest();
	}
	public static void phoneTest(){
		PatternInspector inspector = new PhonePatternInspector();
		System.out.println(inspector.check("010-6844-7374")); // true
		System.out.println(inspector.check("01-6844-7374")); // false
		System.out.println(inspector.check("010-684-7374")); // true
		System.out.println(inspector.check("010-6844-774")); // false
		System.out.println(inspector.check("01o--774")); // false
	}
	public boolean check_pattern(String type, String text) {
		//
		boolean is_ok = true;

		if(type.equals("id")){
			//시작은 영문으로만, '_'를 제외한 특수문자 안되며 영문, 숫자, '_'으로만 이루어진 5 ~ 12자 이하
			String pattern = "^[a-zA-Z]{1}[a-zA-Z0-9_]{5,12}$";
			Matcher matcher = Pattern.compile(pattern).matcher(text);
			if(!matcher.matches()){
				is_ok = false;
			}
		}
		else if(type.equals("password")){
			//1. 영문, 숫자, 특수문자 조합
			//2. 4~10자리 사이 문자
			String pattern = "^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-zA-Z]).{4,10}$";
			Matcher matcher = Pattern.compile(pattern).matcher(text);
			if(!matcher.matches()){
				is_ok = false;
			}
		}
		else if(type.equals("email")){
			String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			Matcher matcher = Pattern.compile(pattern).matcher(text);
			if(!matcher.matches()){
				is_ok = false;
			}
		}
		else if(type.equals("phone")){
			String pattern = "^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";
			Matcher matcher = Pattern.compile(pattern).matcher(text);
			if(!matcher.matches()){
				is_ok = false;
			}
		}
		else if(type.equals("platenumber")) {
			//차량번호 검증정규식
	        String pattern1 = "^[가-힣]{2}\\d{2}[가-힣]{1}\\d{4}$"; // 서울12가1234
	        String pattern2 = "^\\d{3}[가-힣]{1}\\d{4}$"; // 123조1234
	        String pattern3 = "^\\d{2}[가-힣]{1}\\d{4}$"; // 12조1234
	        boolean regex = Pattern.matches(pattern1, text) | Pattern.matches(pattern2, text) | Pattern.matches(pattern3, text);
	        if(!(regex==true)) {
	        	is_ok = false;
	        }
		}

		return is_ok;
	}
}
