package p076m2;

import er.l;
import p071kotlin.Metadata;
import tq.e;
import tq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0005\"\u001e\u0010\r\u001a\u00020\b*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "c", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "b", "Ltq/i;", "Lm2/l2;", "a", "(Ltq/i;)Lm2/l2;", "getMonotonicFrameClock$annotations", "(Ltq/i;)V", "monotonicFrameClock", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n2 {
    public static final l2 a(i iVar) {
        l2 l2Var = (l2) iVar.m(l2.INSTANCE);
        if (l2Var != null) {
            return l2Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object b(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        return a(eVar.getContext()).x1(new m2(lVar), eVar);
    }

    public static final <R> Object c(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        return a(eVar.getContext()).x1(lVar, eVar);
    }
}
