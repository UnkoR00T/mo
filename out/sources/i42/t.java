package i42;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.q0;
import f1.y0;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.io.IOException;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import v60.PaymentStatusCardData;
import x40.LinkData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0012\u001a\u00020\u0002*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Li42/e;", "viewModel", "Loq/i0;", "z", "(Li42/e;Lm2/r;I)V", "Li42/e$a;", "screenData", "Lka/a;", "Lv60/a;", "pagingItems", "o", "(Li42/e$a;Lka/a;Lm2/r;I)V", "Li42/e$a$b;", "q", "(Li42/e$a$b;Lka/a;Lm2/r;I)V", "Lf1/q0;", "Lk42/a$b;", "paymentsListContentData", "C", "(Lf1/q0;Lka/a;Lk42/a$b;)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    private static final e.a A(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(e eVar, int i15, p076m2.r rVar, int i16) {
        z(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void C(q0 q0Var, final ka.a<PaymentStatusCardData> aVar, final k42.a.WithPayments withPayments) {
        if (fr.t.c(aVar.i().getRefresh(), ja.w.Loading.f101205b)) {
            q0.c(q0Var, null, null, b.f89138a.b(), 3, null);
        } else if (aVar.g() == 0) {
            q0.c(q0Var, null, null, y2.m.b(-577124034, true, new er.q() { // from class: i42.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.D(withPayments, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            q0.e(q0Var, aVar.g(), null, null, y2.m.b(-1617735444, true, new er.r() { // from class: i42.h
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return t.F(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }), 6, null);
            q0.c(q0Var, null, null, y2.m.b(58180117, true, new er.q() { // from class: i42.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.G(aVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(final k42.a.WithPayments withPayments, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-577124034, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.addPaymentsDashboardPendingPaymentsContent.<anonymous> (PaymentsDashboardScreen.kt:134)");
            }
            x30.c.c(null, 0.0f, y2.m.d(1214136061, true, new er.p() { // from class: i42.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.E(withPayments, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(k42.a.WithPayments withPayments, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1214136061, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.addPaymentsDashboardPendingPaymentsContent.<anonymous>.<anonymous> (PaymentsDashboardScreen.kt:135)");
            }
            j70.h.g(null, null, withPayments.getNoPendingPaymentsLabel(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33550331);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        if ((i16 & 48) == 0) {
            i16 |= rVar.c(i15) ? 32 : 16;
        }
        if (rVar.r((i16 & 145) != 144, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1617735444, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.addPaymentsDashboardPendingPaymentsContent.<anonymous> (PaymentsDashboardScreen.kt:140)");
            }
            PaymentStatusCardData paymentStatusCardData = (PaymentStatusCardData) aVar.f(i15);
            if (paymentStatusCardData == null) {
                rVar.X(-128530374);
            } else {
                rVar.X(-128530373);
                v60.i.h(null, paymentStatusCardData, rVar, PaymentStatusCardData.f204081k << 3, 1);
                if (aVar.g() - 1 > i15) {
                    rVar.X(869155262);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                } else {
                    rVar.X(863408451);
                }
                rVar.R();
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(ka.a aVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(58180117, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.addPaymentsDashboardPendingPaymentsContent.<anonymous> (PaymentsDashboardScreen.kt:148)");
            }
            if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
                rVar.X(-1922850208);
                f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
                f3.c.Companion companion = f3.c.INSTANCE;
                f3.m mVarG = androidx.compose.foundation.layout.d.G(mVarH, companion.g(), false, 2, null);
                w0 w0VarI = d1.r.i(companion.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarG);
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
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                d1.x xVar = d1.x.f39368a;
                x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
                rVar.x();
            } else {
                rVar.X(-1928795667);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final void o(final e.a aVar, final ka.a<PaymentStatusCardData> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1006221430);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1006221430, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardContent (PaymentsDashboardScreen.kt:54)");
            }
            if (fr.t.c(aVar, e.a.C2103a.f89162a)) {
                rVarH.X(-611146117);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.Initialized)) {
                    rVarH.X(-611148007);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-611143762);
                q((e.a.Initialized) aVar, aVar2, rVarH, (i16 & 112) | (i16 & 14) | (ka.a.f109310f << 3));
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
            d5VarM.a(new er.p() { // from class: i42.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.p(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(e.a aVar, ka.a aVar2, int i15, p076m2.r rVar, int i16) {
        o(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final e.a.Initialized initialized, final ka.a<PaymentStatusCardData> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-535742766);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-535742766, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardInitializedContent (PaymentsDashboardScreen.kt:66)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1054323381, true, new er.q() { // from class: i42.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.r(y0VarC, initialized, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i42.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.y(initialized, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(y0 y0Var, final e.a.Initialized initialized, final ka.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        d3 d3Var2;
        int i16;
        if ((i15 & 6) == 0) {
            d3Var2 = d3Var;
            i16 = i15 | (rVar.W(d3Var2) ? 4 : 2);
        } else {
            d3Var2 = d3Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1054323381, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardInitializedContent.<anonymous>.<anonymous> (PaymentsDashboardScreen.kt:72)");
            }
            float top = d3Var2.getTop();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarH = a3.h(aVar2.b(rVar, i17).getSpacing200(), c5.h.n(top + aVar2.b(rVar, i17).getSpacing100()), aVar2.b(rVar, i17).getSpacing200(), c5.h.n(d3Var2.getBottom() + aVar2.b(rVar, i17).getSpacing200()));
            boolean zG = rVar.G(initialized) | rVar.G(aVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: i42.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.s(initialized, aVar, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(null, y0Var, d3VarH, false, null, null, null, false, null, (er.l) objE, rVar, 0, 505);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final e.a.Initialized initialized, ka.a aVar, q0 q0Var) {
        q0.c(q0Var, null, null, y2.m.b(-1340827818, true, new er.q() { // from class: i42.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.t(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        q0.c(q0Var, null, null, y2.m.b(834028223, true, new er.q() { // from class: i42.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.u(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        q0.c(q0Var, null, null, y2.m.b(413909278, true, new er.q() { // from class: i42.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.v(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        k42.a paymentsListContentData = initialized.getPaymentsListContentData();
        if (paymentsListContentData instanceof k42.a.NoPayments) {
            q0.c(q0Var, null, null, y2.m.b(-1554529186, true, new er.q() { // from class: i42.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.w(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            if (!(paymentsListContentData instanceof k42.a.WithPayments)) {
                throw new oq.p();
            }
            C(q0Var, aVar, (k42.a.WithPayments) initialized.getPaymentsListContentData());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(e.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1340827818, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardInitializedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsDashboardScreen.kt:82)");
            }
            o40.j.i(initialized.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(e.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(834028223, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardInitializedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsDashboardScreen.kt:86)");
            }
            h70.g.f(initialized.getShortcutsLayoutData(), rVar, ShortcutsLayoutData.f81324c);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(e.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(413909278, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardInitializedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsDashboardScreen.kt:90)");
            }
            Label paymentsListTitle = initialized.getPaymentsListTitle();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, paymentsListTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final e.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1554529186, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardInitializedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsDashboardScreen.kt:99)");
            }
            x30.c.c(null, 0.0f, y2.m.d(1843635101, true, new er.p() { // from class: i42.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.x(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(e.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1843635101, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardInitializedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsDashboardScreen.kt:100)");
            }
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            j70.h.g(null, null, ((k42.a.NoPayments) initialized.getPaymentsListContentData()).getNoPaymentsLabel(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33550331);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            x40.h.g(((k42.a.NoPayments) initialized.getPaymentsListContentData()).getGovSiteLinkData(), rVar, LinkData.f216731g);
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
    public static final i0 y(e.a.Initialized initialized, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        q(initialized, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void z(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1446650161);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1446650161, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.PaymentsDashboardScreen (PaymentsDashboardScreen.kt:44)");
            }
            o(A(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), ka.b.b(eVar.U2(), null, rVarH, 0, 1), rVarH, ka.a.f109310f << 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i42.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.B(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
