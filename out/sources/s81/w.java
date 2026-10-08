package s81;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ls81/o;", "viewModel", "Loq/i0;", "o", "(Ls81/o;Lm2/r;I)V", "Ls81/o$a;", "screenData", "r", "(Ls81/o$a;Lm2/r;I)V", "Ls81/o$a$c;", "h", "(Ls81/o$a$c;Lm2/r;I)V", "Ls81/o$a$d;", "l", "(Ls81/o$a$d;Lm2/r;I)V", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    public static final void h(final o.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-364552527);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-364552527, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institution.ChildPassportApplicationInstitutionInitialized (ChildPassportApplicationInstitutionScreen.kt:50)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-558560732, true, new er.q() { // from class: s81.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.i(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, initialized.g(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s81.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.k(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(final o.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        k70.a aVar;
        int i17;
        f3.m.Companion companion;
        int i18;
        Object obj;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-558560732, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institution.ChildPassportApplicationInstitutionInitialized.<anonymous> (ChildPassportApplicationInstitutionScreen.kt:52)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion2, d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar2.b(rVar, i19).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarR = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar2.b(rVar, i19).getSpacing100(), 0.0f, 0.0f, 13, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            j70.h.g(null, null, initialized.getHeaderData(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i19).m(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i19).getSpacing100()), rVar2, 0);
            Label descriptionData = initialized.getDescriptionData();
            if (descriptionData == null) {
                rVar2.X(-541289072);
                rVar2.R();
                aVar = aVar2;
                i17 = i19;
                companion = companion2;
                i18 = 0;
            } else {
                rVar2.X(-541289071);
                j70.h.g(null, null, descriptionData, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar2;
                i17 = i19;
                companion = companion2;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                oq.i0 i0Var = oq.i0.f148189a;
                rVar2.R();
            }
            x30.c.c(null, 0.0f, y2.m.d(78405943, true, new er.p() { // from class: s81.v
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return w.j(initialized, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
            c30.b.c alertData = initialized.getAlertData();
            if (alertData == null) {
                rVar2.X(-540916235);
                rVar2.R();
                obj = null;
            } else {
                rVar2.X(-540916234);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                obj = null;
                c30.e.c(null, alertData, rVar2, i18, 1);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar2.R();
            }
            rVar2.x();
            f3.m mVarP2 = a3.p(companion, 0.0f, aVar.b(rVar2, i17).getSpacing200(), 1, obj);
            p036e4.w0 w0VarB = m3.b(iVar.j(), companion3.l(), rVar2, i18);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, i18));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarB, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            q3 q3Var = q3.f39261a;
            h30.q.p(initialized.getNextButtonData(), false, null, rVar2, 0, 6);
            rVar.x();
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
    public static final oq.i0 j(o.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(78405943, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institution.ChildPassportApplicationInstitutionInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildPassportApplicationInstitutionScreen.kt:75)");
            }
            j40.l.m(initialized.getInstitutionDropDownData(), rVar, DropDownButtonData.f99359i);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(o.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        h(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final o.a.NoEdorAddress noEdorAddress, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1976979605);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noEdorAddress) : rVarH.G(noEdorAddress) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1976979605, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institution.ChildPassportApplicationInstitutionNoEdorAddress (ChildPassportApplicationInstitutionScreen.kt:93)");
            }
            i50.s.r(noEdorAddress.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(522217822, true, new er.q() { // from class: s81.t
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.m(noEdorAddress, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, noEdorAddress.b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s81.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.n(noEdorAddress, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(o.a.NoEdorAddress noEdorAddress, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(522217822, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institution.ChildPassportApplicationInstitutionNoEdorAddress.<anonymous> (ChildPassportApplicationInstitutionScreen.kt:95)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            q40.i.b(noEdorAddress.a(), null, y0.f179143a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 n(o.a.NoEdorAddress noEdorAddress, int i15, p076m2.r rVar, int i16) {
        l(noEdorAddress, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final o oVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1197933769);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(oVar) : rVarH.G(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1197933769, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institution.ChildPassportApplicationInstitutionScreen (ChildPassportApplicationInstitutionScreen.kt:28)");
            }
            r(p(m7.b.c(oVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s81.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.q(oVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final o.a p(f6<? extends o.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(o oVar, int i15, p076m2.r rVar, int i16) {
        o(oVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final o.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1381028218);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1381028218, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.institution.ChildPassportApplicationInstitutionScreenContent (ChildPassportApplicationInstitutionScreen.kt:34)");
            }
            if (fr.t.c(aVar, o.a.b.f179106a)) {
                rVarH.X(-23216297);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof o.a.Initialized) {
                rVarH.X(-23213318);
                h((o.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof o.a.Error) {
                rVarH.X(-23207890);
                ((o.a.Error) aVar).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else if (fr.t.c(aVar, o.a.e.f179119a)) {
                rVarH.X(-23205065);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof o.a.NoEdorAddress)) {
                    rVarH.X(-23218546);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-23201841);
                l((o.a.NoEdorAddress) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: s81.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.s(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(o.a aVar, int i15, p076m2.r rVar, int i16) {
        r(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
