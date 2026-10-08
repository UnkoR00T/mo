package eg2;

import d1.a3;
import d1.d3;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Leg2/d;", "viewModel", "Loq/i0;", "k", "(Leg2/d;Lm2/r;I)V", "Leg2/d$a$d;", "data", "g", "(Leg2/d$a$d;Lm2/r;I)V", "Leg2/d$a$a;", "n", "(Leg2/d$a$a;Lm2/r;I)V", "Leg2/d$a;", "state", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void g(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1566549130);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1566549130, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.checkdocumentstatus.CheckDocumentStatusInitialized (CheckDocumentStatusScreen.kt:51)");
            }
            cb4.i dialogVMSAdapter = initialized.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-49386225);
            } else {
                rVarH.X(-2079803086);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(1265186933, true, new er.p() { // from class: eg2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(676695421, true, new er.q() { // from class: eg2.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.i(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: eg2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1265186933, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.checkdocumentstatus.CheckDocumentStatusInitialized.<anonymous> (CheckDocumentStatusScreen.kt:57)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = a3.n(companion, aVar.b(rVar, i16).getSpacing200());
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
            h30.q.p(initialized.getPrimaryButton(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing150()), rVar, 0);
            ButtonData secondaryButtonData = initialized.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-263282743);
            } else {
                rVar.X(-263282742);
                h30.q.p(secondaryButtonData, false, null, rVar, 0, 6);
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
    public static final oq.i0 i(d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(676695421, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.checkdocumentstatus.CheckDocumentStatusInitialized.<anonymous> (CheckDocumentStatusScreen.kt:64)");
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
            n50.h0.v(initialized.getVerificationCard(), null, rVar, 0, 2);
            if (initialized.getDocumentDataCardList() == null) {
                rVar.X(-448205464);
                rVar.R();
                rVar2 = rVar;
            } else {
                rVar.X(-448205463);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
                rVar2 = rVar;
                m30.i.d(initialized.getDocumentDataCardList(), null, null, rVar2, 0, 6);
                rVar2.R();
            }
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        g(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(356814528);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(356814528, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.checkdocumentstatus.CheckDocumentStatusScreen (CheckDocumentStatusScreen.kt:35)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            d.a aVarL = l(f6VarC);
            if (aVarL instanceof d.a.Error) {
                rVarH.X(-698614776);
                ((d.a.Error) aVarL).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else if (aVarL instanceof d.a.FetchingStatus) {
                rVarH.X(-698612559);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarL instanceof d.a.Initialized) {
                rVarH.X(-698610133);
                g((d.a.Initialized) aVarL, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarL instanceof d.a.DownloadReport)) {
                    rVarH.X(-698617326);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-698606821);
                n((d.a.DownloadReport) aVarL, rVarH, 0);
                rVarH.R();
            }
            q0.g(false, l(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: eg2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.m(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a l(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d dVar, int i15, p076m2.r rVar, int i16) {
        k(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final d.a.DownloadReport downloadReport, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(316174571);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(downloadReport) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(316174571, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.checkdocumentstatus.DownloadReport (CheckDocumentStatusScreen.kt:85)");
            }
            cb4.i dialogVMSAdapter = downloadReport.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(293471918);
            } else {
                rVarH.X(-1098911821);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(downloadReport.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-874776296, true, new er.q() { // from class: eg2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.o(downloadReport, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: eg2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(downloadReport, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(d.a.DownloadReport downloadReport, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-874776296, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.checkdocumentstatus.DownloadReport.<anonymous> (CheckDocumentStatusScreen.kt:89)");
            }
            d1.i.f fVarE = d1.i.f39152a.e();
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing500(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(fVarE, bVarG, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            x70.f.g(downloadReport.getLoaderData(), rVar, x70.a.f217278b);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, downloadReport.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).g(), null, Float.valueOf(-2.0f), false, false, null, rVar, 6, 0, 0, 30928858);
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
    public static final oq.i0 p(d.a.DownloadReport downloadReport, int i15, p076m2.r rVar, int i16) {
        n(downloadReport, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
