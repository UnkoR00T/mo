package oo;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f147184a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f147185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f147186c;

    public interface b {
    }

    static abstract class c extends oo.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f147187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a[] f147188d;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f147189a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f147190b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f147191c;

            a() {
            }

            public String toString() {
                return getClass().getName() + "[code=" + this.f147189a + ", sid=" + this.f147190b + "]";
            }
        }

        c() {
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, a> f147192a;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List<Number> f147193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private oo.j f147194b;

            private a() {
                this.f147193a = new ArrayList();
                this.f147194b = null;
            }

            public List<Number> d() {
                return this.f147193a;
            }

            public Boolean e(int i15, Boolean bool) {
                Number number = this.f147193a.get(i15);
                if (number instanceof Integer) {
                    int iIntValue = number.intValue();
                    if (iIntValue == 0) {
                        return Boolean.FALSE;
                    }
                    if (iIntValue == 1) {
                        return Boolean.TRUE;
                    }
                }
                c2.g("PdfBox-Android", "Expected boolean, got " + number + ", returning default " + bool);
                return bool;
            }

            public List<Number> f() {
                ArrayList arrayList = new ArrayList(this.f147193a);
                for (int i15 = 1; i15 < arrayList.size(); i15++) {
                    arrayList.set(i15, Integer.valueOf(((Number) arrayList.get(i15 - 1)).intValue() + ((Number) arrayList.get(i15)).intValue()));
                }
                return arrayList;
            }

            public Number g(int i15) {
                return this.f147193a.get(i15);
            }

            public boolean h() {
                return !this.f147193a.isEmpty();
            }

            public int i() {
                return this.f147193a.size();
            }

            public String toString() {
                return getClass().getName() + "[operands=" + this.f147193a + ", operator=" + this.f147194b + "]";
            }
        }

        private d() {
            this.f147192a = new HashMap();
        }

        public void a(a aVar) {
            if (aVar.f147194b != null) {
                this.f147192a.put(aVar.f147194b.b(), aVar);
            }
        }

        public List<Number> b(String str, List<Number> list) {
            a aVarE = e(str);
            return (aVarE == null || aVarE.d().isEmpty()) ? list : aVarE.d();
        }

        public Boolean c(String str, boolean z15) {
            a aVarE = e(str);
            if (aVarE != null && !aVarE.d().isEmpty()) {
                z15 = aVarE.e(0, Boolean.valueOf(z15)).booleanValue();
            }
            return Boolean.valueOf(z15);
        }

        public List<Number> d(String str, List<Number> list) {
            a aVarE = e(str);
            return (aVarE == null || aVarE.d().isEmpty()) ? list : aVarE.f();
        }

        public a e(String str) {
            return this.f147192a.get(str);
        }

        public Number f(String str, Number number) {
            a aVarE = e(str);
            return (aVarE == null || aVarE.d().isEmpty()) ? number : aVarE.g(0);
        }

        public String toString() {
            return getClass().getName() + "[entries=" + this.f147192a + "]";
        }
    }

    static abstract class e extends oo.b {
        protected e(boolean z15) {
            super(z15);
        }
    }

    private static class f extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected f(int i15) {
            super(true);
            a(0, 0);
            for (int i16 = 1; i16 <= i15; i16++) {
                a(i16, i16);
            }
        }

        public String toString() {
            return getClass().getName();
        }
    }

    private static class g extends e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f147195g;

        protected g(boolean z15) {
            super(z15);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f147195g + "]";
        }
    }

    private static class h extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f147196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f147197f;

        private h() {
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f147196e + ", nCodes=" + this.f147197f + ", supplement=" + Arrays.toString(((c) this).f147188d) + "]";
        }
    }

    private static class i extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f147198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f147199c;

        @Override // oo.s
        public int a(int i15) {
            int[] iArr = this.f147199c;
            if (i15 < iArr.length) {
                return iArr[i15];
            }
            return 0;
        }

        public String toString() {
            return getClass().getName() + "[fds=" + Arrays.toString(this.f147199c) + "]";
        }

        private i(oo.a aVar) {
            super(aVar);
        }
    }

    private static class j extends e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f147200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<p> f147201h;

        protected j(boolean z15) {
            super(z15);
        }

        @Override // oo.b
        public int c(int i15) {
            if (g()) {
                for (p pVar : this.f147201h) {
                    if (pVar.a(i15)) {
                        return pVar.b(i15);
                    }
                }
            }
            return super.c(i15);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f147200g + "]";
        }
    }

    /* JADX INFO: renamed from: oo.k$k, reason: collision with other inner class name */
    private static class C3665k extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f147202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f147203f;

        private C3665k() {
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f147202e + ", nRanges=" + this.f147203f + ", supplement=" + Arrays.toString(((c) this).f147188d) + "]";
        }
    }

    private static class l extends e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f147204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<p> f147205h;

        protected l(boolean z15) {
            super(z15);
        }

        @Override // oo.b
        public int c(int i15) {
            for (p pVar : this.f147205h) {
                if (pVar.a(i15)) {
                    return pVar.b(i15);
                }
            }
            return super.c(i15);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f147204g + "]";
        }
    }

    private static final class m extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f147206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f147207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private o[] f147208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f147209e;

        @Override // oo.s
        public int a(int i15) {
            for (int i16 = 0; i16 < this.f147207c; i16++) {
                if (this.f147208d[i16].f147214a <= i15) {
                    int i17 = i16 + 1;
                    if (i17 >= this.f147207c) {
                        if (this.f147209e > i15) {
                            return this.f147208d[i16].f147215b;
                        }
                        return -1;
                    }
                    if (this.f147208d[i17].f147214a > i15) {
                        return this.f147208d[i16].f147215b;
                    }
                }
            }
            return 0;
        }

        public String toString() {
            return m.class.getName() + "[format=" + this.f147206b + " nbRanges=" + this.f147207c + ", range3=" + Arrays.toString(this.f147208d) + " sentinel=" + this.f147209e + "]";
        }

        private m(oo.a aVar) {
            super(aVar);
        }
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f147210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f147211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f147212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f147213d;

        private n() {
        }

        public String toString() {
            return getClass().getName() + "[major=" + this.f147210a + ", minor=" + this.f147211b + ", hdrSize=" + this.f147212c + ", offSize=" + this.f147213d + "]";
        }
    }

    private static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f147214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f147215b;

        private o() {
        }

        public String toString() {
            return o.class.getName() + "[first=" + this.f147214a + ", fd=" + this.f147215b + "]";
        }
    }

    private static final class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f147216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f147217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f147218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f147219d;

        boolean a(int i15) {
            return i15 >= this.f147218c && i15 <= this.f147219d;
        }

        int b(int i15) {
            if (a(i15)) {
                return this.f147216a + (i15 - this.f147218c);
            }
            return 0;
        }

        public String toString() {
            return p.class.getName() + "[start value=" + this.f147216a + ", end value=" + this.f147217b + ", start mapped-value=" + this.f147218c + ", end mapped-value=" + this.f147219d + "]";
        }

        private p(int i15, int i16, int i17) {
            this.f147216a = i15;
            this.f147217b = i15 + i17;
            this.f147218c = i16;
            this.f147219d = i16 + i17;
        }
    }

    private static oo.j A(oo.c cVar, int i15) {
        return oo.j.c(B(cVar, i15));
    }

    private static oo.j.a B(oo.c cVar, int i15) {
        return i15 == 12 ? new oo.j.a(i15, cVar.k()) : new oo.j.a(i15);
    }

    private Map<String, Object> C(d dVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(17);
        linkedHashMap.put("BlueValues", dVar.d("BlueValues", null));
        linkedHashMap.put("OtherBlues", dVar.d("OtherBlues", null));
        linkedHashMap.put("FamilyBlues", dVar.d("FamilyBlues", null));
        linkedHashMap.put("FamilyOtherBlues", dVar.d("FamilyOtherBlues", null));
        linkedHashMap.put("BlueScale", dVar.f("BlueScale", Double.valueOf(0.039625d)));
        linkedHashMap.put("BlueShift", dVar.f("BlueShift", 7));
        linkedHashMap.put("BlueFuzz", dVar.f("BlueFuzz", 1));
        linkedHashMap.put("StdHW", dVar.f("StdHW", null));
        linkedHashMap.put("StdVW", dVar.f("StdVW", null));
        linkedHashMap.put("StemSnapH", dVar.d("StemSnapH", null));
        linkedHashMap.put("StemSnapV", dVar.d("StemSnapV", null));
        linkedHashMap.put("ForceBold", dVar.c("ForceBold", false));
        linkedHashMap.put("LanguageGroup", dVar.f("LanguageGroup", 0));
        linkedHashMap.put("ExpansionFactor", dVar.f("ExpansionFactor", Double.valueOf(0.06d)));
        linkedHashMap.put("initialRandomSeed", dVar.f("initialRandomSeed", 0));
        linkedHashMap.put("defaultWidthX", dVar.f("defaultWidthX", 0));
        linkedHashMap.put("nominalWidthX", dVar.f("nominalWidthX", 0));
        return linkedHashMap;
    }

    private static Double D(oo.c cVar) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (!z15) {
            int iK = cVar.k();
            int[] iArr = {iK / 16, iK % 16};
            for (int i15 = 0; i15 < 2; i15++) {
                int i16 = iArr[i15];
                switch (i16) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        sb5.append(i16);
                        z16 = false;
                        break;
                    case 10:
                        sb5.append(".");
                        break;
                    case 11:
                        if (z17) {
                            c2.g("PdfBox-Android", "duplicate 'E' ignored after " + ((Object) sb5));
                        } else {
                            sb5.append("E");
                            z16 = true;
                            z17 = true;
                        }
                        break;
                    case 12:
                        if (z17) {
                            c2.g("PdfBox-Android", "duplicate 'E-' ignored after " + ((Object) sb5));
                        } else {
                            sb5.append("E-");
                            z16 = true;
                            z17 = true;
                        }
                        break;
                    case 13:
                        break;
                    case 14:
                        sb5.append("-");
                        break;
                    case 15:
                        z15 = true;
                        break;
                    default:
                        throw new IllegalArgumentException("illegal nibble " + i16);
                }
            }
        }
        if (z16) {
            sb5.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
        }
        if (sb5.length() == 0) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(sb5.toString());
        } catch (NumberFormatException e15) {
            throw new IOException(e15);
        }
    }

    private String E(int i15) throws IOException {
        int i16;
        if (i15 < 0) {
            throw new IOException("Invalid negative index when reading a string");
        }
        if (i15 <= 390) {
            return oo.m.a(i15);
        }
        String[] strArr = this.f147184a;
        if (strArr != null && (i16 = i15 - 391) < strArr.length) {
            return strArr[i16];
        }
        return "SID" + i15;
    }

    private static String[] F(oo.c cVar) throws IOException {
        int[] iArrX = x(cVar);
        if (iArrX == null) {
            return null;
        }
        int length = iArrX.length - 1;
        String[] strArr = new String[length];
        int i15 = 0;
        while (i15 < length) {
            int i16 = i15 + 1;
            int i17 = iArrX[i16] - iArrX[i15];
            if (i17 < 0) {
                throw new IOException("Negative index data length + " + i17 + " at " + i15 + ": offsets[" + i16 + "]=" + iArrX[i16] + ", offsets[" + i15 + "]=" + iArrX[i15]);
            }
            strArr[i15] = new String(cVar.h(i17), uo.b.f199525a);
            i15 = i16;
        }
        return strArr;
    }

    private void G(oo.c cVar, c cVar2) {
        cVar2.f147187c = cVar.o();
        cVar2.f147188d = new c.a[cVar2.f147187c];
        for (int i15 = 0; i15 < cVar2.f147188d.length; i15++) {
            c.a aVar = new c.a();
            aVar.f147189a = cVar.o();
            aVar.f147190b = cVar.r();
            aVar.f147191c = E(aVar.f147190b);
            cVar2.f147188d[i15] = aVar;
            cVar2.e(aVar.f147189a, aVar.f147190b, E(aVar.f147190b));
        }
    }

    private static String H(oo.c cVar) {
        return new String(cVar.h(4), uo.b.f199525a);
    }

    private void a(List<Number> list, List<Number> list2) {
        double dDoubleValue = list.get(0).doubleValue();
        double dDoubleValue2 = list.get(1).doubleValue();
        double dDoubleValue3 = list.get(2).doubleValue();
        double dDoubleValue4 = list.get(3).doubleValue();
        double dDoubleValue5 = list.get(4).doubleValue();
        double dDoubleValue6 = list.get(5).doubleValue();
        double dDoubleValue7 = list2.get(0).doubleValue();
        double dDoubleValue8 = list2.get(1).doubleValue();
        double dDoubleValue9 = list2.get(2).doubleValue();
        double dDoubleValue10 = list2.get(3).doubleValue();
        double dDoubleValue11 = list2.get(4).doubleValue();
        double dDoubleValue12 = list2.get(5).doubleValue();
        list.set(0, Double.valueOf((dDoubleValue * dDoubleValue7) + (dDoubleValue2 * dDoubleValue9)));
        list.set(1, Double.valueOf((dDoubleValue * dDoubleValue8) + (dDoubleValue2 * dDoubleValue4)));
        list.set(2, Double.valueOf((dDoubleValue3 * dDoubleValue7) + (dDoubleValue4 * dDoubleValue9)));
        list.set(3, Double.valueOf((dDoubleValue3 * dDoubleValue8) + (dDoubleValue4 * dDoubleValue10)));
        list.set(4, Double.valueOf((dDoubleValue7 * dDoubleValue5) + (dDoubleValue9 * dDoubleValue6) + dDoubleValue11));
        list.set(5, Double.valueOf((dDoubleValue5 * dDoubleValue8) + (dDoubleValue6 * dDoubleValue10) + dDoubleValue12));
    }

    private oo.c b(oo.c cVar, byte[] bArr) throws IOException {
        short sJ = cVar.j();
        cVar.j();
        cVar.j();
        cVar.j();
        for (int i15 = 0; i15 < sJ; i15++) {
            String strH = H(cVar);
            z(cVar);
            long jZ = z(cVar);
            long jZ2 = z(cVar);
            if ("CFF ".equals(strH)) {
                return new oo.c(Arrays.copyOfRange(bArr, (int) jZ, (int) (jZ + jZ2)));
            }
        }
        throw new IOException("CFF tag not found in this OpenType font.");
    }

    private String c(d dVar, String str) {
        d.a aVarE = dVar.e(str);
        if (aVarE == null || !aVarE.h()) {
            return null;
        }
        return E(aVarE.g(0).intValue());
    }

    private void f(oo.c cVar, d dVar, oo.a aVar, int i15) throws IOException {
        d.a aVarE = dVar.e("FDArray");
        if (aVarE == null || !aVarE.h()) {
            throw new IOException("FDArray is missing for a CIDKeyed Font.");
        }
        cVar.m(aVarE.g(0).intValue());
        byte[][] bArrW = w(cVar);
        if (bArrW == null) {
            throw new IOException("Font dict index is missing for a CIDKeyed Font");
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (byte[] bArr : bArrW) {
            d dVarJ = j(new oo.c(bArr));
            d.a aVarE2 = dVarJ.e(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37085l);
            if (aVarE2 == null || aVarE2.i() < 2) {
                throw new IOException("Font DICT invalid without \"Private\" entry");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put("FontName", c(dVarJ, "FontName"));
            linkedHashMap.put("FontType", dVarJ.f("FontType", 0));
            linkedHashMap.put("FontBBox", dVarJ.b("FontBBox", null));
            linkedHashMap.put("FontMatrix", dVarJ.b("FontMatrix", null));
            linkedList2.add(linkedHashMap);
            int iIntValue = aVarE2.g(1).intValue();
            cVar.m(iIntValue);
            d dVarK = k(cVar, aVarE2.g(0).intValue());
            Map<String, Object> mapC = C(dVarK);
            linkedList.add(mapC);
            Number numberF = dVarK.f("Subrs", 0);
            if (numberF instanceof Integer) {
                Integer num = (Integer) numberF;
                if (num.intValue() > 0) {
                    cVar.m(iIntValue + num.intValue());
                    mapC.put("Subrs", w(cVar));
                }
            }
        }
        d.a aVarE3 = dVar.e("FDSelect");
        if (aVarE3 == null || !aVarE3.h()) {
            throw new IOException("FDSelect is missing or empty");
        }
        cVar.m(aVarE3.g(0).intValue());
        s sVarN = n(cVar, i15, aVar);
        aVar.x(linkedList2);
        aVar.z(linkedList);
        aVar.w(sVarN);
    }

    private oo.h g(oo.c cVar, String str, byte[] bArr) throws IOException {
        oo.h nVar;
        oo.b fVar;
        Double dValueOf = Double.valueOf(0.001d);
        Double dValueOf2 = Double.valueOf(0.0d);
        d dVarJ = j(new oo.c(bArr));
        if (dVarJ.e("SyntheticBase") != null) {
            throw new IOException("Synthetic Fonts are not supported");
        }
        boolean z15 = dVarJ.e("ROS") != null;
        if (z15) {
            oo.a aVar = new oo.a();
            d.a aVarE = dVarJ.e("ROS");
            if (aVarE == null || aVarE.i() < 3) {
                throw new IOException("ROS entry must have 3 elements");
            }
            aVar.A(E(aVarE.g(0).intValue()));
            aVar.y(E(aVarE.g(1).intValue()));
            aVar.B(aVarE.g(2).intValue());
            nVar = aVar;
        } else {
            nVar = new oo.n();
        }
        this.f147186c = str;
        nVar.j(str);
        nVar.a("version", c(dVarJ, "version"));
        nVar.a("Notice", c(dVarJ, "Notice"));
        nVar.a("Copyright", c(dVarJ, "Copyright"));
        nVar.a("FullName", c(dVarJ, "FullName"));
        nVar.a("FamilyName", c(dVarJ, "FamilyName"));
        nVar.a("Weight", c(dVarJ, "Weight"));
        nVar.a("isFixedPitch", dVarJ.c("isFixedPitch", false));
        nVar.a("ItalicAngle", dVarJ.f("ItalicAngle", 0));
        nVar.a("UnderlinePosition", dVarJ.f("UnderlinePosition", -100));
        nVar.a("UnderlineThickness", dVarJ.f("UnderlineThickness", 50));
        nVar.a("PaintType", dVarJ.f("PaintType", 0));
        nVar.a("CharstringType", dVarJ.f("CharstringType", 2));
        nVar.a("FontMatrix", dVarJ.b("FontMatrix", Arrays.asList(dValueOf, dValueOf2, dValueOf2, dValueOf, dValueOf2, dValueOf2)));
        nVar.a("UniqueID", dVarJ.f("UniqueID", null));
        nVar.a("FontBBox", dVarJ.b("FontBBox", Arrays.asList(0, 0, 0, 0)));
        nVar.a("StrokeWidth", dVarJ.f("StrokeWidth", 0));
        nVar.a("XUID", dVarJ.b("XUID", null));
        d.a aVarE2 = dVarJ.e("CharStrings");
        if (aVarE2 == null || !aVarE2.h()) {
            throw new IOException("CharStrings is missing or empty");
        }
        cVar.m(aVarE2.g(0).intValue());
        byte[][] bArrW = w(cVar);
        if (bArrW == null) {
            throw new IOException("CharStringsIndex is missing");
        }
        d.a aVarE3 = dVarJ.e("charset");
        if (aVarE3 == null || !aVarE3.h()) {
            fVar = z15 ? new f(bArrW.length) : oo.i.h();
        } else {
            int iIntValue = aVarE3.g(0).intValue();
            if (!z15 && iIntValue == 0) {
                fVar = oo.i.h();
            } else if (!z15 && iIntValue == 1) {
                fVar = oo.e.h();
            } else if (z15 || iIntValue != 2) {
                cVar.m(iIntValue);
                fVar = i(cVar, bArrW.length, z15);
            } else {
                fVar = oo.g.h();
            }
        }
        nVar.f(fVar);
        nVar.f147174d = bArrW;
        if (!z15) {
            h(cVar, dVarJ, (oo.n) nVar, fVar);
            return nVar;
        }
        oo.a aVar2 = (oo.a) nVar;
        f(cVar, dVarJ, aVar2, bArrW.length);
        List<Map<String, Object>> listL = aVar2.l();
        List<Number> list = (listL.isEmpty() || !listL.get(0).containsKey("FontMatrix")) ? null : (List) listL.get(0).get("FontMatrix");
        List<Number> listB = dVarJ.b("FontMatrix", null);
        if (listB != null) {
            if (list != null) {
                a(listB, list);
            }
            return nVar;
        }
        if (list != null) {
            nVar.a("FontMatrix", list);
            return nVar;
        }
        nVar.a("FontMatrix", dVarJ.b("FontMatrix", Arrays.asList(dValueOf, dValueOf2, dValueOf2, dValueOf, dValueOf2, dValueOf2)));
        return nVar;
    }

    private void h(oo.c cVar, d dVar, oo.n nVar, oo.b bVar) throws IOException {
        oo.d dVarF;
        d.a aVarE = dVar.e("Encoding");
        int iIntValue = (aVarE == null || !aVarE.h()) ? 0 : aVarE.g(0).intValue();
        if (iIntValue == 0) {
            dVarF = oo.l.f();
        } else if (iIntValue != 1) {
            cVar.m(iIntValue);
            dVarF = l(cVar, bVar);
        } else {
            dVarF = oo.f.f();
        }
        nVar.w(dVarF);
        d.a aVarE2 = dVar.e(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37085l);
        if (aVarE2 == null || aVarE2.i() < 2) {
            throw new IOException("Private dictionary entry missing for font " + nVar.f147171a);
        }
        int iIntValue2 = aVarE2.g(1).intValue();
        cVar.m(iIntValue2);
        d dVarK = k(cVar, aVarE2.g(0).intValue());
        for (Map.Entry<String, Object> entry : C(dVarK).entrySet()) {
            nVar.k(entry.getKey(), entry.getValue());
        }
        Number numberF = dVarK.f("Subrs", 0);
        if (numberF instanceof Integer) {
            Integer num = (Integer) numberF;
            if (num.intValue() > 0) {
                cVar.m(iIntValue2 + num.intValue());
                nVar.k("Subrs", w(cVar));
            }
        }
    }

    private oo.b i(oo.c cVar, int i15, boolean z15) throws IOException {
        int iO = cVar.o();
        if (iO == 0) {
            return o(cVar, iO, i15, z15);
        }
        if (iO == 1) {
            return r(cVar, iO, i15, z15);
        }
        if (iO == 2) {
            return t(cVar, iO, i15, z15);
        }
        throw new IOException("Incorrect charset format " + iO);
    }

    private static d j(oo.c cVar) {
        d dVar = new d();
        while (cVar.b()) {
            dVar.a(m(cVar));
        }
        return dVar;
    }

    private static d k(oo.c cVar, int i15) {
        d dVar = new d();
        int iA = cVar.a() + i15;
        while (cVar.a() < iA) {
            dVar.a(m(cVar));
        }
        return dVar;
    }

    private oo.d l(oo.c cVar, oo.b bVar) throws IOException {
        int iO = cVar.o();
        int i15 = iO & CertificateBody.profileType;
        if (i15 == 0) {
            return p(cVar, bVar, iO);
        }
        if (i15 == 1) {
            return s(cVar, bVar, iO);
        }
        throw new IOException("Invalid encoding base format " + i15);
    }

    private static d.a m(oo.c cVar) throws IOException {
        d.a aVar = new d.a();
        while (true) {
            int iK = cVar.k();
            if (iK >= 0 && iK <= 21) {
                aVar.f147194b = A(cVar, iK);
                return aVar;
            }
            if (iK == 28 || iK == 29) {
                aVar.f147193a.add(y(cVar, iK));
            } else if (iK == 30) {
                aVar.f147193a.add(D(cVar));
            } else {
                if (iK < 32 || iK > 254) {
                    throw new IOException("invalid DICT data b0 byte: " + iK);
                }
                aVar.f147193a.add(y(cVar, iK));
            }
        }
    }

    private static s n(oo.c cVar, int i15, oo.a aVar) {
        int iO = cVar.o();
        if (iO == 0) {
            return q(cVar, iO, i15, aVar);
        }
        if (iO == 3) {
            return u(cVar, iO, i15, aVar);
        }
        throw new IllegalArgumentException();
    }

    private g o(oo.c cVar, int i15, int i16, boolean z15) {
        g gVar = new g(z15);
        gVar.f147195g = i15;
        if (z15) {
            gVar.a(0, 0);
        } else {
            gVar.b(0, 0, ".notdef");
        }
        for (int i17 = 1; i17 < i16; i17++) {
            int iR = cVar.r();
            if (z15) {
                gVar.a(i17, iR);
            } else {
                gVar.b(i17, iR, E(iR));
            }
        }
        return gVar;
    }

    private h p(oo.c cVar, oo.b bVar, int i15) {
        h hVar = new h();
        hVar.f147196e = i15;
        hVar.f147197f = cVar.o();
        hVar.e(0, 0, ".notdef");
        for (int i16 = 1; i16 <= hVar.f147197f; i16++) {
            int iO = cVar.o();
            int iF = bVar.f(i16);
            hVar.e(iO, iF, E(iF));
        }
        if ((i15 & 128) != 0) {
            G(cVar, hVar);
        }
        return hVar;
    }

    private static i q(oo.c cVar, int i15, int i16, oo.a aVar) {
        i iVar = new i(aVar);
        iVar.f147198b = i15;
        iVar.f147199c = new int[i16];
        for (int i17 = 0; i17 < iVar.f147199c.length; i17++) {
            iVar.f147199c[i17] = cVar.o();
        }
        return iVar;
    }

    private j r(oo.c cVar, int i15, int i16, boolean z15) {
        j jVar = new j(z15);
        jVar.f147200g = i15;
        if (z15) {
            jVar.a(0, 0);
            jVar.f147201h = new ArrayList();
        } else {
            jVar.b(0, 0, ".notdef");
        }
        int i17 = 1;
        while (i17 < i16) {
            int iR = cVar.r();
            int iO = cVar.o();
            if (z15) {
                jVar.f147201h.add(new p(i17, iR, iO));
            } else {
                for (int i18 = 0; i18 < iO + 1; i18++) {
                    int i19 = iR + i18;
                    jVar.b(i17 + i18, i19, E(i19));
                }
            }
            i17 = i17 + iO + 1;
        }
        return jVar;
    }

    private C3665k s(oo.c cVar, oo.b bVar, int i15) {
        C3665k c3665k = new C3665k();
        c3665k.f147202e = i15;
        c3665k.f147203f = cVar.o();
        c3665k.e(0, 0, ".notdef");
        int i16 = 1;
        for (int i17 = 0; i17 < c3665k.f147203f; i17++) {
            int iO = cVar.o();
            int iO2 = cVar.o();
            for (int i18 = 0; i18 <= iO2; i18++) {
                int iF = bVar.f(i16);
                c3665k.e(iO + i18, iF, E(iF));
                i16++;
            }
        }
        if ((i15 & 128) != 0) {
            G(cVar, c3665k);
        }
        return c3665k;
    }

    private l t(oo.c cVar, int i15, int i16, boolean z15) {
        l lVar = new l(z15);
        lVar.f147204g = i15;
        if (z15) {
            lVar.a(0, 0);
            lVar.f147205h = new ArrayList();
        } else {
            lVar.b(0, 0, ".notdef");
        }
        int i17 = 1;
        while (i17 < i16) {
            int iR = cVar.r();
            int iN = cVar.n();
            if (z15) {
                lVar.f147205h.add(new p(i17, iR, iN));
            } else {
                for (int i18 = 0; i18 < iN + 1; i18++) {
                    int i19 = iR + i18;
                    lVar.b(i17 + i18, i19, E(i19));
                }
            }
            i17 = i17 + iN + 1;
        }
        return lVar;
    }

    private static m u(oo.c cVar, int i15, int i16, oo.a aVar) {
        m mVar = new m(aVar);
        mVar.f147206b = i15;
        mVar.f147207c = cVar.n();
        mVar.f147208d = new o[mVar.f147207c];
        for (int i17 = 0; i17 < mVar.f147207c; i17++) {
            o oVar = new o();
            oVar.f147214a = cVar.n();
            oVar.f147215b = cVar.o();
            mVar.f147208d[i17] = oVar;
        }
        mVar.f147209e = cVar.n();
        return mVar;
    }

    private static n v(oo.c cVar) {
        n nVar = new n();
        nVar.f147210a = cVar.o();
        nVar.f147211b = cVar.o();
        nVar.f147212c = cVar.o();
        nVar.f147213d = cVar.p();
        return nVar;
    }

    private static byte[][] w(oo.c cVar) throws IOException {
        int[] iArrX = x(cVar);
        if (iArrX == null) {
            return null;
        }
        int length = iArrX.length - 1;
        byte[][] bArr = new byte[length][];
        int i15 = 0;
        while (i15 < length) {
            int i16 = i15 + 1;
            bArr[i15] = cVar.h(iArrX[i16] - iArrX[i15]);
            i15 = i16;
        }
        return bArr;
    }

    private static int[] x(oo.c cVar) throws IOException {
        int iN = cVar.n();
        if (iN == 0) {
            return null;
        }
        int iP = cVar.p();
        int[] iArr = new int[iN + 1];
        for (int i15 = 0; i15 <= iN; i15++) {
            int iQ = cVar.q(iP);
            if (iQ > cVar.c()) {
                throw new IOException("illegal offset value " + iQ + " in CFF font");
            }
            iArr[i15] = iQ;
        }
        return iArr;
    }

    private static Integer y(oo.c cVar, int i15) {
        if (i15 == 28) {
            return Integer.valueOf(cVar.j());
        }
        if (i15 == 29) {
            return Integer.valueOf(cVar.i());
        }
        if (i15 >= 32 && i15 <= 246) {
            return Integer.valueOf(i15 - 139);
        }
        if (i15 >= 247 && i15 <= 250) {
            return Integer.valueOf(((i15 - 247) * 256) + cVar.k() + 108);
        }
        if (i15 < 251 || i15 > 254) {
            throw new IllegalArgumentException();
        }
        return Integer.valueOf((((-(i15 - 251)) * 256) - cVar.k()) - 108);
    }

    private static long z(oo.c cVar) {
        return cVar.n() | (cVar.n() << 16);
    }

    public List<oo.h> d(byte[] bArr) throws IOException {
        oo.c cVar = new oo.c(bArr);
        String strH = H(cVar);
        if ("OTTO".equals(strH)) {
            cVar = b(cVar, bArr);
        } else {
            if ("ttcf".equals(strH)) {
                throw new IOException("True Type Collection fonts are not supported.");
            }
            if ("\u0000\u0001\u0000\u0000".equals(strH)) {
                throw new IOException("OpenType fonts containing a true type font are not supported.");
            }
            cVar.m(0);
        }
        v(cVar);
        String[] strArrF = F(cVar);
        if (strArrF == null) {
            throw new IOException("Name index missing in CFF font");
        }
        byte[][] bArrW = w(cVar);
        this.f147184a = F(cVar);
        byte[][] bArrW2 = w(cVar);
        ArrayList arrayList = new ArrayList(strArrF.length);
        for (int i15 = 0; i15 < strArrF.length; i15++) {
            oo.h hVarG = g(cVar, strArrF[i15], bArrW[i15]);
            hVarG.i(bArrW2);
            hVarG.g(this.f147185b);
            arrayList.add(hVarG);
        }
        return arrayList;
    }

    public List<oo.h> e(byte[] bArr, b bVar) {
        this.f147185b = bVar;
        return d(bArr);
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f147186c + "]";
    }
}
