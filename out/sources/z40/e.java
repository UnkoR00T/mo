package z40;

import d1.e0;
import d1.i;
import d1.r3;
import er.l;
import er.p;
import f3.j;
import f3.m;
import j70.h;
import mx.Label;
import n3.a3;
import n4.f0;
import n4.i0;
import n4.v;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz40/a;", "data", "Loq/i0;", "d", "(Lz40/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void d(final a aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        m.Companion companion;
        int i17;
        String str;
        r rVarH = rVar.h(91172529);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(91172529, i16, -1, "pl.gov.coi.common.ui.ds.progressbar.ProgressBar (ProgressBar.kt:27)");
            }
            final float value = (float) (((double) aVar.getValue()) / 100.0d);
            m.Companion companion2 = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar));
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: z40.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.e(aVar, (i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD = v.d(mVarH, false, (l) objE, 1, null);
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
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
            if (aVar instanceof a.IndicatorBar) {
                rVarH.X(-1389617191);
                m mVarG = androidx.compose.foundation.layout.d.g(companion2, value);
                a.IndicatorBar indicatorBar = (a.IndicatorBar) aVar;
                String testTag = indicatorBar.getTestTag();
                if (testTag != null) {
                    str = testTag + "Text";
                } else {
                    str = null;
                }
                Label label = indicatorBar.getLabel();
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                companion = companion2;
                h.g(mVarG, str, label, null, null, aVar2.a(rVarH, i18).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.b()), 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).f(), null, null, false, false, null, rVarH, 0, 0, 0, 33026008);
                rVarH = rVarH;
                i17 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i18).getSpacing50()), rVarH, 0);
            } else {
                companion = companion2;
                i17 = 0;
                rVarH.X(-1391016345);
            }
            rVarH.R();
            m mVarH2 = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            long jM20unboximpl = aVar.b().B(rVarH, Integer.valueOf(i17)).m20unboximpl();
            int iB = a3.INSTANCE.b();
            boolean zB = rVarH.b(value);
            Object objE2 = rVarH.E();
            if (zB || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: z40.c
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(e.f(value));
                    }
                };
                rVarH.v(objE2);
            }
            k60.c.c(mVarH2, (er.a) objE2, iB, jM20unboximpl, rVarH, 6, 0);
            rVar2 = rVarH;
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
            d5VarM.a(new p() { // from class: z40.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(a aVar, i0 i0Var) {
        String testTag = aVar.getTestTag();
        if (testTag == null) {
            testTag = "Progress";
        }
        f0.y0(i0Var, testTag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float f15) {
        return f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(a aVar, int i15, r rVar, int i16) {
        d(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
