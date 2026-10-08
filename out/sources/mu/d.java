package mu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmu/d;", "T", "Lnu/e;", "Lkotlin/Function2;", "Llu/w;", "Ltq/e;", "Loq/i0;", "", "block", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Ler/p;Ltq/i;ILlu/a;)V", "h", "(Ltq/i;ILlu/a;)Lnu/e;", "scope", "g", "(Llu/w;Ltq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "d", "Ler/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
class d<T> extends p086nu.e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.p<lu.w<? super T>, tq.e<? super oq.i0>, Object> block;

    public /* synthetic */ d(er.p pVar, tq.i iVar, int i15, lu.a aVar, int i16, fr.k kVar) {
        this(pVar, (i16 & 2) != 0 ? tq.j.f191408a : iVar, (i16 & 4) != 0 ? -2 : i15, (i16 & 8) != 0 ? lu.a.SUSPEND : aVar);
    }

    static /* synthetic */ <T> Object n(d<T> dVar, lu.w<? super T> wVar, tq.e<? super oq.i0> eVar) {
        Object objB = ((d) dVar).block.B(wVar, eVar);
        return objB == uq.b.e() ? objB : oq.i0.f148189a;
    }

    @Override // p086nu.e
    protected Object g(lu.w<? super T> wVar, tq.e<? super oq.i0> eVar) {
        return n(this, wVar, eVar);
    }

    @Override // p086nu.e
    protected p086nu.e<T> h(tq.i context, int capacity, lu.a onBufferOverflow) {
        return new d(this.block, context, capacity, onBufferOverflow);
    }

    @Override // p086nu.e
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(er.p<? super lu.w<? super T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar, tq.i iVar, int i15, lu.a aVar) {
        super(iVar, i15, aVar);
        this.block = pVar;
    }
}
