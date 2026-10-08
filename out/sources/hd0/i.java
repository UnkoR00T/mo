package hd0;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import d1.a3;
import d1.d3;
import d1.r3;
import d1.x;
import ed0.OnboardingThemeDrawable;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import j30.ButtonTextData;
import oq.i0;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import t40.InfoRowListData;
import w0.i1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lhd0/c;", "viewModel", "Loq/i0;", "f", "(Lhd0/c;Lm2/r;I)V", "Lhd0/c$a$a;", "data", "i", "(Lhd0/c$a$a;Lm2/r;I)V", "Lhd0/c$a;", "state", "onboarding_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void f(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1897298432);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1897298432, i16, -1, "pl.gov.coi.mjunior.feature.onboarding.presentation.screen.welcome.WelcomeScreen (WelcomeScreen.kt:37)");
            }
            c.a aVarG = g(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarG instanceof c.a.WelcomeData)) {
                rVarH.X(-2057303748);
                rVarH.R();
                throw new p();
            }
            rVarH.X(-2057301303);
            i((c.a.WelcomeData) aVarG, rVarH, 0);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hd0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a g(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c cVar, int i15, r rVar, int i16) {
        f(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final c.a.WelcomeData welcomeData, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(2021534623);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(welcomeData) : rVarH.G(welcomeData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2021534623, i16, -1, "pl.gov.coi.mjunior.feature.onboarding.presentation.screen.welcome.WelcomeScreenContent (WelcomeScreen.kt:47)");
            }
            rVar2 = rVarH;
            s.r(welcomeData.getScaffoldData(), y2.m.d(1598171412, true, new er.p() { // from class: hd0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(welcomeData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(709776652, true, new q() { // from class: hd0.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.k(welcomeData, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hd0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(welcomeData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.WelcomeData welcomeData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1598171412, i15, -1, "pl.gov.coi.mjunior.feature.onboarding.presentation.screen.welcome.WelcomeScreenContent.<anonymous> (WelcomeScreen.kt:52)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            h30.q.p(welcomeData.getNextButton(), false, null, rVar, 0, 6);
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
    public static final i0 k(final c.a.WelcomeData welcomeData, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(709776652, i16, -1, "pl.gov.coi.mjunior.feature.onboarding.presentation.screen.welcome.WelcomeScreenContent.<anonymous> (WelcomeScreen.kt:57)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            f3.m mVarF = androidx.compose.foundation.layout.d.f(i0Var.c(companion, companion2.g()), 0.0f, 1, null);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            i1.c(l4.c.c(((OnboardingThemeDrawable) rVar.N(ed0.c.c())).getOnboardingWelcome(), rVar, 0), null, androidx.compose.foundation.layout.d.i(mVarF, c5.h.n((float) ((((double) displayMetrics.heightPixels) * 0.3d) / ((double) displayMetrics.density)))), null, p036e4.l.INSTANCE.e(), 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 24624, 104);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, welcomeData.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).g(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            s40.g.c(welcomeData.getInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j30.f.e(null, welcomeData.getInfoPageButtonData(), false, rVar, ButtonTextData.f99099f << 3, 5);
            rVar.x();
            boolean zG = rVar.G(welcomeData);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: hd0.h
                    @Override // er.a
                    public final Object a() {
                        return i.l(welcomeData);
                    }
                };
                rVar.v(objE);
            }
            q0.g(false, (er.a) objE, rVar, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.a.WelcomeData welcomeData) {
        welcomeData.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.a.WelcomeData welcomeData, int i15, r rVar, int i16) {
        i(welcomeData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
