package p143z0;

import er.l;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lz0/d3;", "Lz0/e1;", "Lz0/h2;", "", "initialVelocity", "Lkotlin/Function1;", "Loq/i0;", "onRemainingDistanceUpdated", "b", "(Lz0/h2;FLer/l;Ltq/e;)Ljava/lang/Object;", "a", "(Lz0/h2;FLtq/e;)Ljava/lang/Object;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d3 extends e1 {
    static /* synthetic */ Object c(d3 d3Var, h2 h2Var, float f15, e<? super Float> eVar) {
        return d3Var.b(h2Var, f15, C6465f3.f231251a, eVar);
    }

    @Override // p143z0.e1
    default Object a(h2 h2Var, float f15, e<? super Float> eVar) {
        return c(this, h2Var, f15, eVar);
    }

    Object b(h2 h2Var, float f15, l<? super Float, i0> lVar, e<? super Float> eVar);
}
