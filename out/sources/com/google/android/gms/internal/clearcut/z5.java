package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class z5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static HashMap<String, String> f29630f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f29635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f29636l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f29625a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f29626b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f29627c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f29628d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f29629e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Boolean> f29631g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap<String, Integer> f29632h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HashMap<String, Long> f29633i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashMap<String, Float> f29634j = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String[] f29637m = new String[0];

    public static long a(ContentResolver contentResolver, String str, long j15) {
        Object objI = i(contentResolver);
        long j16 = 0;
        Long lValueOf = (Long) b(f29633i, str, 0L);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        String strC = c(contentResolver, str, null);
        if (strC != null) {
            try {
                long j17 = Long.parseLong(strC);
                lValueOf = Long.valueOf(j17);
                j16 = j17;
            } catch (NumberFormatException unused) {
            }
        }
        g(objI, f29633i, str, lValueOf);
        return j16;
    }

    private static <T> T b(HashMap<String, T> map, String str, T t15) {
        synchronized (z5.class) {
            try {
                if (!map.containsKey(str)) {
                    return null;
                }
                T t16 = map.get(str);
                if (t16 != null) {
                    t15 = t16;
                }
                return t15;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static String c(ContentResolver contentResolver, String str, String str2) {
        String str3;
        synchronized (z5.class) {
            try {
                e(contentResolver);
                Object obj = f29635k;
                String str4 = null;
                if (f29630f.containsKey(str)) {
                    str3 = f29630f.get(str);
                    if (str3 != null) {
                        str4 = str3;
                    }
                } else {
                    String[] strArr = f29637m;
                    int length = strArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            Cursor cursorQuery = contentResolver.query(f29625a, null, null, new String[]{str}, null);
                            if (cursorQuery != null) {
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        String string = cursorQuery.getString(1);
                                        if (string != null && string.equals(null)) {
                                            string = null;
                                        }
                                        f(obj, str, string);
                                        str4 = string != null ? string : null;
                                        cursorQuery.close();
                                        return str4;
                                    }
                                } catch (Throwable th4) {
                                    if (cursorQuery == null) {
                                        throw th4;
                                    }
                                    cursorQuery.close();
                                    throw th4;
                                }
                            }
                            f(obj, str, null);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                        if (!str.startsWith(strArr[i15])) {
                            i15++;
                        } else if (!f29636l || f29630f.isEmpty()) {
                            f29630f.putAll(d(contentResolver, f29637m));
                            f29636l = true;
                            if (f29630f.containsKey(str) && (str3 = f29630f.get(str)) != null) {
                                break;
                            }
                        }
                    }
                    str4 = str3;
                }
                return str4;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    private static Map<String, String> d(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(f29626b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } catch (Throwable th4) {
                cursorQuery.close();
                throw th4;
            }
        }
        cursorQuery.close();
        return treeMap;
    }

    private static void e(ContentResolver contentResolver) {
        if (f29630f == null) {
            f29629e.set(false);
            f29630f = new HashMap<>();
            f29635k = new Object();
            f29636l = false;
            contentResolver.registerContentObserver(f29625a, true, new a6(null));
            return;
        }
        if (f29629e.getAndSet(false)) {
            f29630f.clear();
            f29631g.clear();
            f29632h.clear();
            f29633i.clear();
            f29634j.clear();
            f29635k = new Object();
            f29636l = false;
        }
    }

    private static void f(Object obj, String str, String str2) {
        synchronized (z5.class) {
            try {
                if (obj == f29635k) {
                    f29630f.put(str, str2);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static <T> void g(Object obj, HashMap<String, T> map, String str, T t15) {
        synchronized (z5.class) {
            try {
                if (obj == f29635k) {
                    map.put(str, t15);
                    f29630f.remove(str);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static boolean h(ContentResolver contentResolver, String str, boolean z15) {
        Object objI = i(contentResolver);
        HashMap<String, Boolean> map = f29631g;
        Boolean bool = (Boolean) b(map, str, Boolean.valueOf(z15));
        if (bool != null) {
            return bool.booleanValue();
        }
        String strC = c(contentResolver, str, null);
        if (strC != null && !strC.equals("")) {
            if (f29627c.matcher(strC).matches()) {
                bool = Boolean.TRUE;
                z15 = true;
            } else if (f29628d.matcher(strC).matches()) {
                bool = Boolean.FALSE;
                z15 = false;
            } else {
                io.sentry.android.core.c2.g("Gservices", "attempt to read gservices key " + str + " (value \"" + strC + "\") as boolean");
            }
        }
        g(objI, map, str, bool);
        return z15;
    }

    private static Object i(ContentResolver contentResolver) {
        Object obj;
        synchronized (z5.class) {
            e(contentResolver);
            obj = f29635k;
        }
        return obj;
    }
}
