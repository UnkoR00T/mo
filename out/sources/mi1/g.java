package mi1;

import d1.a2;
import d1.c2;
import d1.e0;
import d1.l1;
import d1.r3;
import d1.z0;
import er.q;
import f3.j;
import f3.m;
import mx.Label;
import oq.i0;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lni1/a;", "slotData", "Loq/i0;", "g", "(Lni1/a;Lm2/r;I)V", "Lni1/a$a;", "i", "(Lni1/a$a;Lm2/r;I)V", "Lni1/a$b;", "k", "(Lni1/a$b;Lm2/r;I)V", "Lni1/a$d;", "m", "(Lni1/a$d;Lm2/r;I)V", "Lni1/a$c;", "p", "(Lni1/a$c;Lm2/r;I)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void g(final ni1.a aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1302732952);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1302732952, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.payments.PaymentsWidgetLargeSlot (PaymentsWidgetLargeSlot.kt:22)");
            }
            if (aVar instanceof ni1.a.Empty) {
                rVarH.X(2090888105);
                i((ni1.a.Empty) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof ni1.a.Error) {
                rVarH.X(2090891145);
                k((ni1.a.Error) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof ni1.a.Loading) {
                rVarH.X(2090894252);
                p((ni1.a.Loading) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof ni1.a.Payments)) {
                    rVarH.X(2090886452);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(2090897484);
                m((ni1.a.Payments) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mi1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.h(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(ni1.a aVar, int i15, r rVar, int i16) {
        g(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final ni1.a.Empty empty, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-775090461);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(empty) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-775090461, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.payments.PaymentsWidgetLargeSlotEmpty (PaymentsWidgetLargeSlot.kt:32)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = empty.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, empty.getDescription(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).f(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mi1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.j(empty, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ni1.a.Empty empty, int i15, r rVar, int i16) {
        i(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(final ni1.a.Error error, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-427334247);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(error) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-427334247, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.payments.PaymentsWidgetLargeSlotError (PaymentsWidgetLargeSlot.kt:48)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = error.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, error.getDescription(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).f(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mi1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.l(error, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(ni1.a.Error error, int i15, r rVar, int i16) {
        k(error, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final ni1.a.Payments payments, r rVar, final int i15) {
        int i16;
        r rVar2;
        final ni1.a.Payments payments2 = payments;
        r rVarH = rVar.h(-7960263);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(payments2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-7960263, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.payments.PaymentsWidgetLargeSlotPayments (PaymentsWidgetLargeSlot.kt:64)");
            }
            m.Companion companion = m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = payments2.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing150()), rVar2, 0);
            z0.h(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), iVar.h(), null, null, 0, 0, y2.m.d(-1874100290, true, new q() { // from class: mi1.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.n(payments, (l1) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, 1572918, 60);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing50()), rVar2, 0);
            payments2 = payments;
            j70.h.g(null, null, payments.getDescription(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).f(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mi1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.o(payments2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(ni1.a.Payments payments, l1 l1Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1874100290, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.payments.PaymentsWidgetLargeSlotPayments.<anonymous>.<anonymous> (PaymentsWidgetLargeSlot.kt:72)");
            }
            Label date = payments.getDate();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, date, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).e(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            j70.h.g(null, null, payments.getStatus(), null, null, payments.d().B(rVar, 0).m20unboximpl(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(ni1.a.Payments payments, int i15, r rVar, int i16) {
        m(payments, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void p(final ni1.a.Loading loading, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1943558021);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(loading) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1943558021, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.widget.payments.PaymentsWidgetLargetSlotLoading (PaymentsWidgetLargeSlot.kt:92)");
            }
            m mVarA = a2.a(m.INSTANCE, c2.Max);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarA);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2 = rVarH;
            j70.h.g(null, null, loading.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVarH, k70.a.f108865b).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mi1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.q(loading, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(ni1.a.Loading loading, int i15, r rVar, int i16) {
        p(loading, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
