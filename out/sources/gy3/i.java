package gy3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lgy3/d;", "viewModel", "Loq/i0;", "h", "(Lgy3/d;Lm2/r;I)V", "Lgy3/d$a;", "screenData", "e", "(Lgy3/d$a;Lm2/r;I)V", "makepayment_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void e(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1949360505);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1949360505, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.googlepay.PaymentsGooglePayContent (PaymentsGooglePayScreen.kt:36)");
            }
            if (aVar instanceof d.a.c) {
                rVarH.X(-1870500610);
                c60.b.b(rVarH, 0);
                rVarH.R();
                rVar2 = rVarH;
            } else if (aVar instanceof d.a.Pending) {
                rVarH.X(-1870497447);
                i50.s.r(((d.a.Pending) aVar).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(969061979, true, new er.q() { // from class: gy3.g
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return i.f(aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
                rVar2 = rVarH;
                rVar2.R();
            } else {
                rVar2 = rVarH;
                if (!(aVar instanceof d.a.Error)) {
                    rVar2.X(-1870502262);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(-1870470987);
                ((d.a.Error) aVar).getErrorVMS().b(rVar2, 0);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gy3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(d.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(969061979, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.googlepay.PaymentsGooglePayContent.<anonymous>.<anonymous> (PaymentsGooglePayScreen.kt:43)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), null, rVar, 0, 1), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            f3.m mVarH = androidx.compose.foundation.layout.d.h(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            w0 w0VarA2 = e0.a(iVar.e(), companion2.g(), rVar, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarH);
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
            d.a.Pending pending = (d.a.Pending) aVar;
            x70.f.g(pending.getLoaderData(), rVar, x70.a.f217278b);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            j70.h.g(null, null, pending.getDescriptionLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, Float.valueOf(-2.0f), false, false, null, rVar, 0, 0, 0, 31457275);
            rVar.x();
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
    public static final i0 g(d.a aVar, int i15, p076m2.r rVar, int i16) {
        e(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1010075446);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1010075446, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.googlepay.PaymentsGooglePayScreen (PaymentsGooglePayScreen.kt:28)");
            }
            e(i(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: gy3.e
                    @Override // er.a
                    public final Object a() {
                        return i.j();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gy3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a i(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d dVar, int i15, p076m2.r rVar, int i16) {
        h(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
