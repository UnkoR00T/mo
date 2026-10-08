package ss;

import qt.t0;
import vr.i1;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements qt.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f183944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ot.y<ws.c> f183945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0 f183946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qt.r f183947e;

    public z(x xVar, ot.y<ws.c> yVar, t0 t0Var, qt.r rVar) {
        this.f183944b = xVar;
        this.f183945c = yVar;
        this.f183946d = t0Var;
        this.f183947e = rVar;
    }

    @Override // qt.s
    public String a() {
        return "Class '" + this.f183944b.i().a().a() + '\'';
    }

    @Override // vr.h1
    public i1 b() {
        return i1.f208053a;
    }

    public final x d() {
        return this.f183944b;
    }

    public String toString() {
        return z.class.getSimpleName() + ": " + this.f183944b;
    }
}
