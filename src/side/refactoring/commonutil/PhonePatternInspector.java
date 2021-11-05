package side.refactoring.commonutil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhonePatternInspector implements PatternInspector{

    private final Pattern PHONE = Pattern.compile("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$");

    @Override
    public boolean check(String value) {
        return PHONE.matcher(value).matches();
    }
}
