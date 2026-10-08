package k12;

import d1.a3;
import d1.e0;
import er.p;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q12.MessageInitializedViewState;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq12/a;", "data", "Loq/i0;", "d", "(Lq12/a;Lm2/r;I)V", "g", "(Lm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void d(final MessageInitializedViewState messageInitializedViewState, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(983008406);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(messageInitializedViewState) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(983008406, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.common.custom.MessageDetailsCommonContent (MessageDetailsCommonContent.kt:12)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-1355908395, true, new p() { // from class: k12.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.e(messageInitializedViewState, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k12.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(messageInitializedViewState, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(MessageInitializedViewState messageInitializedViewState, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1355908395, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.common.custom.MessageDetailsCommonContent.<anonymous> (MessageDetailsCommonContent.kt:14)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o.b(messageInitializedViewState.getMessageSectionData().getTitle(), rVar, 0);
            g(rVar, 0);
            c.c(messageInitializedViewState.getMessageSectionData().b(), messageInitializedViewState.getMessageSectionData().getStatus(), messageInitializedViewState.getMessageSectionData().getDetailsButtonData(), rVar, (r50.a.WithIcon.f171875m << 3) | (ButtonTextData.f99099f << 6));
            Label messageBody = messageInitializedViewState.getMessageSectionData().getMessageBody();
            if (messageBody == null) {
                rVar.X(-1076209556);
            } else {
                rVar.X(-1076209555);
                g(rVar, 0);
                m.b(messageBody, rVar, 0);
            }
            rVar.R();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(MessageInitializedViewState messageInitializedViewState, int i15, r rVar, int i16) {
        d(messageInitializedViewState, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void g(r rVar, final int i15) {
        r rVarH = rVar.h(1786271244);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(1786271244, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.common.custom.SectionDivider (MessageDetailsCommonContent.kt:35)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            vb.h(a3.p(companion, 0.0f, aVar.b(rVarH, i16).getSpacing300(), 1, null), aVar.b(rVarH, i16).getStrokeWidth(), aVar.a(rVarH, i16).getNeutral().g(), rVarH, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k12.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.h(i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(int i15, r rVar, int i16) {
        g(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
