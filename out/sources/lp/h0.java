package lp;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f119098a = new HashMap(38);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, no.e> f119099b = new HashMap(14);

    static {
        f("Courier-Bold");
        f("Courier-BoldOblique");
        f("Courier");
        f("Courier-Oblique");
        f("Helvetica");
        f("Helvetica-Bold");
        f("Helvetica-BoldOblique");
        f("Helvetica-Oblique");
        f("Symbol");
        f("Times-Bold");
        f("Times-BoldItalic");
        f("Times-Italic");
        f("Times-Roman");
        f("ZapfDingbats");
        g("CourierCourierNew", "Courier");
        g("CourierNew", "Courier");
        g("CourierNew,Italic", "Courier-Oblique");
        g("CourierNew,Bold", "Courier-Bold");
        g("CourierNew,BoldItalic", "Courier-BoldOblique");
        g("Arial", "Helvetica");
        g("Arial,Italic", "Helvetica-Oblique");
        g("Arial,Bold", "Helvetica-Bold");
        g("Arial,BoldItalic", "Helvetica-BoldOblique");
        g("TimesNewRoman", "Times-Roman");
        g("TimesNewRoman,Italic", "Times-Italic");
        g("TimesNewRoman,Bold", "Times-Bold");
        g("TimesNewRoman,BoldItalic", "Times-BoldItalic");
        g("Symbol,Italic", "Symbol");
        g("Symbol,Bold", "Symbol");
        g("Symbol,BoldItalic", "Symbol");
        g("Times", "Times-Roman");
        g("Times,Italic", "Times-Italic");
        g("Times,Bold", "Times-Bold");
        g("Times,BoldItalic", "Times-BoldItalic");
        g("ArialMT", "Helvetica");
        g("Arial-ItalicMT", "Helvetica-Oblique");
        g("Arial-BoldMT", "Helvetica-Bold");
        g("Arial-BoldItalicMT", "Helvetica-BoldOblique");
    }

    public static boolean a(String str) {
        return f119098a.containsKey(str);
    }

    public static no.e b(String str) {
        String str2 = f119098a.get(str);
        if (str2 == null) {
            return null;
        }
        Map<String, no.e> map = f119099b;
        if (map.get(str2) == null) {
            synchronized (map) {
                if (map.get(str2) == null) {
                    try {
                        e(str2);
                    } catch (IOException e15) {
                        throw new IllegalArgumentException(e15);
                    }
                }
            }
        }
        return map.get(str2);
    }

    public static String c(String str) {
        return f119098a.get(str);
    }

    public static Set<String> d() {
        return Collections.unmodifiableSet(f119098a.keySet());
    }

    private static void e(String str) throws IOException {
        InputStream resourceAsStream;
        String str2 = "com/tom_roush/pdfbox/resources/afm/" + str + ".afm";
        if (yo.b.c()) {
            resourceAsStream = yo.b.a(str2);
        } else {
            resourceAsStream = c0.class.getResourceAsStream("/" + str2);
        }
        if (resourceAsStream == null) {
            throw new IOException("resource '" + str2 + "' not found");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
        try {
            f119099b.put(str, new no.a(bufferedInputStream).d(true));
        } finally {
            bufferedInputStream.close();
        }
    }

    private static void f(String str) {
        f119098a.put(str, str);
    }

    private static void g(String str, String str2) {
        f119098a.put(str, str2);
    }
}
