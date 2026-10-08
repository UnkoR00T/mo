package op1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.d3;
import d1.e0;
import d1.x;
import er.p;
import er.q;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.m;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lg30/v;", "modalSheetValue", "Lkotlin/Function0;", "Loq/i0;", "close", "j", "(Lg30/v;Ler/a;Lm2/r;II)V", "showBottomSheet", "Ld1/d3;", "paddingValues", "r", "(Ler/a;Ld1/d3;Lm2/r;I)V", "t", "(Lm2/r;I)V", "sheetValue", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void j(v vVar, final er.a<i0> aVar, r rVar, final int i15, final int i16) {
        int i17;
        final v vVar2;
        r rVarH = rVar.h(112772666);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.c(vVar == null ? -1 : vVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            vVar2 = i18 != 0 ? v.HIDDEN : vVar;
            if (t.k()) {
                t.o(112772666, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomsheet3.DeveloperBottomSheet3Screen (DeveloperBottomSheet3Screen.kt:50)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(vVar2, null, 2, null);
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) objE;
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), mx.b.b("ModalBottomSheet Material 3.0 (1.1.0)", ""), null, null, null, 28, null), null, null, null, null, 61, null);
            Label labelB = mx.b.b("Bottom Sheet Material3 (1.1.0)", "");
            v vVarK = k(a3Var);
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.l() { // from class: op1.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.m(a3Var, (v) obj);
                    }
                };
                rVarH.v(objE2);
            }
            ModalSheetState modalSheetState = new ModalSheetState(vVarK, true, (er.l) objE2);
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new er.a() { // from class: op1.i
                    @Override // er.a
                    public final Object a() {
                        return l.n(a3Var);
                    }
                };
                rVarH.v(objE3);
            }
            m.j(new ModalBottomSheetData(modalSheetState, labelB, (er.a) objE3, null, 8, null), baseScaffoldData, k70.a.f108864a.b(rVarH, k70.a.f108865b).getZero(), null, null, null, b.f148066a.b(), y2.m.d(1411715587, true, new q() { // from class: op1.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.o(a3Var, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14155776 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 56);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            vVar2 = vVar;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: op1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.q(vVar2, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final v k(a3<v> a3Var) {
        return a3Var.getValue();
    }

    private static final void l(a3<v> a3Var, v vVar) {
        a3Var.setValue(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(a3 a3Var, v vVar) {
        l(a3Var, vVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(a3 a3Var) {
        l(a3Var, v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final a3 a3Var, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1411715587, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomsheet3.DeveloperBottomSheet3Screen.<anonymous> (DeveloperBottomSheet3Screen.kt:79)");
            }
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: op1.c
                    @Override // er.a
                    public final Object a() {
                        return l.p(a3Var);
                    }
                };
                rVar.v(objE);
            }
            r((er.a) objE, d3Var, rVar, ((i15 << 3) & 112) | 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(a3 a3Var) {
        l(a3Var, v.EXPANDED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(v vVar, er.a aVar, int i15, int i16, r rVar, int i17) {
        j(vVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void r(final er.a<i0> aVar, final d3 d3Var, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(2005066766);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(d3Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(2005066766, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomsheet3.ScreenContent (DeveloperBottomSheet3Screen.kt:93)");
            }
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = s.n(t70.i.S(d1.a3.l(w0.i.d(mVarF, aVar2.a(rVarH, i17).getBase().a(), null, 2, null), d3Var), null, rVarH, 0, 1), rVarH, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.r(aVar2.b(rVarH, i17).getSpacing300()), bVarG, rVarH, 48);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2 = rVarH;
            j70.h.g(null, null, mx.b.b("ModalBottomSheet", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).q(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            j70.h.g(null, null, mx.b.b("Bottom sheet służy do wyświetlania dodatkowych opcji lub informacji. Pojawia się z dołu ekranu, zapewniając użytkownikowi łatwy dostęp do dodatkowych funkcji, bez konieczności przechodzenia między ekranami.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            j70.h.g(null, null, mx.b.b("Przykład użycia:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Toggle", ""), null, 2, null), k30.d.a.f107773a, null, aVar, 35, null), false, null, rVar2, 0, 6);
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
            d5VarM.a(new p() { // from class: op1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(aVar, d3Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(er.a aVar, d3 d3Var, int i15, r rVar, int i16) {
        r(aVar, d3Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(r rVar, final int i15) {
        r rVarH = rVar.h(1771312452);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(1771312452, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomsheet3.SheetContent (DeveloperBottomSheet3Screen.kt:134)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            n50.w0.StatusBadge statusBadge = new n50.w0.StatusBadge(new r50.a.WithIcon(null, mx.b.b("Zrealizowano", ""), null, 0, false, r50.g.NEGATIVE, 29, null));
            BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b("Opłata za przekształcenie gruntów Gminy Lublin", ""), null, null, 3, null)), null, 5, null);
            BottomSection bottomSection = new BottomSection(n50.l.b(mx.b.b("Zapłać:", ""), null, null, 3, null), n50.l.b(mx.b.b("366,00 zł", ""), null, null, 3, null));
            boolean zG = rVarH.G(context);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: op1.e
                    @Override // er.a
                    public final Object a() {
                        return l.u(context);
                    }
                };
                rVarH.v(objE);
            }
            DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, (er.a) objE, false, null, null, false, null, statusBadge, bodySection, null, null, bottomSection, 1661, null);
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h0.v(defaultSingleCardData, null, rVarH, 0, 2);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = d1.a3.r(companion, aVar.b(rVarH, i16).getSpacing200(), 0.0f, aVar.b(rVarH, i16).getSpacing200(), aVar.b(rVarH, i16).getSpacing200(), 2, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            x xVar = x.f39368a;
            k30.d.a aVar2 = k30.d.a.f107773a;
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.c.WithText withText = new k30.c.WithText(mx.b.b("Do zapłaty", ""), null, 2, null);
            boolean zG2 = rVarH.G(context);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: op1.f
                    @Override // er.a
                    public final Object a() {
                        return l.v(context);
                    }
                };
                rVarH.v(objE2);
            }
            h30.q.p(new ButtonData(null, null, large, withText, aVar2, null, (er.a) objE2, 35, null), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: op1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.w(i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Context context) {
        s.M(context, "CardStatus clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Context context) {
        s.M(context, "CardStatus button primary clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(int i15, r rVar, int i16) {
        t(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
