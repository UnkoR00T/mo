package p086nu;

import fr.k;
import lu.a;
import mu.g;
import mu.h;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import tq.j;
import uq.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnu/i;", "T", "Lnu/h;", "Lmu/g;", "flow", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Lmu/g;Ltq/i;ILlu/a;)V", "Lnu/e;", "h", "(Ltq/i;ILlu/a;)Lnu/e;", "i", "()Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "q", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T> extends h<T, T> {
    public /* synthetic */ i(g gVar, tq.i iVar, int i15, a aVar, int i16, k kVar) {
        this(gVar, (i16 & 2) != 0 ? j.f191408a : iVar, (i16 & 4) != 0 ? -3 : i15, (i16 & 8) != 0 ? a.SUSPEND : aVar);
    }

    @Override // p086nu.e
    protected e<T> h(tq.i context, int capacity, a onBufferOverflow) {
        return new i(this.flow, context, capacity, onBufferOverflow);
    }

    @Override // p086nu.e
    public g<T> i() {
        return (g<T>) this.flow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p086nu.h
    protected Object q(h<? super T> hVar, e<? super i0> eVar) {
        Object objA = this.flow.a((h<? super S>) hVar, eVar);
        return objA == b.e() ? objA : i0.f148189a;
    }

    public i(g<? extends T> gVar, tq.i iVar, int i15, a aVar) {
        super(gVar, iVar, i15, aVar);
    }
}
