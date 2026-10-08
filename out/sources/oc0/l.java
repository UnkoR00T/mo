package oc0;

import d1.a3;
import d1.d3;
import d1.r3;
import d1.x;
import i50.BaseScaffoldData;
import java.io.IOException;
import lc0.LoginThemeDrawable;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Loc0/f;", "viewModel", "Loq/i0;", "f", "(Loc0/f;Lm2/r;I)V", "Loc0/f$a$a;", "data", "i", "(Loc0/f$a$a;Lm2/r;I)V", "Loc0/f$a;", "state", "login_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void f(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1897307157);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1897307157, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.lostpin.LostPinScreen (LostPinScreen.kt:30)");
            }
            f.a aVarG = g(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarG instanceof f.a.LostPinData)) {
                rVarH.X(-2048919023);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(-2048916578);
            i((f.a.LostPinData) aVarG, rVarH, 0);
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oc0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.h(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a g(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(f fVar, int i15, p076m2.r rVar, int i16) {
        f(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final f.a.LostPinData lostPinData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-679289721);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lostPinData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-679289721, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.lostpin.LostPinScreenContent (LostPinScreen.kt:40)");
            }
            cb4.i dialogVMSAdapter = lostPinData.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(1165918898);
            } else {
                rVarH.X(37610287);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(lostPinData.getScaffoldData(), y2.m.d(1736018418, true, new er.p() { // from class: oc0.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.j(lostPinData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1544536826, true, new er.q() { // from class: oc0.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.k(lostPinData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oc0.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(lostPinData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f.a.LostPinData lostPinData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1736018418, i15, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.lostpin.LostPinScreenContent.<anonymous> (LostPinScreen.kt:47)");
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            h30.q.p(lostPinData.getNextButton(), false, null, rVar, 0, 6);
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
    public static final i0 k(final f.a.LostPinData lostPinData, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1544536826, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.lostpin.LostPinScreenContent.<anonymous> (LostPinScreen.kt:52)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            o40.j.i(o40.a.Icon.d(lostPinData.getHeaderData(), ((LoginThemeDrawable) rVar.N(lc0.e.f())).getChangePassword(), null, null, null, null, null, 62, null), rVar, o40.a.Icon.f142232h);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, lostPinData.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            rVar.x();
            boolean zG = rVar.G(lostPinData);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: oc0.k
                    @Override // er.a
                    public final Object a() {
                        return l.l(lostPinData);
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
    public static final i0 l(f.a.LostPinData lostPinData) {
        lostPinData.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f.a.LostPinData lostPinData, int i15, p076m2.r rVar, int i16) {
        i(lostPinData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
