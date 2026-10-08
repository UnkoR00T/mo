package p086nu;

import er.p;
import fr.w0;
import mu.h;
import ou.l0;
import p071kotlin.Metadata;
import tq.e;
import tq.i;
import uq.b;
import vq.a;
import vq.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aZ\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lmu/h;", "Ltq/i;", "emitContext", "d", "(Lmu/h;Ltq/i;)Lmu/h;", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Ltq/e;", "block", "b", "(Ltq/i;Ljava/lang/Object;Ljava/lang/Object;Ler/p;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final <T, V> Object b(i iVar, V v15, Object obj, p<? super V, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        Object objI = l0.i(iVar, obj);
        try {
            b0 b0Var = new b0(eVar, iVar);
            Object objD = !(pVar instanceof a) ? b.d(pVar, v15, b0Var) : ((p) w0.g(pVar, 2)).B(v15, b0Var);
            l0.f(iVar, objI);
            if (objD == b.e()) {
                g.c(eVar);
            }
            return objD;
        } catch (Throwable th4) {
            l0.f(iVar, objI);
            throw th4;
        }
    }

    public static /* synthetic */ Object c(i iVar, Object obj, Object obj2, p pVar, e eVar, int i15, Object obj3) {
        if ((i15 & 4) != 0) {
            obj2 = l0.g(iVar);
        }
        return b(iVar, obj, obj2, pVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h<T> d(h<? super T> hVar, i iVar) {
        return ((hVar instanceof a0) || (hVar instanceof t)) ? hVar : new d0(hVar, iVar);
    }
}
