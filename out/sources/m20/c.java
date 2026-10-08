package m20;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a3;
import d1.b0;
import d1.c0;
import d1.k;
import er.p;
import er.q;
import n3.l0;
import oq.i0;
import p036e4.l;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import w0.i1;
import w0.o;
import w0.q0;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/graphics/Bitmap;", "qrCodeBitmap", "Loq/i0;", "c", "(Landroid/graphics/Bitmap;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void c(final Bitmap bitmap, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1606995304);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(bitmap) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1606995304, i16, -1, "pl.gov.coi.common.ui.custom.qrcode.QRCode (QRCode.kt:29)");
            }
            b0.d(null, null, false, m.d(-1881100414, true, new q() { // from class: m20.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return c.d(bitmap, (c0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 3072, 7);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: m20.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(bitmap, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(Bitmap bitmap, c0 c0Var, r rVar, int i15) {
        c0 c0Var2;
        int i16;
        if ((i15 & 6) == 0) {
            c0Var2 = c0Var;
            i16 = i15 | (rVar.W(c0Var2) ? 4 : 2);
        } else {
            c0Var2 = c0Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1881100414, i16, -1, "pl.gov.coi.common.ui.custom.qrcode.QRCode.<anonymous> (QRCode.kt:31)");
            }
            float fN = h.n(c0Var2.a() * 0.05f);
            i1.g(l0.c(bitmap), null, q0.c(k.b(d.h(a3.n(o.i(f3.m.INSTANCE, fN, Color.INSTANCE.i(), null, 4, null), fN), 0.0f, 1, null), 1.0f, false, 2, null), false, null, 2, null), null, l.INSTANCE.d(), 0.0f, null, 0, rVar, 24624, 232);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Bitmap bitmap, int i15, r rVar, int i16) {
        c(bitmap, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
