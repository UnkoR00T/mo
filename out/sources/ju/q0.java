package ju;

import java.util.concurrent.CancellationException;
import ou.CoroutineScope;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001b\u0010\u001c\u001a\u00020\u0018*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lju/p0;", "Ltq/i;", "context", "h", "(Lju/p0;Ltq/i;)Lju/p0;", "b", "()Lju/p0;", "R", "Lkotlin/Function2;", "Ltq/e;", "", "block", "e", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/i;)Lju/p0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Loq/i0;", "c", "(Lju/p0;Ljava/util/concurrent/CancellationException;)V", "f", "(Lju/p0;)V", "", "g", "(Lju/p0;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {
    public static final p0 a(tq.i iVar) {
        if (iVar.m(d2.INSTANCE) == null) {
            iVar = iVar.n0(h2.b(null, 1, null));
        }
        return new CoroutineScope(iVar);
    }

    public static final p0 b() {
        return new CoroutineScope(z2.b(null, 1, null).n0(g1.c()));
    }

    public static final void c(p0 p0Var, CancellationException cancellationException) {
        d2 d2Var = (d2) p0Var.getCoroutineContext().m(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.u(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + p0Var).toString());
    }

    public static /* synthetic */ void d(p0 p0Var, CancellationException cancellationException, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            cancellationException = null;
        }
        c(p0Var, cancellationException);
    }

    public static final <R> Object e(er.p<? super p0, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        ou.a0 a0Var = new ou.a0(eVar.getContext(), eVar);
        Object objD = pu.b.d(a0Var, a0Var, pVar);
        if (objD == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objD;
    }

    public static final void f(p0 p0Var) {
        g2.j(p0Var.getCoroutineContext());
    }

    public static final boolean g(p0 p0Var) {
        d2 d2Var = (d2) p0Var.getCoroutineContext().m(d2.INSTANCE);
        if (d2Var != null) {
            return d2Var.h();
        }
        return true;
    }

    public static final p0 h(p0 p0Var, tq.i iVar) {
        return new CoroutineScope(p0Var.getCoroutineContext().n0(iVar));
    }
}
