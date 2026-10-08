package oo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<a, j> f147179c = new LinkedHashMap(52);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map<String, j> f147180d = new LinkedHashMap(52);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f147181a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f147182b = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f147183a;

        public a(int i15) {
            this(new int[]{i15});
        }

        private void b(int[] iArr) {
            this.f147183a = iArr;
        }

        public int[] a() {
            return this.f147183a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(a(), ((a) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(a());
        }

        public String toString() {
            return Arrays.toString(a());
        }

        public a(int i15, int i16) {
            this(new int[]{i15, i16});
        }

        private a(int[] iArr) {
            this.f147183a = null;
            b(iArr);
        }
    }

    static {
        d(new a(0), "version");
        d(new a(1), "Notice");
        d(new a(12, 0), "Copyright");
        d(new a(2), "FullName");
        d(new a(3), "FamilyName");
        d(new a(4), "Weight");
        d(new a(12, 1), "isFixedPitch");
        d(new a(12, 2), "ItalicAngle");
        d(new a(12, 3), "UnderlinePosition");
        d(new a(12, 4), "UnderlineThickness");
        d(new a(12, 5), "PaintType");
        d(new a(12, 6), "CharstringType");
        d(new a(12, 7), "FontMatrix");
        d(new a(13), "UniqueID");
        d(new a(5), "FontBBox");
        d(new a(12, 8), "StrokeWidth");
        d(new a(14), "XUID");
        d(new a(15), "charset");
        d(new a(16), "Encoding");
        d(new a(17), "CharStrings");
        d(new a(18), com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37085l);
        d(new a(12, 20), "SyntheticBase");
        d(new a(12, 21), "PostScript");
        d(new a(12, 22), "BaseFontName");
        d(new a(12, 23), "BaseFontBlend");
        d(new a(12, 30), "ROS");
        d(new a(12, 31), "CIDFontVersion");
        d(new a(12, 32), "CIDFontRevision");
        d(new a(12, 33), "CIDFontType");
        d(new a(12, 34), "CIDCount");
        d(new a(12, 35), "UIDBase");
        d(new a(12, 36), "FDArray");
        d(new a(12, 37), "FDSelect");
        d(new a(12, 38), "FontName");
        d(new a(6), "BlueValues");
        d(new a(7), "OtherBlues");
        d(new a(8), "FamilyBlues");
        d(new a(9), "FamilyOtherBlues");
        d(new a(12, 9), "BlueScale");
        d(new a(12, 10), "BlueShift");
        d(new a(12, 11), "BlueFuzz");
        d(new a(10), "StdHW");
        d(new a(11), "StdVW");
        d(new a(12, 12), "StemSnapH");
        d(new a(12, 13), "StemSnapV");
        d(new a(12, 14), "ForceBold");
        d(new a(12, 15), "LanguageGroup");
        d(new a(12, 16), "ExpansionFactor");
        d(new a(12, 17), "initialRandomSeed");
        d(new a(19), "Subrs");
        d(new a(20), "defaultWidthX");
        d(new a(21), "nominalWidthX");
    }

    private j(a aVar, String str) {
        e(aVar);
        f(str);
    }

    public static j c(a aVar) {
        return f147179c.get(aVar);
    }

    private static void d(a aVar, String str) {
        j jVar = new j(aVar, str);
        f147179c.put(aVar, jVar);
        f147180d.put(str, jVar);
    }

    private void e(a aVar) {
        this.f147181a = aVar;
    }

    private void f(String str) {
        this.f147182b = str;
    }

    public a a() {
        return this.f147181a;
    }

    public String b() {
        return this.f147182b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return a().equals(((j) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return b();
    }
}
