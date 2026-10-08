package dh;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class xb implements ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f8 f42476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ja f42477b = new ja();

    private xb(f8 f8Var, int i15) {
        this.f42476a = f8Var;
        jc.a();
    }

    public static ob e(f8 f8Var) {
        return new xb(f8Var, 0);
    }

    @Override // dh.ob
    public final String a() {
        ma maVarC = this.f42476a.f().c();
        return (maVarC == null || g5.b(maVarC.k())) ? "NA" : (String) jg.s.l(maVarC.k());
    }

    @Override // dh.ob
    public final ob b(e8 e8Var) {
        this.f42476a.c(e8Var);
        return this;
    }

    @Override // dh.ob
    public final ob c(ja jaVar) {
        this.f42477b = jaVar;
        return this;
    }

    @Override // dh.ob
    public final byte[] d(int i15, boolean z15) {
        this.f42477b.f(Boolean.valueOf(1 == (i15 ^ 1)));
        this.f42477b.e(Boolean.FALSE);
        this.f42476a.e(this.f42477b.m());
        try {
            jc.a();
            if (i15 == 0) {
                return new fl.d().j(m6.f42055a).k(true).i().b(this.f42476a.f()).getBytes("utf-8");
            }
            h8 h8VarF = this.f42476a.f();
            n nVar = new n();
            m6.f42055a.a(nVar);
            return nVar.b().a(h8VarF);
        } catch (UnsupportedEncodingException e15) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e15);
        }
    }
}
