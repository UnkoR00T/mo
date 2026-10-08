package cq3;

import d1.e0;
import d1.i0;
import er.p;
import i30.ButtonIconData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcq3/f;", "viewModel", "Loq/i0;", "e", "(Lcq3/f;Lm2/r;I)V", "Lcq3/f$a;", "screenData", "c", "(Lcq3/f$a;Lm2/r;I)V", "state", "voteidea_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void c(final f.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1755629344);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1755629344, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.sendideasuccess.SendIdeaSuccessContent (SendIdeaSuccessScreen.kt:29)");
            }
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            rVar2 = rVarH;
            p70.n.g(null, null, Label.INSTANCE.c(), null, null, 0L, null, data.getCloseButtonData(), rVar2, ButtonIconData.f88935g << 21, 123);
            q40.i.b(data.c(), null, b.f37263a.b(), rVar2, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            q0.g(false, data.a(), rVar2, 0, 1);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: cq3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.d(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(f.Data data, int i15, r rVar, int i16) {
        c(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void e(final f fVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1224415471);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1224415471, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.sendideasuccess.SendIdeaSuccessScreen (SendIdeaSuccessScreen.kt:23)");
            }
            c(f(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, IconPageData.f164667h | IconPageBottomContentData.f164663d | ButtonIconData.f88935g);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: cq3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(fVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data f(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(f fVar, int i15, r rVar, int i16) {
        e(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
