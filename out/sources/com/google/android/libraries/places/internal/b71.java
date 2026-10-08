package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class b71 implements a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r41 f31762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l41 f31763b;

    public b71(r41 r41Var, l41 l41Var) {
        this.f31762a = r41Var;
        this.f31763b = l41Var;
    }

    @Override // com.google.android.libraries.places.internal.a71
    public final void a(v51 v51Var) {
        int i15;
        ii iiVarI = mi.I();
        iiVarI.A(v51Var.q());
        iiVarI.D(v51Var.r());
        iiVarI.F(v51Var.s());
        iiVarI.G(v51Var.t());
        iiVarI.H(v51Var.u());
        iiVarI.I(v51Var.v());
        iiVarI.S(v51Var.w());
        iiVarI.J(v51Var.x());
        iiVarI.K(v51Var.y().length());
        iiVarI.N(v51Var.z());
        iiVarI.O(v51Var.A());
        iiVarI.P(v51Var.B());
        iiVarI.Q(v51Var.C());
        e61 e61VarJ = v51Var.j();
        int iOrdinal = e61VarJ.ordinal();
        if (iOrdinal == 0) {
            i15 = 2;
        } else if (iOrdinal == 1) {
            i15 = 3;
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("Unknown WidgetBackend: ".concat(String.valueOf(e61VarJ)));
            }
            i15 = 4;
        }
        iiVarI.W(i15);
        pi.c cVarK = v51Var.k();
        if (cVarK != null) {
            t51 t51VarL = v51Var.l();
            qj qjVarN = rj.N();
            if (t51VarL != null) {
                qjVarN.A(t51VarL.a());
                qjVarN.D(t51VarL.b());
                qjVarN.F(t51VarL.c());
                qjVarN.G(t51VarL.d());
                qjVarN.H(t51VarL.e());
            }
            gi giVarI = hi.I();
            giVarI.D(cVarK.getF157897a() == pi.b.MULTI_LINE ? 3 : 2);
            giVarI.A((rj) qjVarN.H0());
            iiVarI.R((hi) giVarI.H0());
        }
        if (v51Var.n() == z51.FRAGMENT) {
            iiVarI.T(2);
        } else if (v51Var.n() == z51.INTENT) {
            iiVarI.T(3);
        } else {
            iiVarI.T(1);
        }
        if (v51Var.o() == pi.a.FULLSCREEN) {
            iiVarI.U(2);
        } else if (v51Var.o() == pi.a.OVERLAY) {
            iiVarI.U(1);
        }
        mi miVar = (mi) iiVarI.H0();
        l41 l41Var = this.f31763b;
        si siVarA = t41.a(l41Var, l41Var.c());
        siVarA.T(10);
        siVarA.H(miVar);
        this.f31762a.a(siVarA);
    }

    @Override // com.google.android.libraries.places.internal.a71
    public final void b(ig igVar) {
        l41 l41Var = this.f31763b;
        si siVarA = t41.a(l41Var, l41Var.c());
        siVarA.T(19);
        siVarA.S(igVar);
        this.f31762a.a(siVarA);
    }
}
