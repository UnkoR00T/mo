package lp;

import android.graphics.Path;
import io.sentry.android.core.c2;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected mp.c f119173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected mp.d f119174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f119175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<Integer> f119176m;

    y(String str) {
        super(str);
        this.f119176m = new HashSet();
        y(str);
    }

    private void y(String str) {
        if ("ZapfDingbats".equals(str)) {
            this.f119174k = mp.d.c();
        } else {
            this.f119174k = mp.d.b();
        }
    }

    public mp.d A() {
        return this.f119174k;
    }

    public abstract Path B(String str);

    protected final Boolean C() {
        if (j() != null) {
            return Boolean.valueOf(j().s());
        }
        return null;
    }

    protected Boolean D() {
        Boolean boolC = C();
        if (boolC != null) {
            return boolC;
        }
        if (q()) {
            String strC = h0.c(getName());
            return Boolean.valueOf(strC.equals("Symbol") || strC.equals("ZapfDingbats"));
        }
        mp.c cVar = this.f119173j;
        if (cVar == null) {
            if (this instanceof z) {
                return Boolean.TRUE;
            }
            throw new IllegalStateException("PDFBox bug: encoding should not be null!");
        }
        if ((cVar instanceof mp.k) || (cVar instanceof mp.g) || (cVar instanceof mp.h)) {
            return Boolean.FALSE;
        }
        if (!(cVar instanceof mp.b)) {
            return null;
        }
        for (String str : ((mp.b) cVar).k().values()) {
            if (!".notdef".equals(str) && (!mp.k.f127358d.b(str) || !mp.g.f127352d.b(str) || !mp.h.f127354d.b(str))) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public final boolean E() {
        if (this.f119175l == null) {
            Boolean boolD = D();
            if (boolD != null) {
                this.f119175l = boolD;
            } else {
                this.f119175l = Boolean.TRUE;
            }
        }
        return this.f119175l.booleanValue();
    }

    protected void F() {
        bp.b bVarP4 = this.f119160a.p4(bp.i.f20716d3);
        if (bVarP4 instanceof bp.i) {
            bp.i iVar = (bp.i) bVarP4;
            mp.c cVarE = mp.c.e(iVar);
            this.f119173j = cVarE;
            if (cVarE == null) {
                c2.g("PdfBox-Android", "Unknown encoding: " + iVar.A3());
                this.f119173j = G();
            }
        } else if (bVarP4 instanceof bp.d) {
            bp.d dVar = (bp.d) bVarP4;
            Boolean boolC = C();
            bp.i iVarL4 = dVar.l4(bp.i.f20886u0);
            mp.c cVarG = ((iVarL4 == null || mp.c.e(iVarL4) == null) && Boolean.TRUE.equals(boolC)) ? G() : null;
            if (boolC == null) {
                boolC = Boolean.FALSE;
            }
            this.f119173j = new mp.b(dVar, !boolC.booleanValue(), cVarG);
        } else {
            this.f119173j = G();
        }
        y(h0.c(getName()));
    }

    protected abstract mp.c G();

    @Override // lp.r
    public void f(int i15) {
        throw new UnsupportedOperationException();
    }

    @Override // lp.r
    protected final float l(int i15) {
        if (k() == null) {
            throw new IllegalStateException("No AFM");
        }
        String strF = z().f(i15);
        if (".notdef".equals(strF)) {
            return 250.0f;
        }
        if ("nbspace".equals(strF)) {
            strF = "space";
        } else if ("sfthyphen".equals(strF)) {
            strF = "hyphen";
        }
        return k().l(strF);
    }

    @Override // lp.r
    public boolean q() {
        if (z() instanceof mp.b) {
            mp.b bVar = (mp.b) z();
            if (bVar.k().size() > 0) {
                mp.c cVarJ = bVar.j();
                for (Map.Entry<Integer, String> entry : bVar.k().entrySet()) {
                    if (!entry.getValue().equals(cVarJ.f(entry.getKey().intValue()))) {
                        return false;
                    }
                }
            }
        }
        return super.q();
    }

    @Override // lp.r
    public void v() {
        throw new UnsupportedOperationException();
    }

    @Override // lp.r
    public boolean x() {
        return false;
    }

    public mp.c z() {
        return this.f119173j;
    }

    y(bp.d dVar) {
        super(dVar);
        this.f119176m = new HashSet();
    }
}
