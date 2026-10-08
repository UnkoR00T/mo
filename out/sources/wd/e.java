package wd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import vd.v;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    static List<vd.g> a(List<vd.g> list, vd.b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<vd.g> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<vd.g> list2 = aVar.f206149h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (vd.g gVar : aVar.f206149h) {
                    if (!treeSet.contains(gVar.a())) {
                        arrayList.add(gVar);
                    }
                }
            }
        } else if (!aVar.f206148g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f206148g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new vd.g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j15) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j15));
    }

    static Map<String, String> c(vd.b.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = aVar.f206143b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j15 = aVar.f206145d;
        if (j15 > 0) {
            map.put("If-Modified-Since", b(j15));
        }
        return map;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static vd.b.a e(vd.k kVar) {
        long j15;
        boolean z15;
        long j16;
        long j17;
        long j18;
        long j19;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = kVar.f206178c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jG = str != null ? g(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i15 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z15 = false;
            j16 = 0;
            j17 = 0;
            while (i15 < strArrSplit.length) {
                String strTrim = strArrSplit[i15].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j16 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j17 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z15 = true;
                }
                i15++;
            }
            j15 = 0;
            i15 = 1;
        } else {
            j15 = 0;
            z15 = false;
            j16 = 0;
            j17 = 0;
        }
        String str3 = map.get("Expires");
        long jG2 = str3 != null ? g(str3) : j15;
        String str4 = map.get("Last-Modified");
        long jG3 = str4 != null ? g(str4) : j15;
        String str5 = map.get("ETag");
        if (i15 != 0) {
            long j25 = jCurrentTimeMillis + (j16 * 1000);
            j19 = z15 ? j25 : (j17 * 1000) + j25;
            j18 = j25;
        } else {
            j18 = (jG <= j15 || jG2 < jG) ? j15 : jCurrentTimeMillis + (jG2 - jG);
            j19 = j18;
        }
        vd.b.a aVar = new vd.b.a();
        aVar.f206142a = kVar.f206177b;
        aVar.f206143b = str5;
        aVar.f206147f = j18;
        aVar.f206146e = j19;
        aVar.f206144c = jG;
        aVar.f206145d = jG3;
        aVar.f206148g = map;
        aVar.f206149h = kVar.f206179d;
        return aVar;
    }

    public static String f(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i15 = 1; i15 < strArrSplit.length; i15++) {
                String[] strArrSplit2 = strArrSplit[i15].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long g(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e15) {
            if (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1.equals(str) || "-1".equals(str)) {
                v.e("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            v.d(e15, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static List<vd.g> h(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new vd.g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    static Map<String, String> i(List<vd.g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (vd.g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }
}
