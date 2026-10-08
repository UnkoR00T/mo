package yb1;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.i0;
import d1.r3;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lyb1/g;", "viewModel", "Loq/i0;", "g", "(Lyb1/g;Lm2/r;I)V", "Lyb1/g$a$a;", "data", "d", "(Lyb1/g$a$a;Lm2/r;I)V", "Lyb1/g$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    /* JADX WARN: Code duplicated, block: B:56:0x030d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0315  */
    /* JADX WARN: Code duplicated, block: B:61:0x0329  */
    private static final void d(g.a.DataDisplayed dataDisplayed, p076m2.r rVar, final int i15) {
        int i16;
        boolean z15;
        Object objE;
        final g.a.DataDisplayed dataDisplayed2 = dataDisplayed;
        p076m2.r rVarH = rVar.h(249467592);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(dataDisplayed2) : rVarH.G(dataDisplayed2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(249467592, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.businessaddressselection.BusinessAddressSelectionDataDisplayed (BusinessAddressSelectionScreen.kt:41)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), null, rVarH, 0, 1);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
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
            f3.m mVarB = h0.b(i0.f39176a, t70.i.S(a3.r(companion, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 8, null), null, rVarH, 0, 1), 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarB);
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
            int i18 = i16;
            j70.h.g(null, null, dataDisplayed2.getTitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, dataDisplayed.getDescription(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            m30.i.d(dataDisplayed.getAddressListData(), null, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            c30.e.c(null, dataDisplayed.getAlertData(), rVarH, c30.b.e.f22961j << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.x();
            f3.m mVarN = a3.n(companion, aVar.b(rVarH, i17).getSpacing200());
            w0 w0VarA3 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            h30.q.p(dataDisplayed.getNextButton(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if ((i18 & 14) != 4) {
                if ((i18 & 8) != 0) {
                    dataDisplayed2 = dataDisplayed;
                    if (rVarH.G(dataDisplayed2)) {
                    }
                    objE = rVarH.E();
                    if (z15 || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: yb1.i
                            @Override // er.a
                            public final Object a() {
                                return k.e(dataDisplayed2);
                            }
                        };
                        rVarH.v(objE);
                    }
                    q0.g(false, (er.a) objE, rVarH, 0, 1);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    dataDisplayed2 = dataDisplayed;
                }
                z15 = false;
                objE = rVarH.E();
                if (z15) {
                    objE = new er.a() { // from class: yb1.i
                        @Override // er.a
                        public final Object a() {
                            return k.e(dataDisplayed2);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: yb1.i
                        @Override // er.a
                        public final Object a() {
                            return k.e(dataDisplayed2);
                        }
                    };
                    rVarH.v(objE);
                }
                q0.g(false, (er.a) objE, rVarH, 0, 1);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                dataDisplayed2 = dataDisplayed;
            }
            z15 = true;
            objE = rVarH.E();
            if (z15) {
                objE = new er.a() { // from class: yb1.i
                    @Override // er.a
                    public final Object a() {
                        return k.e(dataDisplayed2);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: yb1.i
                    @Override // er.a
                    public final Object a() {
                        return k.e(dataDisplayed2);
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
            d5VarM.a(new er.p() { // from class: yb1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.f(dataDisplayed2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(g.a.DataDisplayed dataDisplayed) {
        dataDisplayed.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(g.a.DataDisplayed dataDisplayed, int i15, p076m2.r rVar, int i16) {
        d(dataDisplayed, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void g(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1811749894);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1811749894, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.businessaddressselection.BusinessAddressSelectionScreen (BusinessAddressSelectionScreen.kt:27)");
            }
            g.a aVarH = h(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof g.a.DataDisplayed) {
                rVarH.X(-1629885447);
                d((g.a.DataDisplayed) aVarH, rVarH, 0);
                rVarH.R();
            } else {
                if (!fr.t.c(aVarH, g.a.b.f226000a)) {
                    rVarH.X(-1629888174);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1629881730);
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
            d5VarM.a(new er.p() { // from class: yb1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a h(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(g gVar, int i15, p076m2.r rVar, int i16) {
        g(gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
