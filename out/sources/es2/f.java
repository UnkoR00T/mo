package es2;

import d1.a3;
import d1.e0;
import d1.m3;
import d1.q3;
import d1.r3;
import gs2.PenaltyPointsCardModel;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lgs2/a;", "data", "Loq/i0;", "c", "(Lgs2/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "circleSize", "penaltypoints_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f53291a = c5.h.n(64);

    public static final void c(final PenaltyPointsCardModel penaltyPointsCardModel, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-610382173);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(penaltyPointsCardModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-610382173, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.main.PenaltyPointsCard (PenaltyPointsCard.kt:27)");
            }
            x30.c.c(null, 0.0f, y2.m.d(800612066, true, new er.p() { // from class: es2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.d(penaltyPointsCardModel, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: es2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.e(penaltyPointsCardModel, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(PenaltyPointsCardModel penaltyPointsCardModel, p076m2.r rVar, int i15) {
        long jF;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(800612066, i15, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.main.PenaltyPointsCard.<anonymous> (PenaltyPointsCard.kt:29)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            w0 w0VarB = m3.b(iVar.j(), companion2.i(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            float spacing50 = aVar.b(rVar, i16).getSpacing50();
            gs2.b penaltyPointsStatus = penaltyPointsCardModel.getPenaltyPointsStatus();
            if (penaltyPointsStatus instanceof gs2.b.Active) {
                rVar.X(763376692);
                jF = aVar.a(rVar, i16).getSupport().g();
                rVar.R();
            } else if (penaltyPointsStatus instanceof gs2.b.Lack) {
                rVar.X(763379574);
                jF = aVar.a(rVar, i16).getSupport().d();
                rVar.R();
            } else {
                if (!(penaltyPointsStatus instanceof gs2.b.Temporary)) {
                    rVar.X(763373396);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(763382678);
                jF = aVar.a(rVar, i16).getSupport().f();
                rVar.R();
            }
            f3.m mVarT = androidx.compose.foundation.layout.d.t(w0.o.g(companion, w0.x.a(spacing50, jF), l1.h.i()), f53291a);
            w0 w0VarI = d1.r.i(companion2.e(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarT);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarI, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d1.x xVar = d1.x.f39368a;
            j70.h.g(null, null, penaltyPointsCardModel.getPenaltyPoints(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).k(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            j70.h.g(null, null, penaltyPointsCardModel.getPenaltyPointsStatus().getLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            rVar2.x();
            Label bottomMessage = penaltyPointsCardModel.getBottomMessage();
            if (bottomMessage == null) {
                rVar2.X(-1244013336);
            } else {
                rVar2.X(-1244013335);
                j70.h.g(a3.r(companion, 0.0f, aVar.b(rVar2, i16).getSpacing250(), 0.0f, 0.0f, 13, null), null, bottomMessage, null, null, aVar.a(rVar2, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
                rVar2 = rVar;
                i0 i0Var2 = i0.f148189a;
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(PenaltyPointsCardModel penaltyPointsCardModel, int i15, p076m2.r rVar, int i16) {
        c(penaltyPointsCardModel, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
