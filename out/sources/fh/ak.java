package fh;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class ak implements lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ke f62935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ki f62936b = new ki();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62937c;

    private ak(ke keVar, int i15) {
        this.f62935a = keVar;
        jk.a();
        this.f62937c = i15;
    }

    public static lj e(ke keVar) {
        return new ak(keVar, 0);
    }

    public static lj f(ke keVar, int i15) {
        return new ak(keVar, 1);
    }

    @Override // fh.lj
    public final lj a(ki kiVar) {
        this.f62936b = kiVar;
        return this;
    }

    @Override // fh.lj
    public final lj b(je jeVar) {
        this.f62935a.f(jeVar);
        return this;
    }

    @Override // fh.lj
    public final String c() {
        mi miVarF = this.f62935a.j().f();
        return (miVarF == null || il.b(miVarF.k())) ? "NA" : (String) jg.s.l(miVarF.k());
    }

    @Override // fh.lj
    public final byte[] d(int i15, boolean z15) {
        this.f62936b.f(Boolean.valueOf(1 == (i15 ^ 1)));
        this.f62936b.e(Boolean.FALSE);
        this.f62935a.i(this.f62936b.m());
        try {
            jk.a();
            if (i15 == 0) {
                return new fl.d().j(cc.f62983a).k(true).i().b(this.f62935a.j()).getBytes("utf-8");
            }
            me meVarJ = this.f62935a.j();
            e2 e2Var = new e2();
            cc.f62983a.a(e2Var);
            return e2Var.b().a(meVarJ);
        } catch (UnsupportedEncodingException e15) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e15);
        }
    }

    @Override // fh.lj
    public final int zza() {
        return this.f62937c;
    }
}
