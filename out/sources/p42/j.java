package p42;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.m3;
import d1.q3;
import d1.x;
import f1.q0;
import i50.BaseScaffoldData;
import ja.w;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import q40.IconPageData;
import v60.PaymentStatusCardData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lp42/c;", "viewModel", "Loq/i0;", "m", "(Lp42/c;Lm2/r;I)V", "Lp42/c$a;", "screenData", "Lka/a;", "Lv60/a;", "pagingItems", "g", "(Lp42/c$a;Lka/a;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void g(final c.Data data, final ka.a<PaymentStatusCardData> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(241521930);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(241521930, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.history.PaymentsHistoryContent (PaymentsHistoryScreen.kt:46)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-480578741, true, new er.q() { // from class: p42.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.h(aVar, data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: p42.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(data, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final ka.a aVar, c.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-480578741, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.history.PaymentsHistoryContent.<anonymous>.<anonymous> (PaymentsHistoryScreen.kt:51)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(companion, d3Var), rVar, 0);
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
            d1.i0 i0Var = d1.i0.f39176a;
            if (fr.t.c(aVar.i().getRefresh(), w.Loading.f101205b)) {
                rVar.X(1858777752);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                w0 w0VarB = m3.b(iVar.e(), companion2.i(), rVar, 54);
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
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var = q3.f39261a;
                x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
                rVar.x();
                rVar.R();
            } else {
                rVar.X(1859044166);
                if (aVar.g() == 0) {
                    rVar.X(1859058891);
                    q40.i.b(data.b(), null, null, rVar, IconPageData.f164667h, 6);
                    rVar.R();
                } else {
                    rVar.X(1859153162);
                    k70.a aVar2 = k70.a.f108864a;
                    int i17 = k70.a.f108865b;
                    d1.i.f fVarR = iVar.r(aVar2.b(rVar, i17).getSpacing100());
                    d3 d3VarI = a3.i(0.0f, 0.0f, 0.0f, aVar2.b(rVar, i17).getSpacing200(), 7, null);
                    boolean zG = rVar.G(aVar);
                    Object objE = rVar.E();
                    if (zG || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.l() { // from class: p42.g
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.i(aVar, (q0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f1.d.c(null, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVar, 0, 491);
                    rVar.R();
                }
                rVar.R();
            }
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
    public static final i0 i(final ka.a aVar, q0 q0Var) {
        q0.e(q0Var, aVar.g(), null, null, y2.m.b(967110695, true, new er.r() { // from class: p42.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return j.j(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        q0.c(q0Var, null, null, y2.m.b(-742620450, true, new er.q() { // from class: p42.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return j.k(aVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        if ((i16 & 48) == 0) {
            i16 |= rVar.c(i15) ? 32 : 16;
        }
        if (rVar.r((i16 & 145) != 144, i16 & 1)) {
            if (t.k()) {
                t.o(967110695, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.history.PaymentsHistoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsHistoryScreen.kt:73)");
            }
            PaymentStatusCardData paymentStatusCardData = (PaymentStatusCardData) aVar.f(i15);
            if (paymentStatusCardData == null) {
                rVar.X(554148110);
            } else {
                rVar.X(554148111);
                v60.i.h(null, paymentStatusCardData, rVar, PaymentStatusCardData.f204081k << 3, 1);
            }
            rVar.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(ka.a aVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-742620450, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.history.PaymentsHistoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsHistoryScreen.kt:78)");
            }
            if (fr.t.c(aVar.i().getAppend(), w.Loading.f101205b)) {
                rVar.X(-29204985);
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
                x xVar = x.f39368a;
                x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
                rVar.x();
            } else {
                rVar.X(-32486428);
            }
            rVar.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.Data data, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        g(data, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(856454863);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(856454863, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.history.PaymentsHistoryScreen (PaymentsHistoryScreen.kt:35)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            g(n(f6VarC), ka.b.b(cVar.o5(), null, rVarH, 0, 1), rVarH, BaseScaffoldData.f89350g | IconPageData.f164667h | (ka.a.f109310f << 3));
            p088nul.q0.g(false, n(f6VarC).c(), rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p42.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.o(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data n(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c cVar, int i15, p076m2.r rVar, int i16) {
        m(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
