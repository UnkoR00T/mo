package h33;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u30.CheckBoxGroupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lh33/d;", "viewModel", "Loq/i0;", "l", "(Lh33/d;Lm2/r;I)V", "Lh33/d$a$a;", "data", "g", "(Lh33/d$a$a;Lm2/r;I)V", "Lh33/d$a;", "state", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void g(final d.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1732477899);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1732477899, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.methodofcontact.MethodOfContactContent (MethodOfContactScreen.kt:46)");
            }
            cb4.i dialogVMSAdapter = content.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-372802514);
            } else {
                rVarH.X(-1536046541);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(content.getBaseScaffoldData(), y2.m.d(827925494, true, new er.p() { // from class: h33.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.h(content, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-146022658, true, new er.q() { // from class: h33.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.i(content, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: h33.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(d.a.Content content, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(827925494, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.methodofcontact.MethodOfContactContent.<anonymous> (MethodOfContactScreen.kt:52)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(content.getNextButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(final d.a.Content content, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-146022658, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.methodofcontact.MethodOfContactContent.<anonymous> (MethodOfContactScreen.kt:59)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            Label headline = content.getHeadline();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, headline, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).m(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, content.getHeadlineDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            if (content.getAnonymousReportCheckBoxData().getCheckbox().getIsChecked()) {
                rVar.X(1571688218);
            } else {
                rVar.X(1574831773);
                i33.a screenContent = content.getScreenContent();
                if (screenContent instanceof i33.a.PhoneAndEmailOnly) {
                    rVar.X(189351027);
                    x30.c.c(null, 0.0f, y2.m.d(-528094380, true, new er.p() { // from class: h33.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.j(content, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
                    rVar.R();
                } else {
                    if (!(screenContent instanceof i33.a.CheckBoxes)) {
                        rVar.X(189348357);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(189359259);
                    t30.e.e(((i33.a.CheckBoxes) content.getScreenContent()).getCheckBoxGroupData(), rVar, CheckBoxGroupData.f194954g);
                    rVar.R();
                }
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(d.a.Content content, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-528094380, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.methodofcontact.MethodOfContactContent.<anonymous>.<anonymous>.<anonymous> (MethodOfContactScreen.kt:83)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            i33.c.b(((i33.a.PhoneAndEmailOnly) content.getScreenContent()).getPhoneAndEmailInputsCustomContentData(), rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(d.a.Content content, int i15, p076m2.r rVar, int i16) {
        g(content, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-81844419);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-81844419, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.methodofcontact.MethodOfContactScreen (MethodOfContactScreen.kt:32)");
            }
            final f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            d.a aVarM = m(f6VarC);
            if (aVarM instanceof d.a.Initial) {
                rVarH.X(-1343068594);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarM instanceof d.a.Content)) {
                    rVarH.X(-1343070830);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1343066432);
                g((d.a.Content) aVarM, rVarH, 0);
                rVarH.R();
            }
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: h33.f
                    @Override // er.a
                    public final Object a() {
                        return l.n(f6VarC);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h33.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a m(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(f6 f6Var) {
        m(f6Var).a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(d dVar, int i15, p076m2.r rVar, int i16) {
        l(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
