package a70;

import android.graphics.Bitmap;
import d1.a3;
import d1.e0;
import d1.x;
import er.p;
import f3.m;
import h30.ButtonData;
import h30.q;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/graphics/Bitmap;", "qrCodeBitmap", "Lmx/a;", "closeButtonLabel", "Lkotlin/Function0;", "Loq/i0;", "closeButtonOnClick", "b", "(Landroid/graphics/Bitmap;Lmx/a;Ler/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void b(final Bitmap bitmap, final Label label, final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1892811131);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(bitmap) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-1892811131, i16, -1, "pl.gov.coi.common.ui.qrcode.EnlargedQrCodeContent (EnlargedQrCodeContent.kt:30)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarR = a3.r(w0.i.d(companion, aVar2.a(rVarH, i17).getNeutral().c(), null, 2, null), aVar2.b(rVarH, i17).getSpacing200(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), aVar2.b(rVarH, i17).getSpacing200(), 2, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), companion2.g(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m mVarR2 = a3.r(companion, 0.0f, aVar2.b(rVarH, i17).getSpacing300(), 0.0f, aVar2.b(rVarH, i17).getSpacing400(), 5, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            x xVar = x.f39368a;
            m20.c.c(bitmap, rVarH, i16 & 14);
            rVarH.x();
            rVar2 = rVarH;
            q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(label, null, 2, null), k30.d.a.f107773a, null, aVar, 35, null), false, null, rVar2, 0, 6);
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
            d5VarM.a(new p() { // from class: a70.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(bitmap, label, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(Bitmap bitmap, Label label, er.a aVar, int i15, r rVar, int i16) {
        b(bitmap, label, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
