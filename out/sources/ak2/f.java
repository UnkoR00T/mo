package ak2;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.i0;
import d1.r3;
import e60.FooterData;
import j30.ButtonTextData;
import l20.GreetingsHeaderData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lak2/c;", "viewModel", "Loq/i0;", "e", "(Lak2/c;Lm2/r;I)V", "Lak2/c$a;", "screenData", "c", "(Lak2/c$a;Lm2/r;I)V", "login_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void c(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(872927570);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(872927570, i16, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.biometricpin.BiometricPinContent (BiometricPinScreen.kt:35)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarB = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), l4.c.c(c20.b.D, rVarH, 0), false, null, p036e4.l.INSTANCE.b(), 0.0f, null, 54, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarB, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            i0 i0Var = i0.f39176a;
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, companion);
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
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            k20.b.b(data.getGreetingsHeaderData(), rVarH, GreetingsHeaderData.f115424c);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            v0.g(data.getPinTextInputData(), d60.e.b(data.getShouldFocusWithKeyboard(), null, rVarH, 0, 2), rVarH, v50.c.f203957t, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j30.f.e(null, data.getPasswordLoginButtonTextData(), false, rVarH, ButtonTextData.f99099f << 3, 5);
            rVarH.x();
            r3.a(h0.b(i0Var, companion, 1.0f, false, 2, null), rVarH, 0);
            if (data.getIsImeVisible()) {
                rVarH.X(-1357344922);
            } else {
                rVarH.X(-1355021689);
                e60.f.e(data.getFooterData(), null, rVarH, FooterData.f47642h, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ak2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.d(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(c.Data data, int i15, p076m2.r rVar, int i16) {
        c(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void e(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-662452383);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-662452383, i16, -1, "pl.gov.coi.mobywatel.feature.login.presentation.screen.biometricpin.BiometricPinScreen (BiometricPinScreen.kt:29)");
            }
            c(f(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, GreetingsHeaderData.f115424c | ButtonTextData.f99099f | v50.c.f203957t | FooterData.f47642h);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ak2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data f(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(c cVar, int i15, p076m2.r rVar, int i16) {
        e(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
