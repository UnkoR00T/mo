package v30;

import d1.e0;
import d1.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lw30/a;", "data", "Loq/i0;", "f", "(Lw30/a;Lm2/r;I)V", "d", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203429a;

        static {
            int[] iArr = new int[r30.c.values().length];
            try {
                iArr[r30.c.CONTENT_BOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r30.c.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f203429a = iArr;
        }
    }

    private static final void d(final CheckBoxSingleData checkBoxSingleData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(823678348);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(checkBoxSingleData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(823678348, i16, -1, "pl.gov.coi.common.ui.ds.checkbox.single.CheckBoxContainer (CheckBoxSingle.kt:35)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            q30.i.g(checkBoxSingleData.getCheckbox(), checkBoxSingleData.getType(), checkBoxSingleData.getIsEnabled(), rVarH, 0);
            q30.b.b(checkBoxSingleData.getType(), rVarH, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v30.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.e(checkBoxSingleData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(CheckBoxSingleData checkBoxSingleData, int i15, r rVar, int i16) {
        d(checkBoxSingleData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void f(final CheckBoxSingleData checkBoxSingleData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1050801955);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(checkBoxSingleData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1050801955, i16, -1, "pl.gov.coi.common.ui.ds.checkbox.single.CheckBoxSingle (CheckBoxSingle.kt:20)");
            }
            f3.m mVarE = d60.m.e(f3.m.INSTANCE, checkBoxSingleData.getFieldIndex(), rVarH, 6);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarE);
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
            n6.i(rVarC, mVarE2, companion.e());
            i0 i0Var = i0.f39176a;
            int i17 = a.f203429a[checkBoxSingleData.getContentType().ordinal()];
            if (i17 == 1) {
                rVarH.X(-2096222028);
                x30.c.c(null, 0.0f, y2.m.d(1853933170, true, new er.p() { // from class: v30.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.g(checkBoxSingleData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
                rVarH.R();
            } else {
                if (i17 != 2) {
                    rVarH.X(-2096224030);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2096218921);
                d(checkBoxSingleData, rVarH, i16 & 14);
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v30.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.h(checkBoxSingleData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(CheckBoxSingleData checkBoxSingleData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1853933170, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.single.CheckBoxSingle.<anonymous>.<anonymous> (CheckBoxSingle.kt:26)");
            }
            d(checkBoxSingleData, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(CheckBoxSingleData checkBoxSingleData, int i15, r rVar, int i16) {
        f(checkBoxSingleData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
