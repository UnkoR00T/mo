package lp;

import android.graphics.Path;
import android.graphics.PointF;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final oo.a f119129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final mo.b f119130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<Integer, Float> f119131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f119132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f119133n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Float f119134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private xp.d f119135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final wo.a f119136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private uo.a f119137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int[] f119138t;

    private class b implements oo.k.b {
        private b() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00e5, please report this as an issue */
    public n(bp.d dVar, a0 a0Var) {
        oo.h hVar;
        boolean z15;
        lp.a aVarC;
        mo.b bVar;
        oo.h hVarJ;
        hp.h hVarJ2;
        super(dVar, a0Var);
        this.f119131l = new HashMap();
        this.f119134p = null;
        this.f119138t = null;
        s sVarM = m();
        byte[] bArrF = (sVarM == null || (hVarJ2 = sVarM.j()) == null) ? null : hVarJ2.f();
        if (bArrF == null || bArrF.length <= 0 || (bArrF[0] & 255) != 37) {
            if (bArrF != null) {
                try {
                    hVar = new oo.k().e(bArrF, new b()).get(0);
                } catch (IOException e15) {
                    c2.f("PdfBox-Android", "Can't read the embedded CFF font " + sVarM.k(), e15);
                    hVar = null;
                    z15 = true;
                }
            } else {
                hVar = null;
            }
            z15 = false;
            if (hVar != null) {
                if (hVar instanceof oo.a) {
                    this.f119129j = (oo.a) hVar;
                    this.f119130k = null;
                } else {
                    this.f119129j = null;
                    this.f119130k = hVar;
                }
                this.f119138t = p();
                this.f119132m = true;
                this.f119133n = false;
            } else {
                aVarC = j.a().c(i(), m(), j());
                if (aVarC.d()) {
                    hVarJ = aVarC.a().P1().j();
                    if (hVarJ instanceof oo.a) {
                        oo.a aVar = (oo.a) hVarJ;
                        this.f119129j = aVar;
                        this.f119130k = null;
                        bVar = aVar;
                    } else {
                        oo.n nVar = (oo.n) hVarJ;
                        this.f119129j = null;
                        this.f119130k = nVar;
                        bVar = nVar;
                    }
                } else {
                    this.f119129j = null;
                    mo.b bVarC = aVarC.c();
                    this.f119130k = bVarC;
                    bVar = bVarC;
                }
                if (aVarC.b()) {
                    c2.g("PdfBox-Android", "Using fallback " + bVar.getName() + " for CID-keyed font " + i());
                }
                this.f119132m = false;
                this.f119133n = z15;
            }
            wo.a aVarC2 = b().c();
            this.f119136r = aVarC2;
            aVarC2.w(1000.0d, 1000.0d);
        }
        c2.g("PdfBox-Android", "Found PFB but expected embedded CFF font " + sVarM.k());
        hVar = null;
        z15 = true;
        if (hVar != null) {
            if (hVar instanceof oo.a) {
                this.f119129j = (oo.a) hVar;
                this.f119130k = null;
            } else {
                this.f119129j = null;
                this.f119130k = hVar;
            }
            this.f119138t = p();
            this.f119132m = true;
            this.f119133n = false;
        } else {
            aVarC = j.a().c(i(), m(), j());
            if (aVarC.d()) {
                hVarJ = aVarC.a().P1().j();
                if (hVarJ instanceof oo.a) {
                    oo.a aVar2 = (oo.a) hVarJ;
                    this.f119129j = aVar2;
                    this.f119130k = null;
                    bVar = aVar2;
                } else {
                    oo.n nVar2 = (oo.n) hVarJ;
                    this.f119129j = null;
                    this.f119130k = nVar2;
                    bVar = nVar2;
                }
            } else {
                this.f119129j = null;
                mo.b bVarC2 = aVarC.c();
                this.f119130k = bVarC2;
                bVar = bVarC2;
            }
            if (aVarC.b()) {
                c2.g("PdfBox-Android", "Using fallback " + bVar.getName() + " for CID-keyed font " + i());
            }
            this.f119132m = false;
            this.f119133n = z15;
        }
        wo.a aVarC3 = b().c();
        this.f119136r = aVarC3;
        aVarC3.w(1000.0d, 1000.0d);
    }

    private uo.a s() {
        if (m() != null) {
            hp.g gVarF = m().f();
            if (gVarF.d() != 0.0f || gVarF.e() != 0.0f || gVarF.f() != 0.0f || gVarF.g() != 0.0f) {
                return new uo.a(gVarF.d(), gVarF.e(), gVarF.f(), gVarF.g());
            }
        }
        oo.a aVar = this.f119129j;
        if (aVar != null) {
            return aVar.h();
        }
        try {
            return this.f119130k.h();
        } catch (IOException unused) {
            return new uo.a();
        }
    }

    private String t(int i15) {
        String strW = this.f119121a.w(i15);
        return strW == null ? ".notdef" : k0.a(strW.codePointAt(0));
    }

    @Override // lp.g0
    public Path a(int i15) {
        int iF = f(i15);
        int[] iArr = this.f119138t;
        if (iArr != null && this.f119132m) {
            iF = iArr[iF];
        }
        oo.v vVarU = u(iF);
        if (vVarU != null) {
            return vVarU.d();
        }
        if (this.f119132m) {
            mo.b bVar = this.f119130k;
            if (bVar instanceof oo.n) {
                return ((oo.n) bVar).e(iF).d();
            }
        }
        return this.f119130k.r(t(i15));
    }

    @Override // lp.u
    public final xp.d b() {
        List<Number> listB;
        if (this.f119135q == null) {
            oo.a aVar = this.f119129j;
            if (aVar != null) {
                listB = aVar.b();
            } else {
                try {
                    listB = this.f119130k.b();
                } catch (IOException unused) {
                    return new xp.d(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                }
            }
            if (listB == null || listB.size() != 6) {
                this.f119135q = new xp.d(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
            } else {
                this.f119135q = new xp.d(listB.get(0).floatValue(), listB.get(1).floatValue(), listB.get(2).floatValue(), listB.get(3).floatValue(), listB.get(4).floatValue(), listB.get(5).floatValue());
            }
        }
        return this.f119135q;
    }

    @Override // lp.u
    public uo.a c() {
        if (this.f119137s == null) {
            this.f119137s = s();
        }
        return this.f119137s;
    }

    @Override // lp.u
    public float d(int i15) {
        float fP;
        int iE;
        int iF = f(i15);
        if (this.f119129j == null) {
            if (this.f119132m) {
                mo.b bVar = this.f119130k;
                if (bVar instanceof oo.n) {
                    iE = ((oo.n) bVar).e(iF).e();
                }
                PointF pointF = new PointF(fP, 0.0f);
                this.f119136r.G(pointF, pointF);
                return pointF.x;
            }
            fP = this.f119130k.p(t(i15));
            PointF pointF2 = new PointF(fP, 0.0f);
            this.f119136r.G(pointF2, pointF2);
            return pointF2.x;
        }
        iE = u(iF).e();
        fP = iE;
        PointF pointF3 = new PointF(fP, 0.0f);
        this.f119136r.G(pointF3, pointF3);
        return pointF3.x;
    }

    @Override // lp.u
    public boolean e() {
        return this.f119132m;
    }

    @Override // lp.m
    public int f(int i15) {
        return this.f119121a.B().t(i15);
    }

    @Override // lp.m
    public int g(int i15) {
        int iF = f(i15);
        oo.a aVar = this.f119129j;
        return aVar != null ? aVar.d().c(iF) : iF;
    }

    @Override // lp.m
    public byte[] h(int i15) {
        throw new UnsupportedOperationException();
    }

    public oo.v u(int i15) {
        oo.a aVar = this.f119129j;
        if (aVar != null) {
            return aVar.e(i15);
        }
        mo.b bVar = this.f119130k;
        if (bVar instanceof oo.n) {
            return ((oo.n) bVar).e(i15);
        }
        return null;
    }
}
