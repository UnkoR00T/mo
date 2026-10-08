package h72;

import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import f3.j;
import h60.f;
import h60.g;
import j70.h;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh72/a;", "data", "Loq/i0;", "c", "(Lh72/a;Lm2/r;I)V", "floodalert_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void c(final SingleCardTextIconData singleCardTextIconData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1857635049);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(singleCardTextIconData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1857635049, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.alarmstates.model.SingleCardTextIcon (SingleCardTextIcon.kt:20)");
            }
            x30.c.c(null, 0.0f, m.d(-1932144362, true, new p() { // from class: h72.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.d(singleCardTextIconData, (r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new p() { // from class: h72.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.e(singleCardTextIconData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(SingleCardTextIconData singleCardTextIconData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1932144362, i15, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.alarmstates.model.SingleCardTextIcon.<anonymous> (SingleCardTextIcon.kt:22)");
            }
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            i.e eVarF = i.f39152a.f();
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarB = m3.b(eVarF, interfaceC1317cI, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, companion);
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            f3.m mVarC = p3.c(q3.f39261a, companion, 1.0f, false, 2, null);
            Label text = singleCardTextIconData.getText();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            h.g(mVarC, null, text, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026010);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            f.e(null, null, Integer.valueOf(singleCardTextIconData.getImageResId()), g.Big, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVar, 3072, 0, 4083);
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
    public static final i0 e(SingleCardTextIconData singleCardTextIconData, int i15, r rVar, int i16) {
        c(singleCardTextIconData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
