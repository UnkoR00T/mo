package mc;

import fr.t;
import ju.l0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmc/f;", "Lmc/i;", "Ltq/i;", "context", "<init>", "(Ltq/i;)V", "old", "new", "a", "(Ltq/i;Ltq/i;)Lmc/i;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends ForwardingCoroutineContext {
    public f(tq.i iVar) {
        super(iVar);
    }

    @Override // mc.ForwardingCoroutineContext
    public ForwardingCoroutineContext a(tq.i old, tq.i iVar) {
        l0 l0VarE = m.e(old);
        l0 l0VarE2 = m.e(iVar);
        if ((l0VarE instanceof DeferredDispatchCoroutineDispatcher) && !t.c(l0VarE, l0VarE2)) {
            ((DeferredDispatchCoroutineDispatcher) l0VarE).j2(false);
        }
        return new f(iVar);
    }
}
