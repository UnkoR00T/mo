package p086nu;

import er.p;
import java.util.Iterator;
import ju.p0;
import lu.w;
import lu.y;
import mu.g;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import tq.i;
import tq.j;
import uq.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnu/k;", "T", "Lnu/e;", "", "Lmu/g;", "flows", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Ltq/i;ILlu/a;)V", "h", "(Ltq/i;ILlu/a;)Lnu/e;", "Lju/p0;", "scope", "Llu/y;", "l", "(Lju/p0;)Llu/y;", "Llu/w;", "Loq/i0;", "g", "(Llu/w;Ltq/e;)Ljava/lang/Object;", "d", "Ljava/lang/Iterable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Iterable<g<T>> flows;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g<T> f138758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a0<T> f138759g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g<? extends T> gVar, a0<T> a0Var, e<? super a> eVar) {
            super(2, eVar);
            this.f138758f = gVar;
            this.f138759g = a0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f138757e;
            if (i15 == 0) {
                u.b(obj);
                g<T> gVar = this.f138758f;
                a0<T> a0Var = this.f138759g;
                this.f138757e = 1;
                if (gVar.a(a0Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f138758f, this.f138759g, eVar);
        }
    }

    public /* synthetic */ k(Iterable iterable, i iVar, int i15, lu.a aVar, int i16, fr.k kVar) {
        this(iterable, (i16 & 2) != 0 ? j.f191408a : iVar, (i16 & 4) != 0 ? -2 : i15, (i16 & 8) != 0 ? lu.a.SUSPEND : aVar);
    }

    @Override // p086nu.e
    protected Object g(w<? super T> wVar, e<? super i0> eVar) {
        a0 a0Var = new a0(wVar);
        Iterator<g<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            ju.k.d(wVar, null, null, new a(it.next(), a0Var, null), 3, null);
        }
        return i0.f148189a;
    }

    @Override // p086nu.e
    protected e<T> h(i context, int capacity, lu.a onBufferOverflow) {
        return new k(this.flows, context, capacity, onBufferOverflow);
    }

    @Override // p086nu.e
    public y<T> l(p0 scope) {
        return lu.u.e(scope, this.context, this.capacity, j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Iterable<? extends g<? extends T>> iterable, i iVar, int i15, lu.a aVar) {
        super(iVar, i15, aVar);
        this.flows = iterable;
    }
}
