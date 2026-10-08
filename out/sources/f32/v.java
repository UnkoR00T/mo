package f32;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lf32/r;", "viewModel", "Loq/i0;", "g", "(Lf32/r;Lm2/r;I)V", "Lf32/r$a$a;", "data", "d", "(Lf32/r$a$a;Lm2/r;I)V", "Lf32/r$a;", "state", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {
    public static final void d(final r.a.C1323a c1323a, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(115897998);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(c1323a) : rVarH.G(c1323a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(115897998, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.nativeoauth.NativeOAuthEmptyScreen (NativeOAuthScreen.kt:32)");
            }
            i50.s.r(c1323a.a(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-490953343, true, new er.q() { // from class: f32.t
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.e(c1323a, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, c1323a.c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f32.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.f(c1323a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(r.a.C1323a c1323a, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-490953343, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.nativeoauth.NativeOAuthEmptyScreen.<anonymous> (NativeOAuthScreen.kt:36)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            q40.i.b(c1323a.b(), b.f58876a.b(), null, rVar, IconPageData.f164667h | 48, 4);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(r.a.C1323a c1323a, int i15, p076m2.r rVar, int i16) {
        d(c1323a, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void g(final r rVar, p076m2.r rVar2, final int i15) {
        int i16;
        p076m2.r rVarH = rVar2.h(1347294908);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(rVar) : rVarH.G(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1347294908, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.nativeoauth.NativeOAuthScreen (NativeOAuthScreen.kt:21)");
            }
            r.a aVarH = h(m7.b.c(rVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof r.a.Loader) {
                rVarH.X(1965256903);
                x70.f.g(((r.a.Loader) aVarH).getLoaderData(), rVarH, x70.a.f217278b);
                rVarH.R();
            } else if (aVarH instanceof r.a.C1323a) {
                rVarH.X(1965259686);
                d((r.a.C1323a) aVarH, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof r.a.Error)) {
                    rVarH.X(1965254686);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1965263300);
                ((r.a.Error) aVarH).getErrorVMSAdapter().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: f32.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.i(rVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final r.a h(f6<? extends r.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(r rVar, int i15, p076m2.r rVar2, int i16) {
        g(rVar, rVar2, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
