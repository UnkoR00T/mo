package gt2;

import d1.a3;
import d1.d3;
import d1.h0;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import k40.EmptyStateData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lgt2/e;", "viewModel", "Loq/i0;", "w", "(Lgt2/e;Lm2/r;I)V", "Lgt2/e$a;", "screenData", "Lka/a;", "Lit2/b;", "restrictionHistoryItems", "k", "(Lgt2/e$a;Lka/a;Lm2/r;I)V", "Lgt2/e$a$b;", "m", "(Lgt2/e$a$b;Lka/a;Lm2/r;I)V", "p", "peselrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {
    public static final void k(final e.a aVar, final ka.a<it2.b> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(691610023);
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
                p076m2.t.o(691610023, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.list.PeselRestrictionHistoryContent (PeselRestrictionHistoryScreen.kt:54)");
            }
            if (fr.t.c(aVar, e.a.C1736a.f76792a)) {
                rVarH.X(-1082690901);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.Initialized)) {
                    rVarH.X(-1082692996);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1082688660);
                m((e.a.Initialized) aVar, aVar2, rVarH, (i16 & 112) | (i16 & 14) | (ka.a.f109310f << 3));
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
            d5VarM.a(new er.p() { // from class: gt2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.l(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e.a aVar, ka.a aVar2, int i15, p076m2.r rVar, int i16) {
        k(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final e.a.Initialized initialized, final ka.a<it2.b> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1237840731);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1237840731, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.list.PeselRestrictionHistoryDisplayedScreen (PeselRestrictionHistoryScreen.kt:68)");
            }
            if (fr.t.c(aVar.i().getRefresh(), ja.w.Loading.f101205b)) {
                rVarH.X(-1813123953);
                x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(-1813045213);
                rVar2 = rVarH;
                i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(65342512, true, new er.q() { // from class: gt2.h
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return p.n(initialized, initialized, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
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
            d5VarM.a(new er.p() { // from class: gt2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.o(initialized, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e.a.Initialized initialized, e.a.Initialized initialized2, ka.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(65342512, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.list.PeselRestrictionHistoryDisplayedScreen.<anonymous>.<anonymous> (PeselRestrictionHistoryScreen.kt:75)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(w0.i.d(mVarF, aVar2.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing100(), aVar2.b(rVar, i17).getSpacing200(), 0.0f, 8, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            y30.n.Switch controllersData = initialized.getControllersData();
            int i18 = y30.n.Switch.f223693f;
            y30.m.g(controllersData, rVar, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing100()), rVar, 0);
            p(initialized2, aVar, rVar, InputDateTimeData.f203769m | i18 | IconPageData.f164667h | EmptyStateData.f108236d | BaseScaffoldData.f89350g | (ka.a.f109310f << 3));
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
    public static final i0 o(e.a.Initialized initialized, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        m(initialized, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final e.a.Initialized initialized, final ka.a<it2.b> aVar, p076m2.r rVar, final int i15) {
        int i16;
        d5 d5VarM;
        er.p<? super p076m2.r, ? super Integer, i0> pVar;
        p076m2.r rVarH = rVar.h(-430244216);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-430244216, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.list.PeselRestrictionHistoryDisplayedScreenContent (PeselRestrictionHistoryScreen.kt:101)");
            }
            if (aVar.g() != 0 || initialized.getIsFilterEnabled()) {
                rVarH.X(-1797104236);
                rVarH.R();
                f3.m.Companion companion = f3.m.INSTANCE;
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, companion);
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
                p076m2.r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                d1.i0 i0Var = d1.i0.f39176a;
                k70.a aVar2 = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                d3 d3VarI = a3.i(0.0f, aVar2.b(rVarH, i17).getSpacing100(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 5, null);
                boolean zG = rVarH.G(initialized);
                if ((i16 & 112) != 32 && ((i16 & 64) == 0 || !rVarH.G(aVar))) {
                    z15 = false;
                }
                boolean z16 = zG | z15;
                Object objE = rVarH.E();
                if (z16 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: gt2.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return p.r(aVar, initialized, (q0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f1.d.c(null, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 507);
                if (aVar.g() == 0) {
                    rVarH.X(1127137490);
                    k40.d.c(h0.b(i0Var, companion, 1.0f, false, 2, null), initialized.getNoFilteredRecordsData(), rVarH, EmptyStateData.f108236d << 3, 0);
                } else {
                    rVarH.X(1120736362);
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.X(-1792824996);
                q40.i.b(initialized.c(), null, null, rVarH, IconPageData.f164667h, 6);
                rVarH.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                d5VarM = rVarH.m();
                if (d5VarM == null) {
                    return;
                } else {
                    pVar = new er.p() { // from class: gt2.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return p.q(initialized, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            d5VarM.a(pVar);
        }
        rVarH.O();
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            pVar = new er.p() { // from class: gt2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.v(initialized, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            };
            d5VarM.a(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(e.a.Initialized initialized, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        p(initialized, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final ka.a aVar, final e.a.Initialized initialized, q0 q0Var) {
        q0.c(q0Var, null, null, y2.m.b(-435456733, true, new er.q() { // from class: gt2.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p.s(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        q0.e(q0Var, aVar.g(), null, null, y2.m.b(1348321914, true, new er.r() { // from class: gt2.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p.u(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
            q0.c(q0Var, null, null, b.f76758a.b(), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(e.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-435456733, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.list.PeselRestrictionHistoryDisplayedScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionHistoryScreen.kt:113)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.b bVarG = companion2.g();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
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
            Label functionalityExplanationText = initialized.getFunctionalityExplanationText();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, functionalityExplanationText, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026043);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            rVar.x();
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: gt2.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.t((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarD);
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
            v40.i.h(initialized.getDateInputData(), rVar, InputDateTimeData.f203769m);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
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
    public static final i0 t(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        p076m2.r rVar2 = rVar;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar2.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar2.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1348321914, i17, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.list.PeselRestrictionHistoryDisplayedScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionHistoryScreen.kt:131)");
            }
            it2.b bVar = (it2.b) aVar.f(i15);
            if (bVar == null) {
                rVar2.X(1324061036);
            } else {
                rVar2.X(1324061037);
                if (bVar instanceof it2.b.C2272b) {
                    rVar2.X(1878475959);
                    if (i15 != 0) {
                        rVar2.X(476238744);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    } else {
                        rVar2.X(1873069621);
                    }
                    rVar2.R();
                    Label date = ((it2.b.C2272b) bVar).getDate();
                    k70.a aVar2 = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    j70.h.g(null, null, date, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                    rVar2 = rVar;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
                    rVar2.R();
                } else {
                    if (!(bVar instanceof it2.b.a)) {
                        rVar2.X(476235302);
                        rVar2.R();
                        throw new oq.p();
                    }
                    rVar2.X(1878890863);
                    n50.h0.v(((it2.b.a) bVar).getCardItemData(), null, rVar2, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
                    rVar2.R();
                }
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(e.a.Initialized initialized, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        p(initialized, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void w(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(862209516);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(862209516, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.history.list.PeselRestrictionHistoryScreen (PeselRestrictionHistoryScreen.kt:41)");
            }
            k(x(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), ka.b.b(eVar.A8(), null, rVarH, 0, 1), rVarH, ka.a.f109310f << 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gt2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.y(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a x(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(e eVar, int i15, p076m2.r rVar, int i16) {
        w(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
