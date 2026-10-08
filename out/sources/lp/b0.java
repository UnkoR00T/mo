package lp;

import android.graphics.Path;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b0 extends y {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, Float> f119049n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Float f119050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private xp.d f119051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final wo.a f119052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final oo.n f119053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final mo.b f119054t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f119055v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f119056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private uo.a f119057x;

    private class b implements oo.k.b {
        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    public b0(bp.d dVar) throws Throwable {
        byte[] bArrF;
        boolean z15;
        hp.h hVarJ;
        super(dVar);
        this.f119049n = new HashMap();
        a aVar = 0;
        oo.n nVar = 0;
        this.f119050p = null;
        s sVarJ = j();
        if (sVarJ == null || (hVarJ = sVarJ.j()) == null) {
            bArrF = null;
        } else {
            bArrF = hVarJ.f();
            if (bArrF.length == 0) {
                c2.e("PdfBox-Android", "Invalid data for embedded Type1C font " + getName());
                bArrF = null;
            }
        }
        if (bArrF != null) {
            try {
                oo.h hVar = new oo.k().e(bArrF, new b()).get(0);
                if (hVar instanceof oo.n) {
                    aVar = (oo.n) hVar;
                    z15 = false;
                    nVar = aVar;
                } else {
                    c2.e("PdfBox-Android", "Expected CFFType1Font, got " + hVar.getClass().getSimpleName());
                    z15 = true;
                }
            } catch (IOException e15) {
                c2.f("PdfBox-Android", "Can't read the embedded Type1C font " + getName(), e15);
            }
        } else {
            z15 = false;
            nVar = aVar;
        }
        this.f119056w = z15;
        this.f119053s = nVar;
        if (nVar != 0) {
            this.f119054t = nVar;
            this.f119055v = true;
        } else {
            k<mo.b> kVarB = j.a().b(J(), sVarJ);
            mo.b bVarA = kVarB.a();
            this.f119054t = bVarA;
            if (kVarB.b()) {
                c2.g("PdfBox-Android", "Using fallback font " + bVarA.getName() + " for " + J());
            }
            this.f119055v = false;
        }
        F();
        wo.a aVarC = b().c();
        this.f119052r = aVarC;
        aVarC.w(1000.0d, 1000.0d);
    }

    private uo.a I() {
        hp.g gVarF;
        return (j() == null || (gVarF = j().f()) == null || (gVarF.d() == 0.0f && gVarF.e() == 0.0f && gVarF.f() == 0.0f && gVarF.g() == 0.0f)) ? this.f119054t.h() : new uo.a(gVarF.d(), gVarF.e(), gVarF.f(), gVarF.g());
    }

    private String K(String str) {
        if (e() || this.f119054t.m(str)) {
            return str;
        }
        String strF = A().f(str);
        if (strF != null && strF.length() == 1) {
            String strA = k0.a(strF.codePointAt(0));
            if (this.f119054t.m(strA)) {
                return strA;
            }
        }
        return ".notdef";
    }

    @Override // lp.y
    public Path B(String str) {
        if (str.equals(".notdef") && !e() && !q()) {
            return new Path();
        }
        if ("sfthyphen".equals(str)) {
            return this.f119054t.r("hyphen");
        }
        if ("nbspace".equals(str)) {
            return !L("space") ? new Path() : this.f119054t.r("space");
        }
        return this.f119054t.r(str);
    }

    @Override // lp.y
    protected mp.c G() {
        if (!e() && k() != null) {
            return new mp.j(k());
        }
        mo.b bVar = this.f119054t;
        return bVar instanceof mo.a ? mp.j.i(((mo.a) bVar).c()) : mp.h.f127354d;
    }

    public String H(int i15) {
        return z().f(i15);
    }

    public final String J() {
        return this.f119160a.H4(bp.i.f20897v0);
    }

    public boolean L(String str) {
        return this.f119054t.m(str);
    }

    @Override // lp.r, lp.u
    public final xp.d b() {
        List<Number> listB;
        if (this.f119051q == null) {
            try {
                listB = this.f119054t.b();
            } catch (IOException unused) {
                this.f119051q = r.f119159h;
                listB = null;
            }
            if (listB == null || listB.size() != 6) {
                return super.b();
            }
            this.f119051q = new xp.d(listB.get(0).floatValue(), listB.get(1).floatValue(), listB.get(2).floatValue(), listB.get(3).floatValue(), listB.get(4).floatValue(), listB.get(5).floatValue());
        }
        return this.f119051q;
    }

    @Override // lp.u
    public uo.a c() {
        if (this.f119057x == null) {
            this.f119057x = I();
        }
        return this.f119057x;
    }

    @Override // lp.u
    public float d(int i15) {
        float[] fArr = {this.f119054t.p(K(H(i15))), 0.0f};
        this.f119052r.H(fArr, 0, fArr, 0, 1);
        return fArr[0];
    }

    @Override // lp.u
    public boolean e() {
        return this.f119055v;
    }

    @Override // lp.r
    protected byte[] g(int i15) {
        String strA = A().a(i15);
        if (!this.f119173j.b(strA)) {
            throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in this font's encoding: %s", Integer.valueOf(i15), strA, this.f119173j.d()));
        }
        String strK = K(strA);
        Map<String, Integer> mapG = this.f119173j.g();
        if (strK.equals(".notdef") || !this.f119054t.m(strK)) {
            throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i15), getName()));
        }
        return new byte[]{(byte) mapG.get(strA).intValue()};
    }

    @Override // lp.u
    public final String getName() {
        return J();
    }

    @Override // lp.r
    public float m(String str) {
        float fE = 0.0f;
        if (this.f119053s == null) {
            c2.g("PdfBox-Android", "No embedded CFF font, returning 0");
            return 0.0f;
        }
        for (int i15 = 0; i15 < str.length(); i15++) {
            fE += this.f119053s.t(A().a(str.codePointAt(i15))).e();
        }
        return fE;
    }

    @Override // lp.r
    public int u(InputStream inputStream) {
        return inputStream.read();
    }
}
