package p077m74;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.m3;
import d1.q3;
import d1.r3;
import er.a;
import er.p;
import er.q;
import f3.c;
import h30.ButtonData;
import h60.f;
import h60.g;
import i50.BaseScaffoldData;
import i50.s;
import j70.h;
import m7.b;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import oz.j;
import oz.l;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import w0.f3;
import w0.i;
import w0.u2;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lm74/c;", "viewModel", "Loq/i0;", "k", "(Lm74/c;Lm2/r;I)V", "Lm74/c$a$b;", "screenData", "Loz/j;", "lifecycleConnector", "f", "(Lm74/c$a$b;Loz/j;Lm2/r;I)V", "Lm74/c$a;", "state", "applicationlock_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {
    public static final void f(final c.a.Initialized initialized, final j jVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(169042231);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(jVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(169042231, i16, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockContent (ApplicationLockScreen.kt:50)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, f3VarB, false, null, null, null, null, false, 0.0f, 0.0f, m.d(-1653689506, true, new q() { // from class: m74.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.g(f3VarB, initialized, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32702);
            rVarH = rVarH;
            l.b(jVar, rVarH, (i16 >> 3) & 14);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new a() { // from class: m74.q
                    @Override // er.a
                    public final Object a() {
                        return u.i();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (a) objE, rVarH, 48, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: m74.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.j(initialized, jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f3 f3Var, final c.a.Initialized initialized, d3 d3Var, r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        k70.a aVar;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1653689506, i16, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockContent.<anonymous>.<anonymous> (ApplicationLockScreen.kt:56)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion2, d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarQ = a3.q(d.h(i.d(mVarL, aVar2.a(rVar, i18).getBase().a(), null, 2, null), 0.0f, 1, null), aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing100(), aVar2.b(rVar, i18).getSpacing200(), aVar2.b(rVar, i18).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            c.Companion companion3 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarS = t70.i.S(h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null), f3Var, rVar, 0, 0);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarS);
            a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            f.e(null, null, Integer.valueOf(jz.a.A), g.MBig, aVar2.a(rVar, i18).getBase().getPrimary(), 0.0f, h60.a.Circle, g.XBig, aVar2.a(rVar, i18).getBase().getSecondary(), 0.0f, 0.0f, null, rVar, 14158848, 48, 1571);
            r3.a(d.i(companion2, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
            h.g(null, null, initialized.getTitle(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).g(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(d.i(companion2, aVar2.b(rVar, i18).getSpacing100()), rVar, 0);
            h.g(null, null, initialized.getSubTitle(), null, null, aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r rVar2 = rVar;
            r3.a(d.i(companion2, aVar2.b(rVar2, i18).getSpacing300()), rVar2, 0);
            x30.c.c(null, 0.0f, m.d(912408235, true, new p() { // from class: m74.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.h(initialized, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
            Label activationHint = initialized.getActivationHint();
            if (activationHint == null) {
                rVar2.X(-1582011739);
                rVar2.R();
                aVar = aVar2;
                i17 = i18;
                companion = companion2;
            } else {
                rVar2.X(-1582011738);
                r3.a(d.i(companion2, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
                companion = companion2;
                aVar = aVar2;
                i17 = i18;
                h.g(null, null, activationHint, null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                i0 i0Var = i0.f148189a;
                rVar2.R();
            }
            rVar2.x();
            ButtonData buttonData = initialized.getButtonData();
            if (buttonData == null) {
                rVar2.X(-513077889);
                rVar2.R();
            } else {
                rVar2.X(-513077888);
                f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVar2, i17).getSpacing200(), 0.0f, 0.0f, 13, null);
                w0 w0VarB = m3.b(iVar.j(), companion3.l(), rVar2, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT3 = rVar2.t();
                f3.m mVarE3 = f3.j.e(rVar2, mVarR);
                a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB3);
                } else {
                    rVar2.u();
                }
                r rVarC3 = n6.c(rVar2);
                n6.i(rVarC3, w0VarB, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                q3 q3Var = q3.f39261a;
                h30.q.p(buttonData, false, null, rVar2, 0, 6);
                rVar.x();
                i0 i0Var2 = i0.f148189a;
                rVar.R();
            }
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
    public static final i0 h(c.a.Initialized initialized, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(912408235, i15, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ApplicationLockScreen.kt:99)");
            }
            c.b bVarG = c.INSTANCE.g();
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label timerDescription = initialized.getTimerDescription();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            h.g(null, null, timerDescription, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            r3.a(d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            k0.c(null, initialized.getTimerData(), rVar, 0, 1);
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
    public static final i0 i() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.Initialized initialized, j jVar, int i15, r rVar, int i16) {
        f(initialized, jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1685537419);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1685537419, i16, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.ApplicationLockScreen (ApplicationLockScreen.kt:35)");
            }
            c.a aVarL = l(b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarL, c.a.C3048a.f124145a)) {
                rVarH.X(-598782503);
                rVarH.R();
            } else {
                if (!(aVarL instanceof c.a.Initialized)) {
                    rVarH.X(-598784684);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-598780534);
                f((c.a.Initialized) aVarL, cVar.getLifecycleConnector(), rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: m74.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.m(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a l(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c cVar, int i15, r rVar, int i16) {
        k(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
