package p076m2;

import er.l;
import er.p;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\f\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0012\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0012\u0010\rJ!\u0010\u0013\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0013\u0010\u0011\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0014"}, d2 = {"Lm2/n6;", "T", "", "Lm2/r;", "composer", "c", "(Lm2/r;)Lm2/r;", "V", "value", "Lkotlin/Function2;", "Loq/i0;", "block", "i", "(Lm2/r;Ljava/lang/Object;Ler/p;)V", "j", "Lkotlin/Function1;", "d", "(Lm2/r;Ler/l;)V", "e", "g", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n6<T> {
    public static <T> r c(r rVar) {
        return rVar;
    }

    public static final void d(r rVar, final l<? super T, i0> lVar) {
        if (rVar.f()) {
            rVar.j(i0.f148189a, new p() { // from class: m2.m6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n6.f(lVar, obj, (i0) obj2);
                }
            });
        }
    }

    public static final <V> void e(r rVar, V v15, p<? super T, ? super V, i0> pVar) {
        if (rVar.f()) {
            rVar.j(v15, pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, Object obj, i0 i0Var) {
        lVar.b(obj);
        return i0.f148189a;
    }

    public static final void g(r rVar, final l<? super T, i0> lVar) {
        rVar.j(i0.f148189a, new p() { // from class: m2.l6
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return n6.h(lVar, obj, (i0) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, Object obj, i0 i0Var) {
        lVar.b(obj);
        return i0.f148189a;
    }

    public static final <V> void i(r rVar, V v15, p<? super T, ? super V, i0> pVar) {
        if (rVar.f() || !t.c(rVar.E(), v15)) {
            rVar.v(v15);
            rVar.j(v15, pVar);
        }
    }

    public static final <V> void j(r rVar, V v15, p<? super T, ? super V, i0> pVar) {
        boolean zF = rVar.f();
        if (zF || !t.c(rVar.E(), v15)) {
            rVar.v(v15);
            if (zF) {
                return;
            }
            rVar.j(v15, pVar);
        }
    }
}
