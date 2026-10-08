package sv3;

import d1.r3;
import mx.Label;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lsv3/s;", "viewModel", "Loq/i0;", "h", "(Lsv3/s;Lm2/r;I)V", "Lsv3/s$a$c;", "data", "e", "(Lsv3/s$a$c;Lm2/r;I)V", "Lmx/a;", "title", "k", "(Lmx/a;Lm2/r;I)V", "Lsv3/s$a;", "state", "edorauth_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    public static final void e(final s.a.Screen screen, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1117578303);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(screen) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1117578303, i16, -1, "pl.gov.coi.mobywatel.segment.edorauth.presentation.EdorAuthContent (EdorAuthScreen.kt:42)");
            }
            k(screen.getLoadingLabel(), rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sv3.u
                    @Override // er.a
                    public final Object a() {
                        return x.f();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sv3.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.g(screen, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(s.a.Screen screen, int i15, p076m2.r rVar, int i16) {
        e(screen, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void h(final s sVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1585021038);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(sVar) : rVarH.G(sVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1585021038, i16, -1, "pl.gov.coi.mobywatel.segment.edorauth.presentation.EdorAuthScreen (EdorAuthScreen.kt:29)");
            }
            s.a aVarI = i(m7.b.c(sVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarI, s.a.b.f184841a)) {
                rVarH.X(1508178531);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarI instanceof s.a.Screen) {
                rVarH.X(1508180423);
                e((s.a.Screen) aVarI, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarI instanceof s.a.Error)) {
                    rVarH.X(1508176646);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1508182842);
                ((s.a.Error) aVarI).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sv3.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.j(sVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final s.a i(f6<? extends s.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(s sVar, int i15, p076m2.r rVar, int i16) {
        h(sVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1144375557);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1144375557, i16, -1, "pl.gov.coi.mobywatel.segment.edorauth.presentation.LoadingContent (EdorAuthScreen.kt:50)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), companion2.g(), rVarH, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarF2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            x70.f.g(x70.a.C5796a.f217280c, rVarH, x70.a.C5796a.f217281d);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, Float.valueOf(-1.0f), false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 30932955);
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sv3.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.l(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(Label label, int i15, p076m2.r rVar, int i16) {
        k(label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
