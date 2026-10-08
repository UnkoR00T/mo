package to1;

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
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lto1/h;", "viewModel", "Loq/i0;", "e", "(Lto1/h;Lm2/r;I)V", "Lto1/h$a$a;", "data", "h", "(Lto1/h$a$a;Lm2/r;I)V", "Lto1/h$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void e(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1239686016);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1239686016, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.database.DeveloperDatabaseScreen (DeveloperDatabaseScreen.kt:25)");
            }
            h.a aVarF = f(m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarF instanceof h.a.DeveloperDatabaseData)) {
                rVarH.X(1632324954);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(1632328019);
            h((h.a.DeveloperDatabaseData) aVarF, rVarH, 0);
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: to1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.g(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.a f(f6<? extends h.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(h hVar, int i15, p076m2.r rVar, int i16) {
        e(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final h.a.DeveloperDatabaseData developerDatabaseData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1667528482);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(developerDatabaseData) : rVarH.G(developerDatabaseData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1667528482, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.database.DeveloperDatabaseScreenContent (DeveloperDatabaseScreen.kt:35)");
            }
            rVar2 = rVarH;
            i50.s.r(developerDatabaseData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(748938257, true, new er.q() { // from class: to1.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.i(developerDatabaseData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: to1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.k(developerDatabaseData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final h.a.DeveloperDatabaseData developerDatabaseData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(748938257, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.database.DeveloperDatabaseScreenContent.<anonymous> (DeveloperDatabaseScreen.kt:37)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
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
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, developerDatabaseData.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, developerDatabaseData.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h30.q.p(developerDatabaseData.getSaveAButton(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h30.q.p(developerDatabaseData.getSaveBButton(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h30.q.p(developerDatabaseData.getLoadBButton(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h30.q.p(developerDatabaseData.getClearDbButton(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, developerDatabaseData.getIds(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, developerDatabaseData.getLastLog(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            rVar.x();
            boolean zG = rVar.G(developerDatabaseData);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: to1.l
                    @Override // er.a
                    public final Object a() {
                        return n.j(developerDatabaseData);
                    }
                };
                rVar.v(objE);
            }
            q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(h.a.DeveloperDatabaseData developerDatabaseData) {
        developerDatabaseData.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(h.a.DeveloperDatabaseData developerDatabaseData, int i15, p076m2.r rVar, int i16) {
        h(developerDatabaseData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
