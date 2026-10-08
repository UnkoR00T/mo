package z30;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import b1.f;
import b1.k;
import b1.l;
import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import d40.h;
import er.p;
import f3.j;
import f3.m;
import fr.o0;
import n3.y2;
import n4.f0;
import n4.i0;
import n4.v;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.j1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a?\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lz30/a;", "data", "Loq/i0;", "d", "(Lz30/a;Lm2/r;I)V", "Lf3/m;", "Lb1/l;", "interactionSource", "Lw0/j1;", "indication", "", "debounceTime", "Lkotlin/Function0;", "onClick", "g", "(Lf3/m;Lb1/l;Lw0/j1;JLer/a;Lm2/r;II)Lf3/m;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void d(final FileBottomSheetItemData fileBottomSheetItemData, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1910925263);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(fileBottomSheetItemData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1910925263, i16, -1, "pl.gov.coi.common.ui.ds.custom.FileBottomSheetItem (FileBottomSheetItem.kt:47)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            l lVar = (l) objE;
            f6<Boolean> f6VarA = f.a(lVar, rVarH, 6);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            y2 radius200 = aVar.e(rVarH, i17).getRadius200();
            m.Companion companion2 = m.INSTANCE;
            m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(s.B(companion2, f6VarA, radius200, rVarH, 6), 0.0f, 1, null), aVar.b(rVarH, i17).getSpacing600());
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.l() { // from class: z30.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.e((i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarG = g(v.d(mVarI, false, (er.l) objE2, 1, null), lVar, null, 0L, fileBottomSheetItemData.b(), rVarH, 48, 6);
            w0 w0VarB = m3.b(i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarG);
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
            h.f(null, fileBottomSheetItemData.getIconData(), false, rVarH, 0, 5);
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, fileBottomSheetItemData.getTitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
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
            d5VarM.a(new p() { // from class: z30.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.f(fileBottomSheetItemData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(i0 i0Var) {
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(FileBottomSheetItemData fileBottomSheetItemData, int i15, r rVar, int i16) {
        d(fileBottomSheetItemData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @SuppressLint({"SuspiciousModifierThen"})
    private static final m g(m mVar, l lVar, j1 j1Var, final long j15, final er.a<oq.i0> aVar, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = k.a();
                rVar.v(objE);
            }
            lVar = (l) objE;
        }
        l lVar2 = lVar;
        if ((i16 & 2) != 0) {
            j1Var = s.E(0.0f, rVar, 0, 1);
        }
        j1 j1Var2 = j1Var;
        if ((i16 & 4) != 0) {
            j15 = 300;
        }
        if (t.k()) {
            t.o(-1105328135, i15, -1, "pl.gov.coi.common.ui.ds.custom.debounceClick (FileBottomSheetItem.kt:86)");
        }
        final o0 o0Var = new o0();
        Object objE2 = rVar.E();
        if (objE2 == r.INSTANCE.a()) {
            objE2 = 0L;
            rVar.v(objE2);
        }
        o0Var.f66408a = ((Number) objE2).longValue();
        m mVarU = mVar.u(androidx.compose.foundation.b.l(mVar, lVar2, j1Var2, false, null, null, new er.a() { // from class: z30.d
            @Override // er.a
            public final Object a() {
                return e.h(o0Var, j15, aVar);
            }
        }, 28, null));
        if (t.k()) {
            t.n();
        }
        return mVarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(o0 o0Var, long j15, er.a aVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - o0Var.f66408a > j15) {
            o0Var.f66408a = jElapsedRealtime;
            aVar.a();
        }
        return oq.i0.f148189a;
    }
}
