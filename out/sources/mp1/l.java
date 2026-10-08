package mp1;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.e0;
import d1.r3;
import d1.x;
import er.p;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import h30.q;
import i30.ButtonIconData;
import mx.Label;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;
import t70.s;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lg30/v;", "modalSheetValue", "Lkotlin/Function0;", "Loq/i0;", "close", "j", "(Lg30/v;Ler/a;Lm2/r;II)V", "showBottomSheet", "r", "(Ler/a;Ler/a;Lm2/r;I)V", "t", "(Lm2/r;I)V", "sheetValue", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127480a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1287283000);
            if (t.k()) {
                t.o(1287283000, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomSheet.ScreenContent.<anonymous>.<anonymous> (DeveloperBottomSheetScreen.kt:91)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void j(v vVar, final er.a<i0> aVar, r rVar, final int i15, final int i16) {
        int i17;
        final v vVar2;
        r rVarH = rVar.h(-791895611);
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
                t.o(-791895611, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomSheet.DeveloperBottomSheetScreen (DeveloperBottomSheetScreen.kt:51)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(vVar2, null, 2, null);
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) objE;
            Label labelB = mx.b.b("Bottom Sheet (1.1.0)", "");
            v vVarK = k(a3Var);
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.l() { // from class: mp1.h
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
                objE3 = new er.a() { // from class: mp1.i
                    @Override // er.a
                    public final Object a() {
                        return l.n(a3Var);
                    }
                };
                rVarH.v(objE3);
            }
            g30.t.f(new ModalBottomSheetData(modalSheetState, labelB, (er.a) objE3, null, 8, null), k70.a.f108864a.b(rVarH, k70.a.f108865b).getZero(), false, null, null, b.f127463a.b(), m.d(-951895073, true, new p() { // from class: mp1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(aVar, a3Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 28);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            vVar2 = vVar;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: mp1.k
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
    public static final i0 o(er.a aVar, final a3 a3Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-951895073, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomSheet.DeveloperBottomSheetScreen.<anonymous> (DeveloperBottomSheetScreen.kt:71)");
            }
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: mp1.c
                    @Override // er.a
                    public final Object a() {
                        return l.p(a3Var);
                    }
                };
                rVar.v(objE);
            }
            r(aVar, (er.a) objE, rVar, 48);
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

    public static final void r(final er.a<i0> aVar, er.a<i0> aVar2, r rVar, final int i15) {
        int i16;
        r rVar2;
        final er.a<i0> aVar3 = aVar2;
        r rVarH = rVar.h(1046659857);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(aVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar3) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1046659857, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomSheet.ScreenContent (DeveloperBottomSheetScreen.kt:85)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
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
            n.g(null, null, mx.b.b("Bottom Sheet (1.1.0)", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f127480a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            f3.c.b bVarG = companion2.g();
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar4 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(d1.a3.r(w0.i.d(mVarF, aVar4.a(rVarH, i17).getBase().a(), null, 2, null), aVar4.b(rVarH, i17).getSpacing200(), 0.0f, aVar4.b(rVarH, i17).getSpacing200(), 0.0f, 10, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarG, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar4.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("ModalBottomSheet", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar4.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Bottom sheet służy do wyświetlania dodatkowych opcji lub informacji. Pojawia się z dołu ekranu, zapewniając użytkownikowi łatwy dostęp do dodatkowych funkcji, bez konieczności przechodzenia między ekranami.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVarH, i17).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar4.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Przykład użycia:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar4.b(rVarH, i17).getSpacing300()), rVarH, 0);
            aVar3 = aVar2;
            q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Toggle", ""), null, 2, null), k30.d.a.f107773a, null, aVar2, 35, null), false, null, rVarH, 0, 6);
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar4.b(rVar2, i17).getSpacing300()), rVar2, 0);
            vb.h(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), aVar4.b(rVar2, i17).getStrokeWidth(), aVar4.a(rVar2, i17).getNeutral().b(), rVar2, 6, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar4.b(rVar2, i17).getSpacing300()), rVar2, 0);
            rVar2.x();
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
            d5VarM.a(new p() { // from class: mp1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(aVar, aVar3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(er.a aVar, er.a aVar2, int i15, r rVar, int i16) {
        r(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(r rVar, final int i15) {
        r rVarH = rVar.h(11873452);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(11873452, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomSheet.SheetContent (DeveloperBottomSheetScreen.kt:150)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            n50.w0.StatusBadge statusBadge = new n50.w0.StatusBadge(new r50.a.WithIcon(null, mx.b.b("Zrealizowano", ""), null, 0, false, r50.g.NEGATIVE, 29, null));
            BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b("Opłata za przekształcenie gruntów Gminy Lublin", ""), null, null, 3, null)), null, 5, null);
            BottomSection bottomSection = new BottomSection(n50.l.b(mx.b.b("Zapłać:", ""), null, null, 3, null), n50.l.b(mx.b.b("366,00 zł", ""), null, null, 3, null));
            boolean zG = rVarH.G(context);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: mp1.e
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
                objE2 = new er.a() { // from class: mp1.f
                    @Override // er.a
                    public final Object a() {
                        return l.v(context);
                    }
                };
                rVarH.v(objE2);
            }
            q.p(new ButtonData(null, null, large, withText, aVar2, null, (er.a) objE2, 35, null), false, null, rVarH, 0, 6);
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
            d5VarM.a(new p() { // from class: mp1.g
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
