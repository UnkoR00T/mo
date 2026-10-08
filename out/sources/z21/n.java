package z21;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.List;
import n30.CardListData;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0006\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lz21/g;", "viewModel", "Loq/i0;", "n", "(Lz21/g;Lm2/r;I)V", "Lz21/g$a$a$b;", "data", "q", "(Lz21/g$a$a$b;Lm2/r;I)V", "Lz21/g$a$a$a;", "j", "(Lz21/g$a$a$a;Lm2/r;I)V", "Lz21/g$a$a$a$a;", "l", "(Lz21/g$a$a$a$a;Lm2/r;I)V", "Lz21/g$a;", "g", "(Lz21/g$a;Lm2/r;I)V", "checkvehicleinsurance_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    private static final void g(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1254119942);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1254119942, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.InsuranceContent (InsuranceScreen.kt:115)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1019340051, true, new er.q() { // from class: z21.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.h(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: z21.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.i(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1019340051, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.InsuranceContent.<anonymous> (InsuranceScreen.kt:119)");
            }
            f3.m mVarN = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(mVarN, 0.0f, 1, null);
            if (data.getScreenVariant() instanceof g.Data.InterfaceC6236a.Success) {
                rVar.X(-1740485318);
                mVarN = t70.s.n(t70.i.S(mVarN, null, rVar, 6, 1), rVar, 0);
                rVar.R();
            } else {
                rVar.X(-1740359985);
                rVar.R();
            }
            f3.m mVarL = a3.l(mVarF.u(mVarN), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            g.Data.InterfaceC6236a screenVariant = data.getScreenVariant();
            if (screenVariant instanceof g.Data.InterfaceC6236a.Success) {
                rVar.X(489350855);
                q((g.Data.InterfaceC6236a.Success) screenVariant, rVar, 0);
                rVar.R();
            } else {
                if (!(screenVariant instanceof g.Data.InterfaceC6236a.Failure)) {
                    rVar.X(489347412);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(489354439);
                j((g.Data.InterfaceC6236a.Failure) screenVariant, rVar, 0);
                rVar.R();
            }
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
    public static final i0 i(g.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void j(final g.Data.InterfaceC6236a.Failure failure, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-967392141);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(failure) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-967392141, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.InsuranceFailureScreen (InsuranceScreen.kt:82)");
            }
            q40.i.b(failure.a(), b.f232357a.b(), null, rVarH, IconPageData.f164667h | 48, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z21.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.k(failure, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(g.Data.InterfaceC6236a.Failure failure, int i15, p076m2.r rVar, int i16) {
        j(failure, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final g.Data.InterfaceC6236a.Failure.ContentData contentData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(405741301);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(contentData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(405741301, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.InsuranceFailureScreenContent (InsuranceScreen.kt:90)");
            }
            cb4.i dialogVMSAdapter = contentData.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(1401253380);
            } else {
                rVarH.X(-924629603);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            m30.i.d(contentData.getMainSection(), null, null, rVarH, 0, 6);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, contentData.getSectionTitle(), null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).p(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            f3.m mVarI = androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200());
            int i18 = 0;
            r3.a(mVarI, rVarH, 0);
            s40.g.c(contentData.getBullets(), 0.0f, rVarH, InfoRowListData.f187643b, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            rVarH.X(-1453864441);
            List<c30.b.c> listA = contentData.a();
            int size = listA.size();
            int i19 = 0;
            while (i19 < size) {
                c30.e.c(null, listA.get(i19), rVarH, i18, 1);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i18);
                i19++;
                i18 = 0;
            }
            rVarH.R();
            DefaultSingleCardData downloadButton = contentData.getDownloadButton();
            if (downloadButton == null) {
                rVarH.X(-2119963479);
            } else {
                rVarH.X(-2119963478);
                h0.v(downloadButton, null, rVarH, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: z21.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(contentData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(g.Data.InterfaceC6236a.Failure.ContentData contentData, int i15, p076m2.r rVar, int i16) {
        l(contentData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1574667765);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1574667765, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.InsuranceScreen (InsuranceScreen.kt:32)");
            }
            g(o(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z21.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data o(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(g gVar, int i15, p076m2.r rVar, int i16) {
        n(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void q(final g.Data.InterfaceC6236a.Success success, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-25824255);
        int i16 = (i15 & 6) == 0 ? i15 | (rVarH.W(success) ? 4 : 2) : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-25824255, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.insurance.InsuranceSuccessScreen (InsuranceScreen.kt:38)");
            }
            cb4.i dialogVMSAdapter = success.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-531127336);
            } else {
                rVarH.X(952698185);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            c30.b alert = success.getAlert();
            if (alert == null) {
                rVarH.X(-531101048);
            } else {
                rVarH.X(-531101047);
                c30.e.c(null, alert, rVarH, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            }
            rVarH.R();
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), bVarG, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            d40.h.f(null, success.getIcon(), false, rVarH, d40.b.f39676g << 3, 5);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, success.getTitle(), success.getTitle(), null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33026003);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            m30.i.d(success.getMainSection(), null, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, success.getSectionTitle(), null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).p(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.X(952730156);
            List<CardListData> listF = success.f();
            int size = listF.size();
            for (int i18 = 0; i18 < size; i18++) {
                m30.i.d(listF.get(i18), null, null, rVarH, 0, 6);
                if (i18 != pq.v.p(success.f())) {
                    rVarH.X(-397990995);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                } else {
                    rVarH.X(-400900314);
                }
                rVarH.R();
            }
            rVarH.R();
            int i19 = 0;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            rVarH.X(952740739);
            List<c30.b.c> listB = success.b();
            int size2 = listB.size();
            int i25 = 0;
            while (i25 < size2) {
                c30.e.c(null, listB.get(i25), rVarH, i19, 1);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i19);
                i25++;
                i19 = 0;
            }
            rVarH.R();
            DefaultSingleCardData downloadButton = success.getDownloadButton();
            if (downloadButton == null) {
                rVarH.X(-529654867);
            } else {
                rVarH.X(-529654866);
                h0.v(downloadButton, null, rVarH, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z21.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(success, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(g.Data.InterfaceC6236a.Success success, int i15, p076m2.r rVar, int i16) {
        q(success, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
