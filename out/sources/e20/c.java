package e20;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.l;
import er.p;
import java.util.ArrayList;
import java.util.Iterator;
import lr.m;
import mx.Label;
import n4.f0;
import n4.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import pq.s0;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Le20/k;", "flag", "", "isRunning", "Lmx/a;", "iconContentDescription", "Loq/i0;", "c", "(Le20/k;ZLmx/a;Lm2/r;II)V", "", "f", "(Le20/k;)I", "Lc5/h;", "a", "F", "getLOCAL_DOCUMENT_FLAG_WIDTH", "()F", "LOCAL_DOCUMENT_FLAG_WIDTH", "b", "getLOCAL_DOCUMENT_FLAG_HEIGHT", "LOCAL_DOCUMENT_FLAG_HEIGHT", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f46916a = c5.h.n(70);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f46917b = c5.h.n(45);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46918a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.Poland.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.Ukraine.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46918a = iArr;
        }
    }

    public static final void c(final k kVar, boolean z15, final Label label, r rVar, final int i15, final int i16) {
        int i17;
        final boolean z16;
        r rVarH = rVar.h(109973726);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.c(kVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(label) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                z15 = true;
            }
            if (t.k()) {
                t.o(109973726, i17, -1, "pl.gov.coi.common.ui.animation.AnimatedFlag (AnimatedFlag.kt:23)");
            }
            TypedArray typedArrayObtainTypedArray = ((Context) rVarH.N(AndroidCompositionLocals_androidKt.c())).getResources().obtainTypedArray(f(kVar));
            lr.i iVarW = m.w(0, typedArrayObtainTypedArray.length());
            ArrayList arrayList = new ArrayList(v.y(iVarW, 10));
            Iterator<Integer> it = iVarW.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(typedArrayObtainTypedArray.getResourceId(((s0) it).nextInt(), 0)));
            }
            typedArrayObtainTypedArray.recycle();
            f3.m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(f3.m.INSTANCE, f46916a), f46917b);
            boolean z17 = (i17 & 896) == 256;
            Object objE = rVarH.E();
            if (z17 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: e20.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c.d(label, (i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            boolean z18 = z15;
            e.b(arrayList, z18, 0, n4.v.d(mVarI, false, (l) objE, 1, null), rVarH, i17 & 112, 4);
            if (t.k()) {
                t.n();
            }
            z16 = z18;
        } else {
            rVarH.O();
            z16 = z15;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e20.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(kVar, z16, label, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(Label label, i0 i0Var) {
        f0.y0(i0Var, "flag");
        f0.c0(i0Var, label.getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(k kVar, boolean z15, Label label, int i15, int i16, r rVar, int i17) {
        c(kVar, z15, label, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final int f(k kVar) {
        int i15 = a.f46918a[kVar.ordinal()];
        if (i15 == 1) {
            return c20.a.f22643a;
        }
        if (i15 == 2) {
            return c20.a.f22644b;
        }
        throw new oq.p();
    }
}
