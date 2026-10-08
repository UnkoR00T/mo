package xa2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\b0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lxa2/o;", "viewModel", "Loq/i0;", "p", "(Lxa2/o;Lm2/r;I)V", "Li50/a;", "scaffoldData", "", "Loq/r;", "Lmx/a;", "Ln50/k;", "sections", "t", "(Li50/a;Ljava/util/List;Lm2/r;I)V", "Lxa2/o$a$a;", "state", "m", "(Lxa2/o$a$a;Lm2/r;I)V", AnnotatedPrivateKey.LABEL, "k", "(Lmx/a;Lm2/r;I)V", "Lxa2/o$a;", "viewModelState", "history_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void k(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-499047369);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-499047369, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.verification.DateHeader (VerificationHistoryScreen.kt:111)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(a3.r(f3.m.INSTANCE, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i17).getSpacing150(), 7, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).h(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030138);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xa2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Label label, int i15, p076m2.r rVar, int i16) {
        k(label, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final o.a.Initial initial, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(488534412);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initial) : rVarH.G(initial) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(488534412, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.verification.VerificationHistoryEmptyScreen (VerificationHistoryScreen.kt:94)");
            }
            rVar2 = rVarH;
            i50.s.r(initial.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-304480897, true, new er.q() { // from class: xa2.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.n(initial, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: xa2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(initial, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(o.a.Initial initial, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-304480897, i15, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.verification.VerificationHistoryEmptyScreen.<anonymous> (VerificationHistoryScreen.kt:98)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(w0.i.d(a3.l(f3.m.INSTANCE, d3Var), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null), 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVar, 6);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(initial.a(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 o(o.a.Initial initial, int i15, p076m2.r rVar, int i16) {
        m(initial, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final o oVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1759387883);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(oVar) : rVarH.G(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1759387883, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.verification.VerificationHistoryScreen (VerificationHistoryScreen.kt:35)");
            }
            o.a aVarQ = q(m7.b.c(oVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarQ instanceof o.a.Initialized) {
                rVarH.X(1445365734);
                o.a.Initialized initialized = (o.a.Initialized) aVarQ;
                t(initialized.getScaffoldData(), initialized.b(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else {
                if (!(aVarQ instanceof o.a.Initial)) {
                    rVarH.X(1445363555);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1445370402);
                m((o.a.Initial) aVarQ, rVarH, 0);
                rVarH.R();
            }
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(oVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: xa2.i
                    @Override // er.a
                    public final Object a() {
                        return k.r(oVar);
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
            d5VarM.a(new er.p() { // from class: xa2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.s(oVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final o.a q(f6<? extends o.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(o oVar) {
        oVar.d();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(o oVar, int i15, p076m2.r rVar, int i16) {
        p(oVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(final BaseScaffoldData baseScaffoldData, final List<? extends oq.r<Label, ? extends List<? extends n50.k>>> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-938058507);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(baseScaffoldData) : rVarH.G(baseScaffoldData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(list) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-938058507, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.verification.VerificationHistoryScreenContent (VerificationHistoryScreen.kt:56)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            rVar2 = rVarH;
            i50.s.r(baseScaffoldData, null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1885756696, true, new er.q() { // from class: xa2.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.u(y0VarC, list, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | (i16 & 14), 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xa2.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.y(baseScaffoldData, list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(y0 y0Var, final List list, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1885756696, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.verification.VerificationHistoryScreenContent.<anonymous> (VerificationHistoryScreen.kt:62)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(list);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: xa2.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.v(list, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(null, y0Var, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 505);
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
    public static final i0 v(List list, f1.q0 q0Var) {
        final int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            final oq.r rVar = (oq.r) obj;
            f1.q0.c(q0Var, null, null, y2.m.b(-1750504800, true, new er.q() { // from class: xa2.f
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return k.w(i15, rVar, (f1.e) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }), 3, null);
            f1.q0.c(q0Var, null, null, y2.m.b(-1774228855, true, new er.q() { // from class: xa2.g
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return k.x(rVar, (f1.e) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }), 3, null);
            i15 = i16;
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(int i15, oq.r rVar, f1.e eVar, p076m2.r rVar2, int i16) {
        if (rVar2.r((i16 & 17) != 16, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1750504800, i16, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.verification.VerificationHistoryScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationHistoryScreen.kt:77)");
            }
            if (i15 != 0) {
                rVar2.X(1392068258);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
            } else {
                rVar2.X(201513602);
            }
            rVar2.R();
            k((Label) rVar.c(), rVar2, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(oq.r rVar, f1.e eVar, p076m2.r rVar2, int i15) {
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1774228855, i15, -1, "pl.gov.coi.mobywatel.feature.history.presentation.screens.verification.VerificationHistoryScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationHistoryScreen.kt:81)");
            }
            m30.i.d(new CardListData((List) rVar.d(), null, false, null, null, 30, null), null, null, rVar2, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(BaseScaffoldData baseScaffoldData, List list, int i15, p076m2.r rVar, int i16) {
        t(baseScaffoldData, list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
