package p086nu;

import p071kotlin.Metadata;
import tq.e;
import tq.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lnu/b0;", "T", "Ltq/e;", "Lvq/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "Ltq/i;", "context", "<init>", "(Ltq/e;Ltq/i;)V", "Loq/t;", "result", "Loq/i0;", "i", "(Ljava/lang/Object;)V", "a", "Ltq/e;", "b", "Ltq/i;", "c", "()Ltq/i;", "e", "()Lvq/e;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b0<T> implements e<T>, vq.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e<T> uCont;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i context;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(e<? super T> eVar, i iVar) {
        this.uCont = eVar;
        this.context = iVar;
    }

    @Override // tq.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public i getContext() {
        return this.context;
    }

    @Override // vq.e
    public vq.e e() {
        e<T> eVar = this.uCont;
        if (eVar instanceof vq.e) {
            return (vq.e) eVar;
        }
        return null;
    }

    @Override // tq.e
    public void i(Object result) {
        this.uCont.i(result);
    }
}
