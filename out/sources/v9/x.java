package v9;

import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t7.p f205284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w7.k0 f205285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f205286c;

    public x(String str, String str2) {
        this.f205284a = new t7.p.b().X(str2).A0(str).Q();
    }

    private void c() {
        zj.p.q(this.f205285b);
        w7.o0.h(this.f205286c);
    }

    @Override // v9.d0
    public void a(w7.k0 k0Var, o8.r rVar, l0.d dVar) {
        this.f205285b = k0Var;
        dVar.a();
        s0 s0VarV = rVar.v(dVar.c(), 5);
        this.f205286c = s0VarV;
        s0VarV.e(this.f205284a);
    }

    @Override // v9.d0
    public void b(w7.c0 c0Var) {
        c();
        long jE = this.f205285b.e();
        long jF = this.f205285b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        t7.p pVar = this.f205284a;
        if (jF != pVar.f188386u) {
            t7.p pVarQ = pVar.b().E0(jF).Q();
            this.f205284a = pVarQ;
            this.f205286c.e(pVarQ);
        }
        int iA = c0Var.a();
        this.f205286c.a(c0Var, iA);
        this.f205286c.c(jE, 1, iA, 0, null);
    }
}
