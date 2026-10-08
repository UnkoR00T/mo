package p056h1;

import b3.f;
import b3.i;
import b3.u;
import b3.x;
import er.a;
import er.p;
import er.q;
import java.util.List;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import pq.v0;
import y2.m;

/* JADX INFO: renamed from: h1.m2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Lb3/i;", "Loq/i0;", "content", "d", "(Ler/q;Lm2/r;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Function1 {
    public static final void d(final q<? super i, ? super r, ? super Integer, i0> qVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-709502251);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(qVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-709502251, i16, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            final b3.r rVar2 = (b3.r) rVarH.N(u.g());
            final i iVarB = b3.q.b(rVarH, 0);
            Object[] objArr = {rVar2};
            x<i2, Map<String, List<Object>>> xVarC = i2.INSTANCE.c(rVar2, iVarB);
            boolean zG = rVarH.G(rVar2) | rVarH.G(iVarB);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a() { // from class: h1.j2
                    @Override // er.a
                    public final Object a() {
                        return Function1.e(rVar2, iVarB);
                    }
                };
                rVarH.v(objE);
            }
            final i2 i2Var = (i2) f.i(objArr, xVarC, (a) objE, rVarH, 0);
            d0.c(u.g().d(i2Var), m.d(-412824043, true, new p() { // from class: h1.k2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.f(qVar, i2Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h1.l2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.g(qVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i2 e(b3.r rVar, i iVar) {
        return new i2(rVar, v0.i(), iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(q qVar, i2 i2Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-412824043, i15, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            qVar.w(i2Var, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(q qVar, int i15, r rVar, int i16) {
        d(qVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
