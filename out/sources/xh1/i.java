package xh1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import zh1.MoreModel;
import zh1.MoreSection;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lxh1/d;", "viewModel", "Loq/i0;", "e", "(Lxh1/d;Lm2/r;I)V", "Lzh1/a;", "moreModel", "i", "(Lzh1/a;Lm2/r;I)V", "Lxh1/d$a;", "state", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void e(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1086421983);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1086421983, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.more.MoreScreen (MoreScreen.kt:31)");
            }
            i(f(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)).getModel(), rVarH, 0);
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(dVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: xh1.e
                    @Override // er.a
                    public final Object a() {
                        return i.g(dVar);
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
            d5VarM.a(new er.p() { // from class: xh1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data f(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(d dVar) {
        dVar.P();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d dVar, int i15, p076m2.r rVar, int i16) {
        e(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final MoreModel moreModel, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1122397590);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(moreModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1122397590, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.more.MoreScreenContent (MoreScreen.kt:42)");
            }
            rVar2 = rVarH;
            i50.s.r(moreModel.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2113308041, true, new er.q() { // from class: xh1.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.j(moreModel, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196992, 28670);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xh1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(moreModel, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(MoreModel moreModel, d3 d3Var, p076m2.r rVar, int i15) {
        p076m2.r rVar2 = rVar;
        char c15 = 2;
        int i16 = (i15 & 6) == 0 ? i15 | (rVar2.W(d3Var) ? 4 : 2) : i15;
        int i17 = 0;
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2113308041, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.more.MoreScreenContent.<anonymous> (MoreScreen.kt:47)");
            }
            Object obj = null;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVar2, k70.a.f108865b).getBase().a(), null, 2, null), null, rVar2, 0, 1), d3Var), rVar2, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2.X(-324535789);
            int i18 = 0;
            for (Object obj2 : moreModel.b()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    pq.v.x();
                }
                MoreSection moreSection = (MoreSection) obj2;
                if (i18 > 0) {
                    rVar2.X(638351502);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i17);
                } else {
                    rVar2.X(636111814);
                }
                rVar2.R();
                Label title = moreSection.getTitle();
                k70.a aVar = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i25).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i25).getSpacing200()), rVar2, 0);
                m30.i.d(moreSection.getItemsListData(), null, null, rVar2, 0, 6);
                i17 = 0;
                i18 = i19;
                c15 = 2;
                obj = null;
            }
            int i26 = i17;
            rVar2.R();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, i26);
            h0.v(moreModel.getLogoutItem(), null, rVar2, i26, 2);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(MoreModel moreModel, int i15, p076m2.r rVar, int i16) {
        i(moreModel, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
