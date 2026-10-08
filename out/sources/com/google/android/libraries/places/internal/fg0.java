package com.google.android.libraries.places.internal;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class fg0 {
    public static List a(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List b(Map map, String str) {
        List listA = a(map, str);
        if (listA == null) {
            return null;
        }
        j(listA);
        return listA;
    }

    public static List c(Map map, String str) {
        List listA = a(map, str);
        if (listA == null) {
            return null;
        }
        for (int i15 = 0; i15 < listA.size(); i15++) {
            if (!(listA.get(i15) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listA.get(i15), Integer.valueOf(i15), listA));
            }
        }
        return listA;
    }

    public static Map d(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static Double e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer f(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d15 = (Double) obj;
        int iIntValue = d15.intValue();
        if (iIntValue == d15.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        new StringBuilder(String.valueOf(d15).length() + 31);
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d15)));
    }

    public static String g(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long h(Map map, String str) {
        boolean z15;
        int iCharAt;
        String strG = g(map, str);
        if (strG == null) {
            return null;
        }
        try {
            if (strG.isEmpty() || strG.charAt(strG.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(strG), 0);
            }
            if (strG.charAt(0) == '-') {
                strG = strG.substring(1);
                z15 = true;
            } else {
                z15 = false;
            }
            String strSubstring = strG.substring(0, strG.length() - 1);
            String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long jA = Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i15 = 0; i15 < 9; i15++) {
                    iCharAt *= 10;
                    if (i15 < strSubstring2.length()) {
                        if (strSubstring2.charAt(i15) < '0' || strSubstring2.charAt(i15) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt += strSubstring2.charAt(i15) - '0';
                    }
                }
            }
            if (jA < 0) {
                throw new ParseException("Invalid duration string: ".concat(strG), 0);
            }
            if (z15) {
                jA = -jA;
                iCharAt = -iCharAt;
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                try {
                    jA = ck.d.a(jA, iCharAt / 1000000000);
                    iCharAt %= 1000000000;
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            if (jA > 0 && iCharAt < 0) {
                iCharAt += 1000000000;
                jA--;
            }
            if (jA < 0 && iCharAt > 0) {
                iCharAt -= 1000000000;
                jA++;
            }
            if (jA < -315576000000L || jA > 315576000000L) {
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jA), Integer.valueOf(iCharAt)));
            }
            long nanos = TimeUnit.SECONDS.toNanos(jA);
            long j15 = iCharAt;
            long j16 = nanos + j15;
            if (!(((nanos ^ j16) >= 0) | ((j15 ^ nanos) < 0))) {
                j16 = ((j16 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return Long.valueOf(j16);
        } catch (ParseException e15) {
            throw new RuntimeException(e15);
        }
    }

    public static Boolean i(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List j(List list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (!(list.get(i15) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i15), Integer.valueOf(i15), list));
            }
        }
        return list;
    }
}
