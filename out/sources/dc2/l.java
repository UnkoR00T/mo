package dc2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Ldc2/g;", "viewModel", "Loq/i0;", "e", "(Ldc2/g;Lm2/r;I)V", "Ldc2/g$a$b;", "data", "h", "(Ldc2/g$a$b;Lm2/r;I)V", "Ldc2/g$a;", "state", "identitycardinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void e(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(352711195);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(352711195, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.reason.InvalidationReasonScreen (InvalidationReasonScreen.kt:25)");
            }
            g.a aVarF = f(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarF instanceof g.a.Error) {
                rVarH.X(-346950717);
                ((g.a.Error) aVarF).getVmsAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarF instanceof g.a.Initialized)) {
                    rVarH.X(-346953476);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-346948613);
                h((g.a.Initialized) aVarF, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: dc2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.g(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a f(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(g gVar, int i15, p076m2.r rVar, int i16) {
        e(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final g.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(905555594);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(905555594, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.reason.ReasonScreenContent (InvalidationReasonScreen.kt:36)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-285395273, true, new er.q() { // from class: dc2.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.i(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: dc2.j
                    @Override // er.a
                    public final Object a() {
                        return l.j(initialized);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dc2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(g.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-285395273, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.reason.ReasonScreenContent.<anonymous> (InvalidationReasonScreen.kt:38)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(mVarL, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, initialized.getHeader(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            w0 w0VarA2 = e0.a(iVar.r(aVar.b(rVar, i17).getSpacing100()), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            rVar.X(-1649614254);
            Iterator<T> it = initialized.b().iterator();
            while (it.hasNext()) {
                h0.v((n50.k) it.next(), null, rVar, 0, 2);
            }
            rVar.R();
            rVar.x();
            f3.m.Companion companion4 = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVar, i18).getSpacing300()), rVar, 0);
            c30.b lossDamageAlertData = initialized.getLossDamageAlertData();
            int i19 = c30.b.f22944i;
            c30.e.c(null, lossDamageAlertData, rVar, i19 << 3, 1);
            c30.b identityTheftAlertData = initialized.getIdentityTheftAlertData();
            if (identityTheftAlertData == null) {
                rVar.X(-74829370);
            } else {
                rVar.X(-74829369);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
                c30.e.c(null, identityTheftAlertData, rVar, i19 << 3, 1);
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(g.a.Initialized initialized) {
        initialized.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(g.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        h(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
