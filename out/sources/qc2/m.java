package qc2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.b1;
import f1.y0;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lqc2/c;", "viewModel", "Loq/i0;", "j", "(Lqc2/c;Lm2/r;I)V", "Lqc2/c$a$a;", "data", "m", "(Lqc2/c$a$a;Lm2/r;I)V", "Lqc2/c$a;", "state", "identitycardinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void j(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1034367639);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1034367639, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.welcome.WelcomeScreen (WelcomeScreen.kt:26)");
            }
            c.a aVarK = k(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarK, c.a.b.f165993a)) {
                rVarH.X(-1889850035);
                rVarH.R();
            } else {
                if (!(aVarK instanceof c.a.Initialized)) {
                    rVarH.X(-1889851936);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1889848406);
                m((c.a.Initialized) aVarK, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: qc2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.l(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a k(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c cVar, int i15, p076m2.r rVar, int i16) {
        j(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(673781074);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(673781074, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.welcome.WelcomeScreenContent (WelcomeScreen.kt:37)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(1730308989, true, new er.p() { // from class: qc2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1186739845, true, new er.q() { // from class: qc2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.o(y0VarC, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32700);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: qc2.g
                    @Override // er.a
                    public final Object a() {
                        return m.t(initialized);
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
            d5VarM.a(new er.p() { // from class: qc2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.u(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1730308989, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.welcome.WelcomeScreenContent.<anonymous> (WelcomeScreen.kt:44)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(initialized.getButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 o(y0 y0Var, final c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1186739845, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.welcome.WelcomeScreenContent.<anonymous> (WelcomeScreen.kt:51)");
            }
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var), rVar, 0);
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: qc2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.p(initialized, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarN, y0Var, null, false, null, null, null, false, null, (er.l) objE, rVar, 0, 508);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final c.a.Initialized initialized, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(-2074347568, true, new er.q() { // from class: qc2.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m.q(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        f1.q0.c(q0Var, null, null, y2.m.b(-855136519, true, new er.q() { // from class: qc2.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m.r(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        f1.q0.c(q0Var, null, null, y2.m.b(-370499688, true, new er.q() { // from class: qc2.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m.s(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2074347568, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.welcome.WelcomeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeScreen.kt:59)");
            }
            Label titleLabel = initialized.getTitleLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, titleLabel, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(c.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-855136519, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.welcome.WelcomeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeScreen.kt:67)");
            }
            Label descriptionLabel = initialized.getDescriptionLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, descriptionLabel, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(c.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-370499688, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.welcome.WelcomeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeScreen.kt:75)");
            }
            h0.v(initialized.getFieldData(), null, rVar, 0, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(c.a.Initialized initialized) {
        initialized.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        m(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
