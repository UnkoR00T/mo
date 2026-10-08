package lp;

import android.graphics.Path;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class f0 extends y {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private bp.d f119094n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private xp.d f119095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private uo.a f119096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final gp.j f119097r;

    public f0(bp.d dVar, gp.j jVar) {
        super(dVar);
        this.f119097r = jVar;
        F();
    }

    private boolean H(bp.a aVar) {
        if (aVar == null || aVar.size() != 6) {
            return false;
        }
        Iterator<? extends bp.b> it = aVar.toList().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof bp.k)) {
                return false;
            }
        }
        return true;
    }

    private uo.a I() {
        bp.d dVarK;
        hp.g gVarL = L();
        if (gVarL == null) {
            c2.g("PdfBox-Android", "FontBBox missing, returning empty rectangle");
            return new uo.a();
        }
        if (gVarL.d() == 0.0f && gVarL.e() == 0.0f && gVarL.f() == 0.0f && gVarL.g() == 0.0f && (dVarK = K()) != null) {
            Iterator<bp.i> it = dVarK.O4().iterator();
            while (it.hasNext()) {
                bp.o oVarO4 = dVarK.o4(it.next());
                if (oVarO4 != null) {
                    try {
                        hp.g gVarD = new e0(this, oVarO4).d();
                        if (gVarD != null) {
                            gVarL.i(Math.min(gVarL.d(), gVarD.d()));
                            gVarL.j(Math.min(gVarL.e(), gVarD.e()));
                            gVarL.k(Math.max(gVarL.f(), gVarD.f()));
                            gVarL.l(Math.max(gVarL.g(), gVarD.g()));
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return new uo.a(gVarL.d(), gVarL.e(), gVarL.f(), gVarL.g());
    }

    @Override // lp.y
    public Path B(String str) {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    @Override // lp.y
    protected Boolean D() {
        return Boolean.FALSE;
    }

    @Override // lp.y
    protected final void F() {
        bp.b bVarP4 = this.f119160a.p4(bp.i.f20716d3);
        if (bVarP4 instanceof bp.i) {
            bp.i iVar = (bp.i) bVarP4;
            mp.c cVarE = mp.c.e(iVar);
            this.f119173j = cVarE;
            if (cVarE == null) {
                c2.g("PdfBox-Android", "Unknown encoding: " + iVar.A3());
            }
        } else if (bVarP4 instanceof bp.d) {
            this.f119173j = new mp.b((bp.d) bVarP4);
        }
        this.f119174k = mp.d.b();
    }

    @Override // lp.y
    protected mp.c G() {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    public e0 J(int i15) {
        if (z() != null && K() != null) {
            bp.o oVarO4 = K().o4(bp.i.J3(z().f(i15)));
            if (oVarO4 != null) {
                return new e0(this, oVarO4);
            }
        }
        return null;
    }

    public bp.d K() {
        if (this.f119094n == null) {
            this.f119094n = this.f119160a.k4(bp.i.f20755h1);
        }
        return this.f119094n;
    }

    public hp.g L() {
        bp.b bVarP4 = this.f119160a.p4(bp.i.I3);
        if (bVarP4 instanceof bp.a) {
            return new hp.g((bp.a) bVarP4);
        }
        return null;
    }

    @Override // lp.r, lp.u
    public xp.d b() {
        if (this.f119095p == null) {
            bp.a aVarJ4 = this.f119160a.j4(bp.i.O3);
            this.f119095p = H(aVarJ4) ? xp.d.e(aVarJ4) : super.b();
        }
        return this.f119095p;
    }

    @Override // lp.u
    public uo.a c() {
        if (this.f119096q == null) {
            this.f119096q = I();
        }
        return this.f119096q;
    }

    @Override // lp.u
    public float d(int i15) {
        e0 e0VarJ = J(i15);
        if (e0VarJ == null || e0VarJ.c().e() == 0) {
            return 0.0f;
        }
        return e0VarJ.e();
    }

    @Override // lp.u
    public boolean e() {
        return true;
    }

    @Override // lp.r
    protected byte[] g(int i15) {
        throw new UnsupportedOperationException("Not implemented: Type3");
    }

    @Override // lp.u
    public String getName() {
        return this.f119160a.H4(bp.i.M5);
    }

    @Override // lp.r
    public float o(int i15) {
        Float f15;
        int iY4 = this.f119160a.y4(bp.i.A3, -1);
        int iY5 = this.f119160a.y4(bp.i.V4, -1);
        List<Float> listP = p();
        if (listP.isEmpty() || i15 < iY4 || i15 > iY5) {
            s sVarJ = j();
            return sVarJ != null ? sVarJ.m() : d(i15);
        }
        int i16 = i15 - iY4;
        if (i16 < listP.size() && (f15 = listP.get(i16)) != null) {
            return f15.floatValue();
        }
        return 0.0f;
    }

    @Override // lp.y, lp.r
    public boolean q() {
        return false;
    }

    @Override // lp.r
    public int u(InputStream inputStream) {
        return inputStream.read();
    }
}
