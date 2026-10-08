package ch;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class qk implements ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ze f26293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yi f26294b = new yi();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26295c;

    private qk(ze zeVar, int i15) {
        this.f26293a = zeVar;
        al.a();
        this.f26295c = i15;
    }

    public static ck a(ze zeVar) {
        return new qk(zeVar, 0);
    }

    public static ck b(ze zeVar, int i15) {
        return new qk(zeVar, 1);
    }

    @Override // ch.ck
    public final String c() {
        aj ajVarG = this.f26293a.j().g();
        return (ajVarG == null || v.b(ajVarG.k())) ? "NA" : (String) jg.s.l(ajVarG.k());
    }

    @Override // ch.ck
    public final byte[] d(int i15, boolean z15) {
        this.f26294b.f(Boolean.valueOf(1 == (i15 ^ 1)));
        this.f26294b.e(Boolean.FALSE);
        this.f26293a.i(this.f26294b.m());
        try {
            al.a();
            if (i15 == 0) {
                return new fl.d().j(qc.f26292a).k(true).i().b(this.f26293a.j()).getBytes("utf-8");
            }
            bf bfVarJ = this.f26293a.j();
            t2 t2Var = new t2();
            qc.f26292a.a(t2Var);
            return t2Var.b().a(bfVarJ);
        } catch (UnsupportedEncodingException e15) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e15);
        }
    }

    @Override // ch.ck
    public final ck e(yi yiVar) {
        this.f26294b = yiVar;
        return this;
    }

    @Override // ch.ck
    public final ck f(ye yeVar) {
        this.f26293a.f(yeVar);
        return this;
    }

    @Override // ch.ck
    public final int zza() {
        return this.f26295c;
    }
}
