package p076m2;

import er.a;
import er.l;
import er.p;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0014\u001a\u00020\u00122\u001a\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f\"\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0017\u001a\u00020\u00122\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "Lm2/w5;", "policy", "Lkotlin/Function0;", "defaultFactory", "Lm2/b4;", "g", "(Lm2/w5;Ler/a;)Lm2/b4;", "j", "(Ler/a;)Lm2/b4;", "Lkotlin/Function1;", "Lm2/a0;", "defaultComputation", "i", "(Ler/l;)Lm2/b4;", "", "Lm2/c4;", "values", "Loq/i0;", "content", "d", "([Lm2/c4;Ler/p;Lm2/r;I)V", "value", "c", "(Lm2/c4;Ler/p;Lm2/r;I)V", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {
    public static final void c(final c4<?> c4Var, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        r rVarH = rVar.h(-149765515);
        if (t.k()) {
            t.o(-149765515, i15, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:425)");
        }
        rVarH.D(c4Var);
        pVar.B(rVarH, Integer.valueOf((i15 >> 3) & 14));
        rVarH.w();
        if (t.k()) {
            t.n();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: m2.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.f(c4Var, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(final c4<?>[] c4VarArr, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        r rVarH = rVar.h(415205898);
        if (t.k()) {
            t.o(415205898, i15, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:405)");
        }
        rVarH.e(c4VarArr);
        pVar.B(rVarH, Integer.valueOf((i15 >> 3) & 14));
        rVarH.P();
        if (t.k()) {
            t.n();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: m2.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.e(c4VarArr, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(c4[] c4VarArr, p pVar, int i15, r rVar, int i16) {
        d(c4VarArr, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c4 c4Var, p pVar, int i15, r rVar, int i16) {
        c(c4Var, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final <T> b4<T> g(w5<T> w5Var, a<? extends T> aVar) {
        return new t0(w5Var, aVar);
    }

    public static /* synthetic */ b4 h(w5 w5Var, a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            w5Var = x5.r();
        }
        return g(w5Var, aVar);
    }

    public static final <T> b4<T> i(l<? super a0, ? extends T> lVar) {
        return new j0(lVar);
    }

    public static final <T> b4<T> j(a<? extends T> aVar) {
        return new g6(aVar);
    }
}
