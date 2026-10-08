package lp;

import android.graphics.Path;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import so.n0;

/* JADX INFO: loaded from: classes4.dex */
public class o extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n0 f119140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f119141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f119142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f119143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final so.c f119144n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private xp.d f119145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private uo.a f119146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Set<Integer> f119147r;

    public o(bp.d dVar, a0 a0Var) {
        this(dVar, a0Var, null);
    }

    private n0 s() {
        a aVarC = j.a().c(i(), m(), j());
        so.c0 c0VarA = aVarC.d() ? aVarC.a() : (n0) aVarC.c();
        if (aVarC.b()) {
            c2.g("PdfBox-Android", "Using fallback font " + c0VarA.getName() + " for CID-keyed TrueType font " + i());
        }
        return c0VarA;
    }

    private uo.a t() {
        hp.g gVarF;
        return (m() == null || (gVarF = m().f()) == null || (Float.compare(gVarF.d(), 0.0f) == 0 && Float.compare(gVarF.e(), 0.0f) == 0 && Float.compare(gVarF.f(), 0.0f) == 0 && Float.compare(gVarF.g(), 0.0f) == 0)) ? this.f119140j.h() : new uo.a(gVarF.d(), gVarF.e(), gVarF.f(), gVarF.g());
    }

    @Override // lp.g0
    public Path a(int i15) {
        n0 n0Var = this.f119140j;
        if ((n0Var instanceof so.c0) && ((so.c0) n0Var).Q1()) {
            return ((so.c0) this.f119140j).P1().j().e(g(i15)).d();
        }
        so.k kVarJ = this.f119140j.I().j(g(i15));
        return kVarJ != null ? kVarJ.b() : new Path();
    }

    @Override // lp.u
    public xp.d b() {
        if (this.f119145p == null) {
            this.f119145p = new xp.d(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        }
        return this.f119145p;
    }

    @Override // lp.u
    public uo.a c() {
        if (this.f119146q == null) {
            this.f119146q = t();
        }
        return this.f119146q;
    }

    @Override // lp.u
    public float d(int i15) {
        float fE = this.f119140j.E(g(i15));
        int iI1 = this.f119140j.i1();
        return iI1 != 1000 ? fE * (1000.0f / iI1) : fE;
    }

    @Override // lp.u
    public boolean e() {
        return this.f119142l;
    }

    @Override // lp.m
    public int f(int i15) {
        String strV;
        po.b bVarB = this.f119121a.B();
        return (bVarB.j() || !bVarB.k() || (strV = bVarB.v(i15)) == null) ? bVarB.t(i15) : strV.codePointAt(0);
    }

    @Override // lp.m
    public int g(int i15) {
        if (this.f119142l) {
            int iF = f(i15);
            int[] iArr = this.f119141k;
            if (iArr != null) {
                if (iF < iArr.length) {
                    return iArr[iF];
                }
                return 0;
            }
            if (iF < this.f119140j.Z()) {
                return iF;
            }
            return 0;
        }
        if (this.f119141k != null && !this.f119143m) {
            c2.g("PdfBox-Android", "Using non-embedded GIDs in font " + getName());
            int iF2 = f(i15);
            int[] iArr2 = this.f119141k;
            if (iF2 < iArr2.length) {
                return iArr2[iF2];
            }
            return 0;
        }
        String strW = this.f119121a.w(i15);
        if (strW != null) {
            if (strW.length() > 1) {
                c2.g("PdfBox-Android", "Trying to map multi-byte character using 'cmap', result will be poor");
            }
            return this.f119144n.b(strW.codePointAt(0));
        }
        if (!this.f119147r.contains(Integer.valueOf(i15))) {
            this.f119147r.add(Integer.valueOf(i15));
            c2.g("PdfBox-Android", "Failed to find a character mapping for " + i15 + " in " + getName());
        }
        return f(i15);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    @Override // lp.m
    public byte[] h(int i15) {
        int iB;
        byte[] bArrF;
        if (this.f119142l) {
            if (this.f119121a.B().g().startsWith("Identity-")) {
                so.c cVar = this.f119144n;
                if (cVar != null) {
                    iB = cVar.b(i15);
                } else {
                    iB = -1;
                }
            } else if (this.f119121a.C() != null) {
                iB = this.f119121a.C().t(i15);
            } else {
                iB = -1;
            }
            if (iB == -1) {
                po.b bVarN = this.f119121a.n();
                if (bVarN != null && (bArrF = bVarN.f(Character.toString((char) i15))) != null) {
                    return bArrF;
                }
                iB = 0;
            }
        } else {
            iB = this.f119144n.b(i15);
        }
        if (iB != 0) {
            return new byte[]{(byte) ((iB >> 8) & GF2Field.MASK), (byte) (iB & GF2Field.MASK)};
        }
        throw new IllegalArgumentException(String.format("No glyph for U+%04X (%c) in font %s", Integer.valueOf(i15), Character.valueOf((char) i15), getName()));
    }

    public n0 u() {
        return this.f119140j;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a A[PHI: r7
      0x007a: PHI (r7v8 so.c0) = (r7v1 so.c0), (r7v4 so.c0) binds: [B:13:0x0031, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public o(bp.d dVar, a0 a0Var, n0 n0Var) {
        hp.h hVarI;
        so.c0 c0Var;
        boolean z15;
        so.c0 c0Var2;
        super(dVar, a0Var);
        this.f119147r = new HashSet();
        s sVarM = m();
        if (n0Var != null) {
            this.f119140j = n0Var;
            this.f119142l = true;
            this.f119143m = false;
        } else {
            so.c0 c0VarD = null;
            c0VarD = null;
            if (sVarM != null) {
                hVarI = sVarM.i();
                hVarI = hVarI == null ? sVarM.j() : hVarI;
                if (hVarI == null) {
                    hVarI = sVarM.h();
                }
            } else {
                hVarI = null;
            }
            if (hVarI != null) {
                try {
                    c0VarD = new so.a0(true).d(hVarI.a());
                    if (c0VarD.Q1()) {
                        c2.g("PdfBox-Android", "Found CFF/OTF but expected embedded TTF font " + sVarM.k());
                        c0Var = c0VarD;
                        z15 = true;
                        c0Var2 = c0Var;
                    } else {
                        z15 = false;
                        c0Var2 = c0VarD;
                    }
                } catch (IOException e15) {
                    c2.h("PdfBox-Android", "Could not read embedded OTF for font " + i(), e15);
                    c0Var = c0VarD;
                }
            } else {
                z15 = false;
                c0Var2 = c0VarD;
            }
            this.f119142l = c0Var2 != null;
            this.f119143m = z15;
            this.f119140j = c0Var2 == null ? s() : c0Var2;
        }
        this.f119144n = this.f119140j.d1(false);
        this.f119141k = p();
    }
}
