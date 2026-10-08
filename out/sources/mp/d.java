package mp;

import io.sentry.android.core.c2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f127342d = d("glyphlist.txt", 4281);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f127343e = d("zapfdingbats.txt", 201);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f127344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f127345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f127346c = new ConcurrentHashMap();

    static {
        try {
            if (System.getProperty("glyphlist_ext") == null) {
            } else {
                throw new UnsupportedOperationException("glyphlist_ext is no longer supported, use GlyphList.DEFAULT.addGlyphs(Properties) instead");
            }
        } catch (SecurityException unused) {
        }
    }

    public d(InputStream inputStream, int i15) throws IOException {
        this.f127344a = new HashMap(i15);
        this.f127345b = new HashMap(i15);
        e(inputStream);
    }

    public static d b() {
        return f127342d;
    }

    public static d c() {
        return f127343e;
    }

    private static d d(String str, int i15) {
        InputStream resourceAsStream;
        String str2 = "com/tom_roush/pdfbox/resources/glyphlist/" + str;
        try {
            try {
                if (yo.b.c()) {
                    resourceAsStream = yo.b.a(str2);
                } else {
                    resourceAsStream = d.class.getResourceAsStream("/" + str2);
                }
                if (resourceAsStream != null) {
                    d dVar = new d(resourceAsStream, i15);
                    dp.a.b(resourceAsStream);
                    return dVar;
                }
                throw new IOException("GlyphList '" + str2 + "' not found");
            } catch (IOException e15) {
                throw new RuntimeException(e15);
            }
        } catch (Throwable th4) {
            dp.a.b(null);
            throw th4;
        }
    }

    private void e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
        while (bufferedReader.ready()) {
            try {
                String line = bufferedReader.readLine();
                if (line != null && !line.startsWith("#")) {
                    String[] strArrSplit = line.split(";");
                    if (strArrSplit.length < 2) {
                        throw new IOException("Invalid glyph list entry: " + line);
                    }
                    String str = strArrSplit[0];
                    String[] strArrSplit2 = strArrSplit[1].split(" ");
                    if (this.f127344a.containsKey(str)) {
                        c2.g("PdfBox-Android", "duplicate value for " + str + " -> " + strArrSplit[1] + " " + this.f127344a.get(str));
                    }
                    int length = strArrSplit2.length;
                    int[] iArr = new int[length];
                    int length2 = strArrSplit2.length;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < length2) {
                        iArr[i16] = Integer.parseInt(strArrSplit2[i15], 16);
                        i15++;
                        i16++;
                    }
                    String str2 = new String(iArr, 0, length);
                    this.f127344a.put(str, str2);
                    boolean z15 = k.f127358d.b(str) || g.f127352d.b(str) || e.f127348d.b(str) || i.f127356d.b(str) || l.f127360d.b(str);
                    if (!this.f127345b.containsKey(str2) || z15) {
                        this.f127345b.put(str2, str);
                    }
                }
            } catch (Throwable th4) {
                bufferedReader.close();
                throw th4;
            }
        }
        bufferedReader.close();
    }

    public String a(int i15) {
        String str = this.f127345b.get(new String(new int[]{i15}, 0, 1));
        return str == null ? ".notdef" : str;
    }

    public String f(String str) {
        if (str == null) {
            return null;
        }
        String str2 = this.f127344a.get(str);
        if (str2 != null) {
            return str2;
        }
        String strValueOf = this.f127346c.get(str);
        if (strValueOf == null) {
            if (str.indexOf(46) > 0) {
                strValueOf = f(str.substring(0, str.indexOf(46)));
            } else if (str.startsWith("uni") && str.length() == 7) {
                int length = str.length();
                StringBuilder sb5 = new StringBuilder();
                int i15 = 3;
                while (true) {
                    int i16 = i15 + 4;
                    if (i16 > length) {
                        break;
                    }
                    try {
                        int i17 = Integer.parseInt(str.substring(i15, i16), 16);
                        if (i17 <= 55295 || i17 >= 57344) {
                            sb5.append((char) i17);
                        } else {
                            c2.g("PdfBox-Android", "Unicode character name with disallowed code area: " + str);
                        }
                        i15 = i16;
                    } catch (NumberFormatException unused) {
                        c2.g("PdfBox-Android", "Not a number in Unicode character name: " + str);
                    }
                    c2.g("PdfBox-Android", "Not a number in Unicode character name: " + str);
                }
                strValueOf = sb5.toString();
            } else if (str.startsWith("u") && str.length() == 5) {
                try {
                    int i18 = Integer.parseInt(str.substring(1), 16);
                    if (i18 <= 55295 || i18 >= 57344) {
                        strValueOf = String.valueOf((char) i18);
                    } else {
                        c2.g("PdfBox-Android", "Unicode character name with disallowed code area: " + str);
                    }
                } catch (NumberFormatException unused2) {
                    c2.g("PdfBox-Android", "Not a number in Unicode character name: " + str);
                }
            }
            if (strValueOf != null) {
                this.f127346c.put(str, strValueOf);
            }
        }
        return strValueOf;
    }
}
