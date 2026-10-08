package lp;

import android.graphics.Path;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class c0 extends y {
    public static final c0 A;
    public static final c0 B;
    public static final c0 C;
    public static final c0 D;
    public static final c0 E;
    public static final c0 F;
    public static final c0 G;
    public static final c0 H;
    public static final c0 I;
    public static final c0 K;
    public static final c0 L;
    public static final c0 O;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map<String, String> f119060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c0 f119061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c0 f119062z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final to.d f119063n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final mo.b f119064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f119065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f119066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private xp.d f119067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final wo.a f119068t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private uo.a f119069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Map<Integer, byte[]> f119070w;

    static {
        HashMap map = new HashMap();
        f119060x = map;
        map.put("ff", "f_f");
        map.put("ffi", "f_f_i");
        map.put("ffl", "f_f_l");
        map.put("fi", "f_i");
        map.put("fl", "f_l");
        map.put("st", "s_t");
        map.put("IJ", "I_J");
        map.put("ij", "i_j");
        map.put("ellipsis", "elipsis");
        f119061y = new c0("Times-Roman");
        f119062z = new c0("Times-Bold");
        A = new c0("Times-Italic");
        B = new c0("Times-BoldItalic");
        C = new c0("Helvetica");
        D = new c0("Helvetica-Bold");
        E = new c0("Helvetica-Oblique");
        F = new c0("Helvetica-BoldOblique");
        G = new c0("Courier");
        H = new c0("Courier-Bold");
        I = new c0("Courier-Oblique");
        K = new c0("Courier-BoldOblique");
        L = new c0("Symbol");
        O = new c0("ZapfDingbats");
    }

    private c0(String str) {
        String name;
        super(str);
        this.f119160a.Y4(bp.i.f20938y8, bp.i.f20752g9);
        this.f119160a.d5(bp.i.f20897v0, str);
        if ("ZapfDingbats".equals(str)) {
            this.f119173j = mp.l.f127360d;
        } else if ("Symbol".equals(str)) {
            this.f119173j = mp.i.f127356d;
        } else {
            this.f119173j = mp.k.f127358d;
            this.f119160a.Y4(bp.i.f20716d3, bp.i.J9);
        }
        this.f119070w = new ConcurrentHashMap();
        this.f119063n = null;
        k<mo.b> kVarB = j.a().b(K(), j());
        mo.b bVarA = kVarB.a();
        this.f119064p = bVarA;
        if (kVarB.b()) {
            try {
                name = bVarA.getName();
            } catch (IOException unused) {
                name = "?";
            }
            c2.g("PdfBox-Android", "Using fallback font " + name + " for base font " + K());
        }
        this.f119065q = false;
        this.f119066r = false;
        this.f119068t = new wo.a();
    }

    private static int I(byte[] bArr, int i15) {
        byte b15;
        while (i15 > 0) {
            if (bArr[i15] == 101 && bArr[i15 + 1] == 120 && bArr[i15 + 2] == 101 && bArr[i15 + 3] == 99) {
                int i16 = i15 + 4;
                while (i16 < bArr.length && ((b15 = bArr[i16]) == 13 || b15 == 10 || b15 == 32 || b15 == 9)) {
                    i16++;
                }
                return i16;
            }
            i15--;
        }
        return i15;
    }

    private uo.a J() {
        hp.g gVarF;
        return (j() == null || (gVarF = j().f()) == null || (gVarF.d() == 0.0f && gVarF.e() == 0.0f && gVarF.f() == 0.0f && gVarF.g() == 0.0f)) ? this.f119064p.h() : new uo.a(gVarF.d(), gVarF.e(), gVarF.f(), gVarF.g());
    }

    private String L(String str) {
        Integer num;
        if (e() || this.f119064p.m(str)) {
            return str;
        }
        String str2 = f119060x.get(str);
        if (str2 != null && !str.equals(".notdef") && this.f119064p.m(str2)) {
            return str2;
        }
        String strF = A().f(str);
        if (strF != null && strF.length() == 1) {
            String strA = k0.a(strF.codePointAt(0));
            if (this.f119064p.m(strA)) {
                return strA;
            }
            if ("SymbolMT".equals(this.f119064p.getName()) && (num = mp.i.f127356d.g().get(str)) != null) {
                String strA2 = k0.a(num.intValue() + 61440);
                if (this.f119064p.m(strA2)) {
                    return strA2;
                }
            }
        }
        return ".notdef";
    }

    private int M(byte[] bArr, int i15) {
        int iMax = Math.max(0, i15 - 4);
        if (iMax <= 0 || iMax > bArr.length - 4) {
            iMax = bArr.length - 4;
        }
        int I2 = I(bArr, iMax);
        if (I2 == 0 && i15 > 0) {
            I2 = I(bArr, bArr.length - 4);
        }
        if (i15 - I2 == 0 || I2 <= 0) {
            return i15;
        }
        c2.g("PdfBox-Android", "Ignored invalid Length1 " + i15 + " for Type 1 font " + getName());
        return I2;
    }

    private int N(byte[] bArr, int i15, int i16) {
        if (i16 >= 0 && i16 <= bArr.length - i15) {
            return i16;
        }
        c2.g("PdfBox-Android", "Ignored invalid Length2 " + i16 + " for Type 1 font " + getName());
        return bArr.length - i15;
    }

    @Override // lp.y
    public Path B(String str) {
        return (!str.equals(".notdef") || this.f119065q) ? this.f119064p.r(L(str)) : new Path();
    }

    @Override // lp.y
    protected mp.c G() {
        if (!e() && k() != null) {
            return new mp.j(k());
        }
        mo.b bVar = this.f119064p;
        return bVar instanceof mo.a ? mp.j.i(((mo.a) bVar).c()) : mp.h.f127354d;
    }

    public String H(int i15) {
        return L(z() != null ? z().f(i15) : ".notdef");
    }

    public final String K() {
        return this.f119160a.H4(bp.i.f20897v0);
    }

    @Override // lp.r, lp.u
    public final xp.d b() {
        List<Number> listB;
        if (this.f119067s == null) {
            try {
                listB = this.f119064p.b();
            } catch (IOException unused) {
                this.f119067s = r.f119159h;
                listB = null;
            }
            if (listB == null || listB.size() != 6) {
                return super.b();
            }
            this.f119067s = new xp.d(listB.get(0).floatValue(), listB.get(1).floatValue(), listB.get(2).floatValue(), listB.get(3).floatValue(), listB.get(4).floatValue(), listB.get(5).floatValue());
        }
        return this.f119067s;
    }

    @Override // lp.u
    public uo.a c() {
        if (this.f119069v == null) {
            this.f119069v = J();
        }
        return this.f119069v;
    }

    @Override // lp.u
    public float d(int i15) {
        String strH = H(i15);
        if (!this.f119065q && ".notdef".equals(strH)) {
            return 250.0f;
        }
        float[] fArr = {this.f119064p.p(strH), 0.0f};
        this.f119068t.H(fArr, 0, fArr, 0, 1);
        return fArr[0];
    }

    @Override // lp.u
    public boolean e() {
        return this.f119065q;
    }

    @Override // lp.r
    protected byte[] g(int i15) {
        byte[] bArr = this.f119070w.get(Integer.valueOf(i15));
        if (bArr != null) {
            return bArr;
        }
        String strA = A().a(i15);
        if (q()) {
            if (!this.f119173j.b(strA)) {
                throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s, encoding: %s", Integer.valueOf(i15), strA, getName(), this.f119173j.d()));
            }
            if (".notdef".equals(strA)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in the font %s", Integer.valueOf(i15), getName()));
            }
        } else {
            if (!this.f119173j.b(strA)) {
                throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s (generic: %s), encoding: %s", Integer.valueOf(i15), strA, getName(), this.f119064p.getName(), this.f119173j.d()));
            }
            String strL = L(strA);
            if (strL.equals(".notdef") || !this.f119064p.m(strL)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in the font %s (generic: %s)", Integer.valueOf(i15), getName(), this.f119064p.getName()));
            }
        }
        int iIntValue = this.f119173j.g().get(strA).intValue();
        if (iIntValue < 0) {
            throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s (generic: %s), encoding: %s", Integer.valueOf(i15), strA, getName(), this.f119064p.getName(), this.f119173j.d()));
        }
        byte[] bArr2 = {(byte) iIntValue};
        this.f119070w.put(Integer.valueOf(i15), bArr2);
        return bArr2;
    }

    @Override // lp.u
    public String getName() {
        return K();
    }

    @Override // lp.r
    public int u(InputStream inputStream) {
        return inputStream.read();
    }

    public c0(bp.d dVar) throws Throwable {
        boolean z15;
        int i15;
        super(dVar);
        this.f119070w = new HashMap();
        s sVarJ = j();
        to.d dVarF = null;
        if (sVarJ == null) {
            z15 = false;
        } else {
            if (sVarJ.j() != null) {
                c2.g("PdfBox-Android", "/FontFile3 for Type1 font not supported");
            }
            hp.h hVarH = sVarJ.h();
            if (hVarH != null) {
                try {
                    bp.o oVarD1 = hVarH.D1();
                    int iX4 = oVarD1.x4(bp.i.f20708c5);
                    int iX5 = oVarD1.x4(bp.i.f20718d5);
                    byte[] bArrF = hVarH.f();
                    if (bArrF.length != 0) {
                        int iM = M(bArrF, iX4);
                        int iN = N(bArrF, iM, iX5);
                        if ((bArrF[0] & 255) == 128) {
                            dVarF = to.d.e(bArrF);
                        } else if (iM >= 0 && iM <= (i15 = iM + iN)) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrF, 0, iM);
                            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrF, iM, i15);
                            if (iM > 0 && iN > 0) {
                                dVarF = to.d.f(bArrCopyOfRange, bArrCopyOfRange2);
                            }
                        } else {
                            throw new IOException("Invalid length data, actual length: " + bArrF.length + ", /Length1: " + iM + ", /Length2: " + iN);
                        }
                    } else {
                        throw new IOException("Font data unavailable");
                    }
                } catch (to.a unused) {
                    c2.g("PdfBox-Android", "Can't read damaged embedded Type1 font " + sVarJ.k());
                    z15 = true;
                } catch (IOException e15) {
                    c2.f("PdfBox-Android", "Can't read the embedded Type1 font " + sVarJ.k(), e15);
                    z15 = true;
                }
            }
            z15 = false;
        }
        this.f119065q = dVarF != null;
        this.f119066r = z15;
        this.f119063n = dVarF;
        if (dVarF != null) {
            this.f119064p = dVarF;
        } else {
            k<mo.b> kVarB = j.a().b(K(), sVarJ);
            mo.b bVarA = kVarB.a();
            this.f119064p = bVarA;
            if (kVarB.b()) {
                c2.g("PdfBox-Android", "Using fallback font " + bVarA.getName() + " for " + K());
            }
        }
        F();
        wo.a aVarC = b().c();
        this.f119068t = aVarC;
        aVarC.w(1000.0d, 1000.0d);
    }
}
