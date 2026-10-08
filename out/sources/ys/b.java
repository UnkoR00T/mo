package ys;

import fu.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f229087a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f229088b = v.v0(v.q('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f229089c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listQ = v.q("Boolean", "Z", "Char", "C", "Byte", "B", "Short", ip.a.f96137b, "Int", "I", "Float", "F", "Long", "J", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37037x0, ip.a.f96138c);
        int iC = xq.c.c(0, listQ.size() - 1, 2);
        if (iC >= 0) {
            int i15 = 0;
            while (true) {
                StringBuilder sb5 = new StringBuilder();
                String str = f229088b;
                sb5.append(str);
                sb5.append('/');
                sb5.append((String) listQ.get(i15));
                int i16 = i15 + 1;
                linkedHashMap.put(sb5.toString(), listQ.get(i16));
                linkedHashMap.put(str + '/' + ((String) listQ.get(i15)) + "Array", '[' + ((String) listQ.get(i16)));
                if (i15 == iC) {
                    break;
                } else {
                    i15 += 2;
                }
            }
        }
        linkedHashMap.put(f229088b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : v.q("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : v.q("Iterator", "Collection", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d, "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i17 = 0; i17 < 23; i17++) {
            StringBuilder sb6 = new StringBuilder();
            String str4 = f229088b;
            sb6.append(str4);
            sb6.append("/jvm/functions/Function");
            sb6.append(i17);
            a(linkedHashMap, "Function" + i17, sb6.toString());
            a(linkedHashMap, "reflect/KFunction" + i17, str4 + "/reflect/KFunction");
        }
        for (String str5 : v.q("Char", "Byte", "Short", "Int", "Float", "Long", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37037x0, "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f229088b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f229089c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f229088b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String str) {
        String str2 = f229089c.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + r.O(str, '.', '$', false, 4, null) + ';';
    }
}
