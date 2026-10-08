package bh2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import n50.SingleCardConfig;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lbh2/d;", "viewModel", "Loq/i0;", "g", "(Lbh2/d;Lm2/r;I)V", "Lbh2/d$a$a;", "data", "d", "(Lbh2/d$a$a;Lm2/r;I)V", "Lbh2/d$a;", "state", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final void d(final d.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1487760791);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1487760791, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.orderdetails.OrderDetailsInitialized (OrderDetailsScreen.kt:39)");
            }
            q0.g(false, content.g(), rVarH, 0, 1);
            cb4.i dialogVMSAdapter = content.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(2114336386);
            } else {
                rVarH.X(-485984929);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(content.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(694745482, true, new er.q() { // from class: bh2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.e(content, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: bh2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.f(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(d.a.Content content, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        SingleCardConfig singleCardConfig;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(694745482, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.orderdetails.OrderDetailsInitialized.<anonymous> (OrderDetailsScreen.kt:47)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            Label screenTitle = content.getScreenTitle();
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            j70.h.g(null, null, screenTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing300()), rVar, 0);
            m30.i.d(content.getDocumentCards(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing300()), rVar, 0);
            n50.k downloadDocumentCard = content.getDownloadDocumentCard();
            if (downloadDocumentCard == null) {
                rVar.X(923273901);
                rVar.R();
                singleCardConfig = null;
                i17 = 2;
            } else {
                rVar.X(923273902);
                singleCardConfig = null;
                i17 = 2;
                h0.v(downloadDocumentCard, null, rVar, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
                rVar.R();
            }
            n50.k downloadConfirmationCard = content.getDownloadConfirmationCard();
            if (downloadConfirmationCard == null) {
                rVar.X(923439565);
            } else {
                rVar.X(923439566);
                h0.v(downloadConfirmationCard, singleCardConfig, rVar, 0, i17);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            }
            rVar.R();
            n50.k checkChangesCard = content.getCheckChangesCard();
            if (checkChangesCard == null) {
                rVar.X(923597293);
            } else {
                rVar.X(923597294);
                h0.v(checkChangesCard, singleCardConfig, rVar, 0, i17);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            }
            rVar.R();
            n50.k verificationCard = content.getVerificationCard();
            if (verificationCard == null) {
                rVar.X(923752696);
            } else {
                rVar.X(923752697);
                h0.v(verificationCard, singleCardConfig, rVar, 0, i17);
            }
            rVar.R();
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
    public static final i0 f(d.a.Content content, int i15, p076m2.r rVar, int i16) {
        d(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1782575824);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1782575824, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.orderdetails.OrderDetailsScreen (OrderDetailsScreen.kt:27)");
            }
            d.a aVarH = h(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof d.a.Content) {
                rVarH.X(-636577772);
                d((d.a.Content) aVarH, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof d.a.Error)) {
                    rVarH.X(-636579936);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-636574856);
                ((d.a.Error) aVarH).getError().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: bh2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a h(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d dVar, int i15, p076m2.r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
