package na3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lna3/f;", "viewModel", "Loq/i0;", "e", "(Lna3/f;Lm2/r;I)V", "Lna3/f$a$a;", "data", "h", "(Lna3/f$a$a;Lm2/r;I)V", "Lna3/f$a;", "state", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void e(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1771066943);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1771066943, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.downloadconfirmation.DownloadConfirmationScreen (DownloadConfirmationScreen.kt:29)");
            }
            f.a aVarF = f(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarF instanceof f.a.DownloadingConfirmation) {
                rVarH.X(-1188275281);
                h((f.a.DownloadingConfirmation) aVarF, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarF instanceof f.a.Error)) {
                    rVarH.X(-1188278171);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1188271479);
                ((f.a.Error) aVarF).getErrorVMSAdapter().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: na3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a f(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f fVar, int i15, p076m2.r rVar, int i16) {
        e(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final f.a.DownloadingConfirmation downloadingConfirmation, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1939025033);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(downloadingConfirmation) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1939025033, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.downloadconfirmation.DownloadConfirmationScreenContent (DownloadConfirmationScreen.kt:39)");
            }
            cb4.i dialogVmsAdapter = downloadingConfirmation.getDialogVmsAdapter();
            if (dialogVmsAdapter == null) {
                rVarH.X(1815509250);
            } else {
                rVarH.X(612754143);
                dialogVmsAdapter.b(rVarH, 0);
            }
            rVarH.R();
            i50.s.r(downloadingConfirmation.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2097474332, true, new er.q() { // from class: na3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.i(downloadingConfirmation, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(downloadingConfirmation);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: na3.i
                    @Override // er.a
                    public final Object a() {
                        return k.j(downloadingConfirmation);
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
            d5VarM.a(new er.p() { // from class: na3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(downloadingConfirmation, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f.a.DownloadingConfirmation downloadingConfirmation, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2097474332, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.downloadconfirmation.DownloadConfirmationScreenContent.<anonymous> (DownloadConfirmationScreen.kt:44)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
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
            x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, downloadingConfirmation.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, Float.valueOf(-2.0f), false, false, null, rVar, 0, 0, 0, 30928859);
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
    public static final i0 j(f.a.DownloadingConfirmation downloadingConfirmation) {
        downloadingConfirmation.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f.a.DownloadingConfirmation downloadingConfirmation, int i15, p076m2.r rVar, int i16) {
        h(downloadingConfirmation, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
