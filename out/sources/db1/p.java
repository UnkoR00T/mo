package db1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import t40.InfoRowListData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Ldb1/h;", "viewModel", "Loq/i0;", "p", "(Ldb1/h;Lm2/r;I)V", "Ldb1/h$a$b;", "data", "l", "(Ldb1/h$a$b;Lm2/r;I)V", "Ldb1/h$a$a;", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "h", "(Ldb1/h$a$a;Li70/p;Ler/a;Lm2/r;I)V", "Ldb1/h$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, h.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((h) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    private static final void h(final h.a.DataInformationInitialized dataInformationInitialized, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1290289113);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dataInformationInitialized) : rVarH.G(dataInformationInitialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1290289113, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.welcomepage.CompanyDataInformationContent (CompanyWelcomePageScreen.kt:95)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i50.s.r(dataInformationInitialized.getScaffoldData(), null, y2.m.d(1786116259, true, new er.p() { // from class: db1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.i(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(142557132, true, new er.q() { // from class: db1.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.j(alVar, pVar, aVar, dataInformationInitialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            rVarH = rVarH;
            q0.g(false, dataInformationInitialized.a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: db1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.k(dataInformationInitialized, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1786116259, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.welcomepage.CompanyDataInformationContent.<anonymous> (CompanyWelcomePageScreen.kt:102)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(al alVar, i70.p pVar, er.a aVar, h.a.DataInformationInitialized dataInformationInitialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(142557132, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.welcomepage.CompanyDataInformationContent.<anonymous> (CompanyWelcomePageScreen.kt:105)");
            }
            i70.m.d(alVar, pVar, aVar, null, null, rVar, 6, 24);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(a3.l(w0.i.d(mVarF, aVar2.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing100(), aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            j70.h.g(null, null, dataInformationInitialized.getDescription(), null, null, aVar2.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing250()), rVar, 0);
            s40.g.c(dataInformationInitialized.getInformationRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing250()), rVar, 0);
            j70.h.g(null, null, dataInformationInitialized.getMoreInformation(), null, null, aVar2.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing250()), rVar, 0);
            x40.h.g(dataInformationInitialized.getLinkData(), rVar, LinkData.f216731g);
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
    public static final i0 k(h.a.DataInformationInitialized dataInformationInitialized, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        h(dataInformationInitialized, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final h.a.WelcomePageInitialized welcomePageInitialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(265768781);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(welcomePageInitialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(265768781, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.welcomepage.CompanyWelcomePageContent (CompanyWelcomePageScreen.kt:57)");
            }
            rVar2 = rVarH;
            i50.s.r(welcomePageInitialized.getScaffoldData(), y2.m.d(-191037896, true, new er.p() { // from class: db1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.m(welcomePageInitialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-527246528, true, new er.q() { // from class: db1.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.n(welcomePageInitialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: db1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.o(welcomePageInitialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(h.a.WelcomePageInitialized welcomePageInitialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-191037896, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.welcomepage.CompanyWelcomePageContent.<anonymous> (CompanyWelcomePageScreen.kt:61)");
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
            h30.q.p(welcomePageInitialized.getButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 n(h.a.WelcomePageInitialized welcomePageInitialized, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-527246528, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.welcomepage.CompanyWelcomePageContent.<anonymous> (CompanyWelcomePageScreen.kt:67)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.q(mVarL, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200()), 0.0f, 1, null), null, rVar, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
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
            o40.j.i(welcomePageInitialized.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            s40.g.c(welcomePageInitialized.getInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            x40.h.g(welcomePageInitialized.getLinkData(), rVar, LinkData.f216731g);
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
    public static final i0 o(h.a.WelcomePageInitialized welcomePageInitialized, int i15, p076m2.r rVar, int i16) {
        l(welcomePageInitialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(101445571);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(101445571, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.welcomepage.CompanyWelcomePageScreen (CompanyWelcomePageScreen.kt:33)");
            }
            f6 f6VarC = m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(hVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            h.a aVarQ = q(f6VarC);
            if (aVarQ instanceof h.a.DataInformationInitialized) {
                rVarH.X(-1295042374);
                h.a.DataInformationInitialized dataInformationInitialized = (h.a.DataInformationInitialized) q(f6VarC);
                i70.p pVarR = r(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(hVar))) {
                    z15 = false;
                }
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(hVar);
                    rVarH.v(objE);
                }
                h(dataInformationInitialized, pVarR, (er.a) ((mr.g) objE), rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarQ instanceof h.a.WelcomePageInitialized)) {
                    rVarH.X(-1295045031);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1295033193);
                l((h.a.WelcomePageInitialized) q(f6VarC), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: db1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.s(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.a q(f6<? extends h.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p r(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(h hVar, int i15, p076m2.r rVar, int i16) {
        p(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
