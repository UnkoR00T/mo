package ss;

import qt.t0;
import vr.i1;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements qt.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jt.d f183919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jt.d f183920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jt.d f183921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ot.y<ws.c> f183922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t0 f183923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qt.r f183924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x f183925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f183926i;

    public r(jt.d dVar, jt.d dVar2, jt.d dVar3, us.m mVar, ws.d dVar4, ot.y<ws.c> yVar, t0 t0Var, qt.r rVar, x xVar) {
        String string;
        this.f183919b = dVar;
        this.f183920c = dVar2;
        this.f183921d = dVar3;
        this.f183922e = yVar;
        this.f183923f = t0Var;
        this.f183924g = rVar;
        this.f183925h = xVar;
        Integer num = (Integer) ws.f.a(mVar, xs.a.f220675m);
        this.f183926i = (num == null || (string = dVar4.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // qt.s
    public String a() {
        return "Class '" + d().a().a() + '\'';
    }

    @Override // vr.h1
    public i1 b() {
        return i1.f208053a;
    }

    public final zs.b d() {
        return new zs.b(e().g(), h());
    }

    public jt.d e() {
        return this.f183919b;
    }

    public jt.d f() {
        return this.f183920c;
    }

    public final x g() {
        return this.f183925h;
    }

    public final zs.f h() {
        return zs.f.l(fu.r.j1(e().f(), '/', null, 2, null));
    }

    public String toString() {
        return r.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(x xVar, us.m mVar, ws.d dVar, ot.y<ws.c> yVar, boolean z15, qt.r rVar) {
        jt.d dVarD;
        jt.d dVarB = jt.d.b(xVar.i());
        String strE = xVar.d().e();
        if (strE != null) {
            dVarD = strE.length() > 0 ? jt.d.d(strE) : null;
        } else {
            dVarD = null;
        }
        this(dVarB, dVarD, null, mVar, dVar, yVar, new t0(z15, null, 2, null), rVar, xVar);
    }
}
