package sa1;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.r3;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.io.IOException;
import java.util.Iterator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001c¨\u0006\u001e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lsa1/c;", "viewModel", "Loq/i0;", "m", "(Lsa1/c;Lm2/r;I)V", "Lsa1/c$a;", "screenData", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "q", "(Lsa1/c$a;Li70/p;Ler/a;Lm2/r;I)V", "Lsa1/c$a$c;", "w", "(Lsa1/c$a$c;Lm2/r;I)V", "Lsa1/c$a$b;", "s", "(Lsa1/c$a$b;Li70/p;Ler/a;Lm2/r;I)V", "Lsa1/c$a$g;", "F", "(Lsa1/c$a$g;Lm2/r;I)V", "Li50/a;", "scaffoldData", "Lq40/g;", "Lq40/f;", "iconPageData", "z", "(Li50/a;Lq40/g;Lm2/r;I)V", "C", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, c.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((c) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(IconPageData iconPageData, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(926681024, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.OpenCompanyStatus.<anonymous> (CompanyDetailsScreen.kt:210)");
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
            q40.i.b(iconPageData, null, w0.f179797a.e(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 B(BaseScaffoldData baseScaffoldData, IconPageData iconPageData, int i15, p076m2.r rVar, int i16) {
        z(baseScaffoldData, iconPageData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void C(final BaseScaffoldData baseScaffoldData, final IconPageData<oq.i0, IconPageBottomContentData> iconPageData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(477449694);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(baseScaffoldData) : rVarH.G(baseScaffoldData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(iconPageData) : rVarH.G(iconPageData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(477449694, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.UpdateRequiredScreen (CompanyDetailsScreen.kt:227)");
            }
            rVar2 = rVarH;
            i50.s.r(baseScaffoldData, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1408863249, true, new er.q() { // from class: sa1.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.D(iconPageData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | (i16 & 14), 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sa1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.E(baseScaffoldData, iconPageData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(IconPageData iconPageData, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1408863249, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.UpdateRequiredScreen.<anonymous> (CompanyDetailsScreen.kt:231)");
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
            q40.i.b(iconPageData, null, w0.f179797a.f(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 E(BaseScaffoldData baseScaffoldData, IconPageData iconPageData, int i15, p076m2.r rVar, int i16) {
        C(baseScaffoldData, iconPageData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void F(final c.a.WorkInProgressNewApplication workInProgressNewApplication, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1372698895);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(workInProgressNewApplication) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1372698895, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.WorkInProgressNewApplication (CompanyDetailsScreen.kt:184)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2 = rVarH;
            j70.h.g(null, null, mx.b.b("Ekran roboczy", "wipScreen"), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 0, 0, 0, 33554427);
            r3.a(androidx.compose.foundation.layout.d.i(companion, c5.h.n(10)), rVar2, 6);
            j70.h.g(null, null, mx.b.b("Status firmy: " + workInProgressNewApplication.getStatus(), "companyStatus"), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 0, 0, 0, 33554427);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sa1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.G(workInProgressNewApplication, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(c.a.WorkInProgressNewApplication workInProgressNewApplication, int i15, p076m2.r rVar, int i16) {
        F(workInProgressNewApplication, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1019255374);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1019255374, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.CompanyDetailsScreen (CompanyDetailsScreen.kt:44)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            c.a aVarN = n(f6VarC);
            i70.p pVarO = o(f6VarB);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(cVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(cVar);
                rVarH.v(objE);
            }
            q(aVarN, pVarO, (er.a) ((mr.g) objE), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sa1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.p(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a n(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p o(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c cVar, int i15, p076m2.r rVar, int i16) {
        m(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final c.a aVar, final i70.p pVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(522237787);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(522237787, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.CompanyDetailsScreenContent (CompanyDetailsScreen.kt:62)");
            }
            if (fr.t.c(aVar, c.a.C4622a.f179619a)) {
                rVarH.X(-640653505);
                rVarH.R();
            } else if (aVar instanceof c.a.NoData) {
                rVarH.X(-640651781);
                w((c.a.NoData) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof c.a.Initialized) {
                rVarH.X(-640647920);
                s((c.a.Initialized) aVar, pVar, aVar2, rVarH, i16 & 1022);
                rVarH.R();
            } else if (aVar instanceof c.a.WorkInProgressNewApplication) {
                rVarH.X(-640640963);
                F((c.a.WorkInProgressNewApplication) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof c.a.UpdateRequired) {
                rVarH.X(-640636974);
                c.a.UpdateRequired updateRequired = (c.a.UpdateRequired) aVar;
                C(updateRequired.getScaffoldData(), updateRequired.a(), rVarH, BaseScaffoldData.f89350g | ((IconPageData.f164667h | IconPageBottomContentData.f164663d) << 3));
                rVarH.R();
            } else if (aVar instanceof c.a.OpenCompanyPendingStatus) {
                rVarH.X(-640631025);
                c.a.OpenCompanyPendingStatus openCompanyPendingStatus = (c.a.OpenCompanyPendingStatus) aVar;
                z(openCompanyPendingStatus.getScaffoldData(), openCompanyPendingStatus.a(), rVarH, BaseScaffoldData.f89350g | ((IconPageData.f164667h | IconPageBottomContentData.f164663d) << 3));
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.OpenCompanyRejectedStatus)) {
                    rVarH.X(-640654521);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-640625137);
                c.a.OpenCompanyRejectedStatus openCompanyRejectedStatus = (c.a.OpenCompanyRejectedStatus) aVar;
                z(openCompanyRejectedStatus.getScaffoldData(), openCompanyRejectedStatus.a(), rVarH, BaseScaffoldData.f89350g | ((IconPageData.f164667h | IconPageBottomContentData.f164663d) << 3));
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
            d5VarM.a(new er.p() { // from class: sa1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.r(aVar, pVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(c.a aVar, i70.p pVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        q(aVar, pVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final c.a.Initialized initialized, final i70.p pVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(218790916);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
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
                p076m2.t.o(218790916, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.CompanyDetailsScreenInitialized (CompanyDetailsScreen.kt:124)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, y2.m.d(1418172666, true, new er.p() { // from class: sa1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.t(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-874902991, true, new er.q() { // from class: sa1.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.u(alVar, pVar, aVar, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sa1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.v(initialized, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1418172666, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.CompanyDetailsScreenInitialized.<anonymous> (CompanyDetailsScreen.kt:131)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(al alVar, i70.p pVar, er.a aVar, c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-874902991, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.CompanyDetailsScreenInitialized.<anonymous> (CompanyDetailsScreen.kt:135)");
            }
            i70.m.d(alVar, pVar, aVar, null, null, rVar, 6, 24);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.r(mVarL, aVar2.b(rVar, i17).getSpacing200(), 0.0f, aVar2.b(rVar, i17).getSpacing200(), 0.0f, 10, null), 0.0f, 1, null), null, rVar, 0, 1);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing100()), rVar, 0);
            rVar.X(-1185941552);
            Iterator<T> it = initialized.a().iterator();
            while (it.hasNext()) {
                c30.e.c(null, (c30.b) it.next(), rVar, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            }
            rVar.R();
            o40.j.i(initialized.getHeaderData(), rVar, 0);
            f3.m.Companion companion3 = f3.m.INSTANCE;
            k70.a aVar3 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar, i18).getSpacing300()), rVar, 0);
            if (initialized.getShortcutsLayoutData() == null) {
                rVar.X(1890808116);
            } else {
                rVar.X(1890808117);
                h70.g.f(initialized.getShortcutsLayoutData(), rVar, ShortcutsLayoutData.f81324c);
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar, i18).getSpacing300()), rVar, 0);
            }
            rVar.R();
            m30.i.d(initialized.getContentData().getMainSection(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar, i18).getSpacing200()), rVar, 0);
            AccordionData contactAccordionData = initialized.getContentData().getContactAccordionData();
            int i19 = AccordionData.f16343b;
            b30.j.g(contactAccordionData, rVar, i19);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar, i18).getSpacing200()), rVar, 0);
            b30.j.g(initialized.getContentData().getAddressAccordionData(), rVar, i19);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar, i18).getSpacing200()), rVar, 0);
            b30.j.g(initialized.getContentData().getAdditionalAccordionData(), rVar, i19);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar, i18).getSpacing200()), rVar, 0);
            j70.h.g(null, null, initialized.getContentData().getDataSourceInfo(), null, null, aVar3.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar, i18).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar, i18).getSpacing100()), rVar, 0);
            x40.h.g(initialized.getContentData().getLinkData(), rVar, LinkData.f216731g);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar, i18).getSpacing200()), rVar, 0);
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
    public static final oq.i0 v(c.a.Initialized initialized, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        s(initialized, pVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void w(final c.a.NoData noData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(793593696);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noData) : rVarH.G(noData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(793593696, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.CompanyDetailsScreenNoData (CompanyDetailsScreen.kt:99)");
            }
            rVar2 = rVarH;
            i50.s.r(noData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-518164275, true, new er.q() { // from class: sa1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.x(noData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sa1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.y(noData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(c.a.NoData noData, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-518164275, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.CompanyDetailsScreenNoData.<anonymous> (CompanyDetailsScreen.kt:104)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
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
            q40.i.b(noData.a(), w0.f179797a.d(), null, rVar, IconPageData.f164667h | LinkData.f216731g | 48, 4);
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
    public static final oq.i0 y(c.a.NoData noData, int i15, p076m2.r rVar, int i16) {
        w(noData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final BaseScaffoldData baseScaffoldData, final IconPageData<oq.i0, IconPageBottomContentData> iconPageData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1963237101);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(baseScaffoldData) : rVarH.G(baseScaffoldData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(iconPageData) : rVarH.G(iconPageData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1963237101, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.OpenCompanyStatus (CompanyDetailsScreen.kt:205)");
            }
            rVar2 = rVarH;
            i50.s.r(baseScaffoldData, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(926681024, true, new er.q() { // from class: sa1.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.A(iconPageData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | (i16 & 14), 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sa1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.B(baseScaffoldData, iconPageData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
