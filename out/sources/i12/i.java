package i12;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import q4.TextStyle;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Li12/e;", "viewModel", "Loq/i0;", "d", "(Li12/e;Lm2/r;I)V", "Li12/e$a$b;", "state", "g", "(Li12/e$a$b;Lm2/r;I)V", "Li12/e$a;", "data", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void d(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(753597348);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(753597348, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.inboxfaq.InboxFaqScreen (InboxFaqScreen.kt:26)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            e.a aVarE = e(f6VarC);
            if (fr.t.c(aVarE, e.a.C2080a.f88311a)) {
                rVarH.X(-1642416056);
                rVarH.R();
            } else {
                if (!(aVarE instanceof e.a.Initialized)) {
                    rVarH.X(-1642417547);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1642414141);
                g((e.a.Initialized) e(f6VarC), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: i12.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a e(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(e eVar, int i15, p076m2.r rVar, int i16) {
        d(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1583957012);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1583957012, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.inboxfaq.InboxFaqScreenInitialized (InboxFaqScreen.kt:39)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(393006145, true, new er.q() { // from class: i12.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.h(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i12.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(393006145, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.inboxfaq.InboxFaqScreenInitialized.<anonymous> (InboxFaqScreen.kt:44)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            q4.e eVarN = u10.i.n(initialized.getFaqData(), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, null, null, eVarN, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.e(aVar.f(rVar, i17).b(), aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, false, false, null, rVar, 0, 0, 0, 33030127);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing400()), rVar, 0);
            c30.e.c(null, initialized.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        g(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
