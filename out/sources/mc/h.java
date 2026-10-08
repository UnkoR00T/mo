package mc;

import er.p;
import fr.t;
import ju.d2;
import ju.g1;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.r0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lju/p0;", "Lkotlin/Function2;", "Ltq/e;", "Loq/i0;", "", "block", "Lju/d2;", "a", "(Lju/p0;Ler/p;)Lju/d2;", "coil-compose-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final d2 a(p0 p0Var, p<? super p0, ? super tq.e<? super i0>, ? extends Object> pVar) {
        l0 l0VarE = m.e(p0Var.getCoroutineContext());
        return (l0VarE == null || t.c(l0VarE, g1.d())) ? ju.i.c(p0Var, g1.d(), r0.UNDISPATCHED, pVar) : ju.i.c(q0.a(new f(p0Var.getCoroutineContext())), new DeferredDispatchCoroutineDispatcher(l0VarE), r0.UNDISPATCHED, pVar);
    }
}
