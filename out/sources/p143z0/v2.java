package p143z0;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lz0/v2;", "", "Lw0/z1;", "scrollPriority", "Lkotlin/Function2;", "Lz0/h2;", "Ltq/e;", "Loq/i0;", "block", "b", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "", "delta", "f", "(F)F", "", "c", "()Z", "isScrollInProgress", "e", "canScrollForward", "d", "canScrollBackward", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface v2 {
    static /* synthetic */ Object a(v2 v2Var, z1 z1Var, p pVar, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i15 & 1) != 0) {
            z1Var = z1.Default;
        }
        return v2Var.b(z1Var, pVar, eVar);
    }

    Object b(z1 z1Var, p<? super h2, ? super e<? super i0>, ? extends Object> pVar, e<? super i0> eVar);

    boolean c();

    default boolean d() {
        return true;
    }

    default boolean e() {
        return true;
    }

    float f(float delta);
}
