package io;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import yn.w;
import yn.x;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yn.f f93603a = new yn.g().f(w.STRICT).d().e(x.f228086c).c().b();

    public static c a(Map<String, Object> map, String str) {
        String strH = h(map, str);
        if (strH == null) {
            return null;
        }
        return new c(strH);
    }

    public static boolean b(Map<String, Object> map, String str) throws ParseException {
        Boolean bool = (Boolean) d(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new ParseException("JSON object member " + str + " is missing or null", 0);
    }

    public static Date c(Map<String, Object> map, String str) {
        Number number = (Number) d(map, str, Number.class);
        if (number == null) {
            return null;
        }
        return ko.a.a(number.longValue());
    }

    private static <T> T d(Map<String, Object> map, String str, Class<T> cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t15 = (T) map.get(str);
        if (cls.isAssignableFrom(t15.getClass())) {
            return t15;
        }
        throw new ParseException("Unexpected type of JSON object member " + str + "", 0);
    }

    public static List<Object> e(Map<String, Object> map, String str) {
        return (List) d(map, str, List.class);
    }

    public static Map<String, Object> f(Map<String, Object> map, String str) throws ParseException {
        Map<String, Object> map2 = (Map) d(map, str, Map.class);
        if (map2 == null) {
            return null;
        }
        Iterator<String> it = map2.keySet().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new ParseException("JSON object member " + str + " not a JSON object", 0);
            }
        }
        return map2;
    }

    public static long g(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) d(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException("JSON object member " + str + " is missing or null", 0);
    }

    public static String h(Map<String, Object> map, String str) {
        return (String) d(map, str, String.class);
    }

    public static String[] i(Map<String, Object> map, String str) throws ParseException {
        List<Object> listE = e(map, str);
        if (listE == null) {
            return null;
        }
        try {
            return (String[]) listE.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException("JSON object member " + str + " is not an array of strings", 0);
        }
    }

    public static List<String> j(Map<String, Object> map, String str) throws ParseException {
        String[] strArrI = i(map, str);
        if (strArrI == null) {
            return null;
        }
        return Arrays.asList(strArrI);
    }

    public static URI k(Map<String, Object> map, String str) throws ParseException {
        String strH = h(map, str);
        if (strH == null) {
            return null;
        }
        try {
            return new URI(strH);
        } catch (URISyntaxException e15) {
            throw new ParseException(e15.getMessage(), 0);
        }
    }

    public static Map<String, Object> l() {
        return new HashMap();
    }

    public static Map<String, Object> m(String str) {
        return n(str, -1);
    }

    public static Map<String, Object> n(String str, int i15) throws ParseException {
        if (str == null) {
            throw new ParseException("The JSON object string must not be null", 0);
        }
        if (str.trim().isEmpty()) {
            throw new ParseException("Invalid JSON object", 0);
        }
        if (i15 < 0 || str.length() <= i15) {
            try {
                return (Map) f93603a.j(str, go.a.c(Map.class, String.class, Object.class).e());
            } catch (Exception unused) {
                throw new ParseException("Invalid JSON object", 0);
            } catch (StackOverflowError unused2) {
                throw new ParseException("Excessive JSON object and / or array nesting", 0);
            }
        }
        throw new ParseException("The parsed string is longer than the max accepted size of " + i15 + " characters", 0);
    }

    public static String o(Map<String, ?> map) {
        yn.f fVar = f93603a;
        Objects.requireNonNull(map);
        return fVar.q(map);
    }
}
