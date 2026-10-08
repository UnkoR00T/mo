package eh;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class td implements ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ea f51094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fc f51095b = new fc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51096c;

    private td(ea eaVar, int i15) {
        this.f51094a = eaVar;
        ce.a();
        this.f51096c = i15;
    }

    public static ed e(ea eaVar) {
        return new td(eaVar, 0);
    }

    public static ed f(ea eaVar, int i15) {
        return new td(eaVar, 1);
    }

    @Override // eh.ed
    public final ed a(da daVar) {
        this.f51094a.f(daVar);
        return this;
    }

    @Override // eh.ed
    public final ed b(fc fcVar) {
        this.f51095b = fcVar;
        return this;
    }

    @Override // eh.ed
    public final String c() {
        hc hcVarF = this.f51094a.j().f();
        return (hcVarF == null || d.b(hcVarF.k())) ? "NA" : (String) jg.s.l(hcVarF.k());
    }

    @Override // eh.ed
    public final byte[] d(int i15, boolean z15) {
        this.f51095b.f(Boolean.valueOf(1 == (i15 ^ 1)));
        this.f51095b.e(Boolean.FALSE);
        this.f51094a.i(this.f51095b.m());
        try {
            ce.a();
            if (i15 == 0) {
                return new fl.d().j(f8.f50550a).k(true).i().b(this.f51094a.j()).getBytes("utf-8");
            }
            ga gaVarJ = this.f51094a.j();
            a2 a2Var = new a2();
            f8.f50550a.a(a2Var);
            return a2Var.b().a(gaVarJ);
        } catch (UnsupportedEncodingException e15) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e15);
        }
    }

    @Override // eh.ed
    public final int zza() {
        return this.f51096c;
    }
}
