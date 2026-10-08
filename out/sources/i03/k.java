package i03;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import i50.s;
import m70.TimelineData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Li03/d;", "viewModel", "Loq/i0;", "n", "(Li03/d;Lm2/r;I)V", "Li03/d$a$b;", "data", "j", "(Li03/d$a$b;Lm2/r;I)V", "Li03/d$a$a;", "g", "(Li03/d$a$a;Lm2/r;I)V", "Li03/d$a;", "screenData", "registeredaddress_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void g(final d.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-26298666);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-26298666, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.history.RegisteredAddressHistoryEmptyScreenContent (RegisteredAddressHistoryScreen.kt:62)");
            }
            rVar2 = rVarH;
            s.r(empty.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2083010557, true, new er.q() { // from class: i03.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.h(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: i03.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-2083010557, i15, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.history.RegisteredAddressHistoryEmptyScreenContent.<anonymous> (RegisteredAddressHistoryScreen.kt:66)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(empty.a(), null, null, rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d, 6);
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
    public static final i0 i(d.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        g(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1668136694);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1668136694, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.history.RegisteredAddressHistoryInitializedScreenContent (RegisteredAddressHistoryScreen.kt:37)");
            }
            rVar2 = rVarH;
            s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1278380893, true, new er.q() { // from class: i03.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.k(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: i03.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.m(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1278380893, i15, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.history.RegisteredAddressHistoryInitializedScreenContent.<anonymous> (RegisteredAddressHistoryScreen.kt:39)");
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
            c30.b.e incompleteDataAlert = initialized.getIncompleteDataAlert();
            if (incompleteDataAlert == null) {
                rVar.X(-507111750);
            } else {
                rVar.X(-507111749);
                c30.e.c(null, incompleteDataAlert, rVar, c30.b.e.f22961j << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            }
            rVar.R();
            x30.c.c(null, 0.0f, y2.m.d(880783674, true, new er.p() { // from class: i03.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
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
    public static final i0 l(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(880783674, i15, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.history.RegisteredAddressHistoryInitializedScreenContent.<anonymous>.<anonymous>.<anonymous> (RegisteredAddressHistoryScreen.kt:51)");
            }
            m70.f.g(initialized.getTimelineData(), rVar, TimelineData.f124016b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1785697421);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1785697421, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.history.RegisteredAddressHistoryScreen (RegisteredAddressHistoryScreen.kt:25)");
            }
            d.a aVarO = o(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarO instanceof d.a.Empty) {
                rVarH.X(1931704554);
                g((d.a.Empty) aVarO, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarO instanceof d.a.Initialized)) {
                    rVarH.X(1931701998);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1931708349);
                j((d.a.Initialized) aVarO, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: i03.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a o(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(d dVar, int i15, p076m2.r rVar, int i16) {
        n(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
