package aq1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0013\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Laq1/l;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "close", "k", "(Laq1/l;Ler/a;Lm2/r;I)V", "Laq1/l$c;", "data", "Ld1/d3;", "paddingValues", "w", "(Laq1/l$c;Ld1/d3;Lm2/r;I)V", "", "Lmx/a;", "items", "Lkotlin/Function1;", "", "onItemSelected", "t", "(Ljava/util/List;Ler/l;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void k(final l lVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1106590780);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(lVar) : rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1106590780, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.dropdownbutton.DeveloperDropDownButtonScreen (DeveloperDropDownButtonScreen.kt:32)");
            }
            final f6 f6VarC = m7.b.c(lVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            i50.s.r(new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), mx.b.b("DropDown Button 1.1.0", ""), null, null, null, 28, null), null, null, null, null, 60, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1834695759, true, new er.q() { // from class: aq1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.m(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: aq1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.s(lVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final l.State l(f6<l.State> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final f6 f6Var, final d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1834695759, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.dropdownbutton.DeveloperDropDownButtonScreen.<anonymous> (DeveloperDropDownButtonScreen.kt:47)");
            }
            Label labelB = mx.b.b("Modal sheet", "");
            v sheetValue = l(f6Var).getSheetValue();
            boolean zW = rVar.W(f6Var);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: aq1.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.n(f6Var, (v) obj);
                    }
                };
                rVar.v(objE);
            }
            ModalSheetState modalSheetState = new ModalSheetState(sheetValue, false, (er.l) objE);
            boolean zW2 = rVar.W(f6Var);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: aq1.b
                    @Override // er.a
                    public final Object a() {
                        return k.o(f6Var);
                    }
                };
                rVar.v(objE2);
            }
            g30.t.f(new ModalBottomSheetData(modalSheetState, labelB, (er.a) objE2, null, 8, null), k70.a.f108864a.b(rVar, k70.a.f108865b).getZero(), false, null, null, y2.m.d(-884160310, true, new er.p() { // from class: aq1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), y2.m.d(1991482955, true, new er.p() { // from class: aq1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.r(d3Var, f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 1769472 | ModalBottomSheetData.f70192e, 28);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(f6 f6Var, v vVar) {
        l(f6Var).g().b(vVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(f6 f6Var) {
        l(f6Var).g().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-884160310, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.dropdownbutton.DeveloperDropDownButtonScreen.<anonymous>.<anonymous> (DeveloperDropDownButtonScreen.kt:62)");
            }
            l.OpenedDropDownState openedDropDownState = l(f6Var).getOpenedDropDownState();
            if (openedDropDownState == null) {
                rVar.X(1014675613);
            } else {
                rVar.X(1014675614);
                List<Label> listG = openedDropDownState.getDropDownData().g();
                boolean zW = rVar.W(f6Var);
                Object objE = rVar.E();
                if (zW || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: aq1.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return k.q(f6Var, ((Integer) obj).intValue());
                        }
                    };
                    rVar.v(objE);
                }
                t(listG, (er.l) objE, rVar, 0);
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
    public static final i0 q(f6 f6Var, int i15) {
        l(f6Var).f().b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(d3 d3Var, f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1991482955, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.dropdownbutton.DeveloperDropDownButtonScreen.<anonymous>.<anonymous> (DeveloperDropDownButtonScreen.kt:73)");
            }
            w(l(f6Var), d3Var, rVar, DropDownButtonData.f99359i);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        k(lVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(final List<Label> list, final er.l<? super Integer, i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        final er.l<? super Integer, i0> lVar2 = lVar;
        p076m2.r rVarH = rVar.h(-1009388843);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(list) ? 4 : 2);
        } else {
            i16 = i15;
        }
        int i17 = 32;
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar2) ? 32 : 16;
        }
        int i18 = 1;
        int i19 = 0;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1009388843, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.dropdownbutton.DropDownBottomSheetContent (DeveloperDropDownButtonScreen.kt:113)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVarH.X(-15837848);
            Iterator it = list.iterator();
            final int i25 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i26 = i25 + 1;
                if (i25 < 0) {
                    pq.v.x();
                }
                Label label = (Label) next;
                f3.m.Companion companion2 = f3.m.INSTANCE;
                f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, i18, null);
                k70.a aVar = k70.a.f108864a;
                int i27 = k70.a.f108865b;
                f3.m mVarD = w0.i.d(mVarH, aVar.a(rVarH, i27).getBase().a(), null, 2, null);
                int i28 = ((i16 & 112) == i17 ? i18 : i19) | (rVarH.c(i25) ? 1 : 0);
                Object objE = rVarH.E();
                if (i28 != 0 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: aq1.g
                        @Override // er.a
                        public final Object a() {
                            return k.u(lVar2, i25);
                        }
                    };
                    rVarH.v(objE);
                }
                p076m2.r rVar2 = rVarH;
                int i29 = i19;
                j70.h.g(androidx.compose.foundation.b.n(mVarD, false, null, null, null, (er.a) objE, 15, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i27).c(), null, null, false, false, null, rVar2, 0, 0, 0, 33030138);
                rVarH = rVar2;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i27).getSpacing100()), rVarH, i29);
                lVar2 = lVar;
                it = it;
                i19 = i29;
                i25 = i26;
                i16 = i16;
                i17 = i17;
                i18 = i18;
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: aq1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.v(list, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(er.l lVar, int i15) {
        lVar.b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(List list, er.l lVar, int i15, p076m2.r rVar, int i16) {
        t(list, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void w(final l.State state, final d3 d3Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-972028314);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(state) : rVarH.G(state) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(d3Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-972028314, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.dropdownbutton.DropDownScreenContent (DeveloperDropDownButtonScreen.kt:84)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(mVarL, aVar.b(rVarH, i17).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            j70.h.g(null, null, mx.b.b("Screen content", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing150()), rVarH, 0);
            DropDownButtonData dropDownData1 = state.getDropDownData1();
            int i18 = DropDownButtonData.f99359i;
            j40.l.m(dropDownData1, rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing150()), rVarH, 0);
            j40.l.m(state.getDropDownData2(), rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing150()), rVarH, 0);
            j40.l.m(state.getDropDownData3(), rVarH, i18);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: aq1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.x(state, d3Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(l.State state, d3 d3Var, int i15, p076m2.r rVar, int i16) {
        w(state, d3Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
