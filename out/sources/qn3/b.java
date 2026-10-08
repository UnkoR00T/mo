package qn3;

import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import er.p;
import f3.j;
import f3.m;
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
import w0.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmx/a;", "text", "Ldn3/b;", "status", "Lf3/m;", "modifier", "Loq/i0;", "b", "(Lmx/a;Ldn3/b;Lf3/m;Lm2/r;II)V", "vehicles_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x016b  */
    /* JADX WARN: Code duplicated, block: B:50:0x016f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void b(final Label label, final dn3.b bVar, m mVar, r rVar, final int i15, final int i16) {
        Label label2;
        int i17;
        m mVar2;
        boolean z15;
        final m mVar3;
        d5 d5VarM;
        er.a<androidx.compose.ui.node.c> aVarB;
        r rVarH = rVar.h(36509505);
        if ((i15 & 6) == 0) {
            label2 = label;
            i17 = (rVarH.W(label2) ? 4 : 2) | i15;
        } else {
            label2 = label;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.c(bVar.ordinal()) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (t.k()) {
                    t.o(36509505, i17, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.component.ValidityStatusLabel (ValidityStatusLabel.kt:24)");
                }
                w0 w0VarB = m3.b(i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVar3);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion.b();
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
                n6.i(rVarC, w0VarB, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                q3 q3Var = q3.f39261a;
                androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(bVar.getIconResId(), rVarH, 0);
                m.Companion companion2 = m.INSTANCE;
                i1.c(aVarC, null, androidx.compose.foundation.layout.d.t(companion2, h60.g.MSmall.getDimension()), null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
                k70.a aVar = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i19).getSpacing100()), rVarH, 0);
                j70.h.g(null, null, label2, null, null, aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).d(), null, null, false, false, null, rVarH, (i17 << 6) & 896, 0, 0, 33030107);
                rVarH = rVarH;
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: qn3.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b.c(label, bVar, mVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                mVar3 = m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (t.k()) {
                t.o(36509505, i17, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.component.ValidityStatusLabel (ValidityStatusLabel.kt:24)");
            }
            w0 w0VarB2 = m3.b(i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVar3);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var2 = q3.f39261a;
            androidx.compose.ui.graphics.painter.a aVarC2 = l4.c.c(bVar.getIconResId(), rVarH, 0);
            m.Companion companion4 = m.INSTANCE;
            i1.c(aVarC2, null, androidx.compose.foundation.layout.d.t(companion4, h60.g.MSmall.getDimension()), null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
            k70.a aVar2 = k70.a.f108864a;
            int i110 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion4, aVar2.b(rVarH, i110).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, label2, null, null, aVar2.a(rVarH, i110).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i110).d(), null, null, false, false, null, rVarH, (i17 << 6) & 896, 0, 0, 33030107);
            rVarH = rVarH;
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: qn3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(label, bVar, mVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(Label label, dn3.b bVar, m mVar, int i15, int i16, r rVar, int i17) {
        b(label, bVar, mVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
