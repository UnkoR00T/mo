package jy3;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import k40.EmptyStateData;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ljy3/k;", "viewModel", "Loq/i0;", "p", "(Ljy3/k;Lm2/r;I)V", "Ljy3/k$a;", "screenData", "h", "(Ljy3/k$a;Lm2/r;I)V", "Ljy3/k$a$d;", "m", "(Ljy3/k$a$d;Lm2/r;I)V", "Ljy3/k$a$c;", "j", "(Ljy3/k$a$c;Lm2/r;I)V", "makepayment_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {
    private static final void h(final k.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1889485135);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1889485135, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.methods.PaymentPaymentMethodsContent (PaymentsPaymentMethodsScreen.kt:38)");
            }
            if (fr.t.c(aVar, k.a.b.f106683a)) {
                rVarH.X(-975946304);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof k.a.Initialized) {
                rVarH.X(-975943570);
                j((k.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof k.a.NoAvailableMethods) {
                rVarH.X(-975939154);
                m((k.a.NoAvailableMethods) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof k.a.Error)) {
                    rVarH.X(-975948211);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-975934761);
                ((k.a.Error) aVar).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: jy3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.i(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(k.a aVar, int i15, p076m2.r rVar, int i16) {
        h(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void j(final k.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-950228006);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-950228006, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.methods.PaymentPaymentMethodsInitializedScreen (PaymentsPaymentMethodsScreen.kt:75)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1468808621, true, new er.q() { // from class: jy3.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.k(initialized, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jy3.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.l(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(k.a.Initialized initialized, k.a.Initialized initialized2, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1468808621, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.methods.PaymentPaymentMethodsInitializedScreen.<anonymous>.<anonymous> (PaymentsPaymentMethodsScreen.kt:77)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m30.i.d(initialized.getPaymentMethodsCardData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            c30.e.c(null, initialized2.getAlertData(), rVar, c30.b.f22944i << 3, 1);
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
    public static final oq.i0 l(k.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void m(final k.a.NoAvailableMethods noAvailableMethods, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-7888340);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noAvailableMethods) : rVarH.G(noAvailableMethods) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-7888340, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.methods.PaymentPaymentMethodsUnavailableScreen (PaymentsPaymentMethodsScreen.kt:54)");
            }
            rVar2 = rVarH;
            i50.s.r(noAvailableMethods.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2060989163, true, new er.q() { // from class: jy3.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.n(noAvailableMethods, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jy3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.o(noAvailableMethods, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(k.a.NoAvailableMethods noAvailableMethods, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2060989163, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.methods.PaymentPaymentMethodsUnavailableScreen.<anonymous>.<anonymous> (PaymentsPaymentMethodsScreen.kt:56)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), rVar, 0);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
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
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            p036e4.w0 w0VarI = d1.r.i(companion2.e(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarF);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            k40.d.c(null, noAvailableMethods.getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            rVar.x();
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
    public static final oq.i0 o(k.a.NoAvailableMethods noAvailableMethods, int i15, p076m2.r rVar, int i16) {
        m(noAvailableMethods, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final k kVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1280858655);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1280858655, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.methods.PaymentsPaymentMethodsScreen (PaymentsPaymentMethodsScreen.kt:28)");
            }
            final f6 f6VarC = m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7);
            h(q(f6VarC), rVarH, 0);
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: jy3.n
                    @Override // er.a
                    public final Object a() {
                        return u.r(f6VarC);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jy3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.s(kVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final k.a q(f6<? extends k.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(f6 f6Var) {
        q(f6Var).a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(k kVar, int i15, p076m2.r rVar, int i16) {
        p(kVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
