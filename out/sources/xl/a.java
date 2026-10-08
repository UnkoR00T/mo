package xl;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f219278a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i15, char c15) {
        return i15 < str.length() && str.charAt(i15) == c15;
    }

    private static int b(String str, int i15) {
        while (i15 < str.length()) {
            char cCharAt = str.charAt(i15);
            if (cCharAt < '0' || cCharAt > '9') {
                return i15;
            }
            i15++;
        }
        return str.length();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00df A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0190 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0116, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x01cf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01ef, please report this as an issue */
    public static Date c(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i15;
        int i16;
        int i17;
        int iD;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i18 = index + 4;
            int iD2 = d(str, index, i18);
            if (a(str, i18, '-')) {
                i18 = index + 5;
            }
            int i19 = i18 + 2;
            int iD3 = d(str, i18, i19);
            if (a(str, i19, '-')) {
                i19 = i18 + 3;
            }
            int i25 = i19 + 2;
            int iD4 = d(str, i19, i25);
            boolean zA = a(str, i25, 'T');
            if (!zA && str.length() <= i25) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iD2, iD3 - 1, iD4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i25);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i26 = i19 + 5;
                int iD5 = d(str, i19 + 3, i26);
                if (a(str, i26, ':')) {
                    i26 = i19 + 6;
                }
                int i27 = i26 + 2;
                int iD6 = d(str, i26, i27);
                if (a(str, i27, ':')) {
                    i27 = i26 + 3;
                }
                if (str.length() <= i27 || (cCharAt2 = str.charAt(i27)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i25 = i27;
                    i15 = iD5;
                    i16 = iD6;
                } else {
                    int i28 = i27 + 2;
                    iD = d(str, i27, i28);
                    if (iD > 59 && iD < 63) {
                        iD = 59;
                    }
                    if (a(str, i28, '.')) {
                        int i29 = i27 + 3;
                        int iB = b(str, i27 + 4);
                        int iMin = Math.min(iB, i27 + 6);
                        int iD7 = d(str, i29, iMin);
                        int i35 = iMin - i29;
                        if (i35 == 1) {
                            iD7 *= 100;
                        } else if (i35 == 2) {
                            iD7 *= 10;
                        }
                        i15 = iD5;
                        i25 = iB;
                        i16 = iD6;
                        i17 = iD7;
                    } else {
                        i15 = iD5;
                        i25 = i28;
                        i16 = iD6;
                        i17 = 0;
                    }
                }
                if (str.length() > i25) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i25);
                if (cCharAt == 'Z') {
                    timeZone = f219278a;
                    length = i25 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i25);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i25 + strSubstring.length();
                    if (!strSubstring.equals("+0000") || strSubstring.equals("+00:00")) {
                        timeZone = f219278a;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id5 = timeZone2.getID();
                        if (!id5.equals(str3) && !id5.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iD2);
                gregorianCalendar2.set(2, iD3 - 1);
                gregorianCalendar2.set(5, iD4);
                gregorianCalendar2.set(11, i15);
                gregorianCalendar2.set(12, i16);
                gregorianCalendar2.set(13, iD);
                gregorianCalendar2.set(14, i17);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i15 = 0;
            i16 = 0;
            i17 = 0;
            iD = 0;
            if (str.length() > i25) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i25);
            if (cCharAt == 'Z') {
                timeZone = f219278a;
                length = i25 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i25);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i25 + strSubstring.length();
                if (strSubstring.equals("+0000")) {
                    timeZone = f219278a;
                } else {
                    timeZone = f219278a;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iD2);
            gregorianCalendar3.set(2, iD3 - 1);
            gregorianCalendar3.set(5, iD4);
            gregorianCalendar3.set(11, i15);
            gregorianCalendar3.set(12, i16);
            gregorianCalendar3.set(13, iD);
            gregorianCalendar3.set(14, i17);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e15) {
            e = e15;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e16) {
            e = e16;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    private static int d(String str, int i15, int i16) {
        int i17;
        int i18;
        if (i15 < 0 || i16 > str.length() || i15 > i16) {
            throw new NumberFormatException(str);
        }
        if (i15 < i16) {
            i18 = i15 + 1;
            int iDigit = Character.digit(str.charAt(i15), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i15, i16));
            }
            i17 = -iDigit;
        } else {
            i17 = 0;
            i18 = i15;
        }
        while (i18 < i16) {
            int i19 = i18 + 1;
            int iDigit2 = Character.digit(str.charAt(i18), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i15, i16));
            }
            i17 = (i17 * 10) - iDigit2;
            i18 = i19;
        }
        return -i17;
    }
}
