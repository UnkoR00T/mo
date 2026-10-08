package lp;

import android.graphics.Path;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import so.n0;

/* JADX INFO: loaded from: classes4.dex */
public class z extends y implements g0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Map<String, Integer> f119177y = new HashMap(250);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private so.d f119178n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private so.d f119179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private so.d f119180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f119181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<Integer, Integer> f119182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n0 f119183t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f119184v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f119185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private uo.a f119186x;

    static {
        for (Map.Entry<Integer, String> entry : mp.f.f127350f.c().entrySet()) {
            Map<String, Integer> map = f119177y;
            if (!map.containsKey(entry.getValue())) {
                map.put(entry.getValue(), entry.getKey());
            }
        }
    }

    public z(bp.d dVar) {
        boolean z15;
        hp.h hVarI;
        bp.g gVarA;
        super(dVar);
        n0 n0VarD = null;
        this.f119178n = null;
        this.f119179p = null;
        this.f119180q = null;
        this.f119181r = false;
        if (j() != null && (hVarI = super.j().i()) != null) {
            try {
                so.j0 j0Var = new so.j0(true);
                gVarA = hVarI.a();
                try {
                    n0VarD = j0Var.d(gVarA);
                } catch (IOException e15) {
                    e = e15;
                    c2.h("PdfBox-Android", "Could not read embedded TTF for font " + K(), e);
                    dp.a.b(gVarA);
                    z15 = true;
                }
            } catch (IOException e16) {
                e = e16;
                gVarA = null;
            }
        }
        z15 = false;
        this.f119184v = n0VarD != null;
        this.f119185w = z15;
        if (n0VarD == null) {
            k<n0> kVarA = j.a().a(K(), j());
            n0 n0Var = (n0) kVarA.a();
            if (kVarA.b()) {
                c2.g("PdfBox-Android", "Using fallback font '" + n0Var + "' for '" + K() + "'");
            }
            n0VarD = n0Var;
        }
        this.f119183t = n0VarD;
        F();
    }

    private void I() {
        if (this.f119181r) {
            return;
        }
        so.e eVarH = this.f119183t.H();
        if (eVarH != null) {
            for (so.d dVar : eVarH.j()) {
                if (3 == dVar.f()) {
                    if (1 == dVar.e()) {
                        this.f119178n = dVar;
                    } else if (dVar.e() == 0) {
                        this.f119179p = dVar;
                    }
                } else if (1 == dVar.f() && dVar.e() == 0) {
                    this.f119180q = dVar;
                } else if (dVar.f() == 0 && dVar.e() == 0) {
                    this.f119178n = dVar;
                } else if (dVar.f() == 0 && 3 == dVar.e()) {
                    this.f119178n = dVar;
                }
            }
        }
        this.f119181r = true;
    }

    private uo.a J() {
        hp.g gVarF;
        return (j() == null || (gVarF = j().f()) == null) ? this.f119183t.h() : new uo.a(gVarF.d(), gVarF.e(), gVarF.f(), gVarF.g());
    }

    @Override // lp.y
    public Path B(String str) {
        so.k kVarJ;
        int iX1 = this.f119183t.x1(str);
        if (iX1 == 0) {
            iX1 = 0;
            try {
                int i15 = Integer.parseInt(str);
                if (i15 <= this.f119183t.Z()) {
                    iX1 = i15;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (iX1 != 0 && (kVarJ = this.f119183t.I().j(iX1)) != null) {
            return kVarJ.b();
        }
        return new Path();
    }

    @Override // lp.y
    protected mp.c G() {
        if (!e() && k() != null) {
            return new mp.j(k());
        }
        if (C() != null && !C().booleanValue()) {
            return mp.h.f127354d;
        }
        String strC = h0.c(getName());
        if (q() && !strC.equals("Symbol") && !strC.equals("ZapfDingbats")) {
            return mp.h.f127354d;
        }
        so.e0 e0VarD0 = this.f119183t.d0();
        HashMap map = new HashMap();
        for (int i15 = 0; i15 <= 256; i15++) {
            int iH = H(i15);
            if (iH > 0) {
                String strQ = e0VarD0 != null ? e0VarD0.q(iH) : null;
                if (strQ == null) {
                    strQ = Integer.toString(iH);
                }
                map.put(Integer.valueOf(i15), strQ);
            }
        }
        return new mp.a(map);
    }

    public int H(int i15) {
        so.d dVar;
        Integer num;
        String strF;
        I();
        int iB = 0;
        if (!E()) {
            String strF2 = this.f119173j.f(i15);
            if (".notdef".equals(strF2)) {
                return 0;
            }
            if (this.f119178n != null && (strF = mp.d.b().f(strF2)) != null) {
                iB = this.f119178n.b(strF.codePointAt(0));
            }
            if (iB == 0 && this.f119180q != null && (num = f119177y.get(strF2)) != null) {
                iB = this.f119180q.b(num.intValue());
            }
            return iB == 0 ? this.f119183t.x1(strF2) : iB;
        }
        so.d dVar2 = this.f119178n;
        if (dVar2 != null) {
            mp.c cVar = this.f119173j;
            if ((cVar instanceof mp.k) || (cVar instanceof mp.g)) {
                String strF3 = cVar.f(i15);
                if (".notdef".equals(strF3)) {
                    return 0;
                }
                String strF4 = mp.d.b().f(strF3);
                if (strF4 != null) {
                    iB = this.f119178n.b(strF4.codePointAt(0));
                }
            } else {
                iB = dVar2.b(i15);
            }
        }
        so.d dVar3 = this.f119179p;
        if (dVar3 != null) {
            iB = dVar3.b(i15);
            if (i15 >= 0 && i15 <= 255) {
                if (iB == 0) {
                    iB = this.f119179p.b(61440 + i15);
                }
                if (iB == 0) {
                    iB = this.f119179p.b(61696 + i15);
                }
                if (iB == 0) {
                    iB = this.f119179p.b(61952 + i15);
                }
            }
        }
        return (iB != 0 || (dVar = this.f119180q) == null) ? iB : dVar.b(i15);
    }

    public final String K() {
        return this.f119160a.H4(bp.i.f20897v0);
    }

    protected Map<Integer, Integer> L() {
        Map<Integer, Integer> map = this.f119182s;
        if (map != null) {
            return map;
        }
        this.f119182s = new HashMap();
        for (int i15 = 0; i15 <= 255; i15++) {
            int iH = H(i15);
            if (!this.f119182s.containsKey(Integer.valueOf(iH))) {
                this.f119182s.put(Integer.valueOf(iH), Integer.valueOf(i15));
            }
        }
        return this.f119182s;
    }

    @Override // lp.g0
    public Path a(int i15) {
        so.k kVarJ = this.f119183t.I().j(H(i15));
        return kVarJ == null ? new Path() : kVarJ.b();
    }

    @Override // lp.u
    public uo.a c() {
        if (this.f119186x == null) {
            this.f119186x = J();
        }
        return this.f119186x;
    }

    @Override // lp.u
    public float d(int i15) {
        float fE = this.f119183t.E(H(i15));
        float fI1 = this.f119183t.i1();
        return fI1 != 1000.0f ? fE * (1000.0f / fI1) : fE;
    }

    @Override // lp.u
    public boolean e() {
        return this.f119184v;
    }

    @Override // lp.r
    protected byte[] g(int i15) {
        mp.c cVar = this.f119173j;
        if (cVar == null) {
            String strA = A().a(i15);
            if (!this.f119183t.m(strA)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i15), getName()));
            }
            Integer num = L().get(Integer.valueOf(this.f119183t.x1(strA)));
            if (num != null) {
                return new byte[]{(byte) num.intValue()};
            }
            throw new IllegalArgumentException(String.format("U+%04X is not available in this font's Encoding", Integer.valueOf(i15)));
        }
        if (!cVar.b(A().a(i15))) {
            throw new IllegalArgumentException(String.format("U+%04X is not available in this font's encoding: %s", Integer.valueOf(i15), this.f119173j.d()));
        }
        String strA2 = A().a(i15);
        Map<String, Integer> mapG = this.f119173j.g();
        if (this.f119183t.m(strA2) || this.f119183t.m(k0.a(i15))) {
            return new byte[]{(byte) mapG.get(strA2).intValue()};
        }
        throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i15), getName()));
    }

    @Override // lp.u
    public String getName() {
        return K();
    }

    @Override // lp.r
    public int u(InputStream inputStream) {
        return inputStream.read();
    }
}
