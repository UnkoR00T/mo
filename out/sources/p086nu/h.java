package p086nu;

import er.p;
import fr.t;
import ju.j0;
import lu.w;
import mu.g;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import tq.f;
import tq.i;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lnu/h;", ip.a.f96137b, "T", "Lnu/e;", "Lmu/g;", "flow", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Lmu/g;Ltq/i;ILlu/a;)V", "Lmu/h;", "collector", "newContext", "Loq/i0;", "p", "(Lmu/h;Ltq/i;Ltq/e;)Ljava/lang/Object;", "q", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "Llu/w;", "scope", "g", "(Llu/w;Ltq/e;)Ljava/lang/Object;", "a", "", "toString", "()Ljava/lang/String;", "d", "Lmu/g;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h<S, T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    protected final g<S> flow;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lmu/h;", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<mu.h<? super T>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h<S, T> f138736g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h<S, T> hVar, e<? super a> eVar) {
            super(2, eVar);
            this.f138736g = hVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f138734e;
            if (i15 == 0) {
                u.b(obj);
                mu.h<? super T> hVar = (mu.h) this.f138735f;
                h<S, T> hVar2 = this.f138736g;
                this.f138734e = 1;
                if (hVar2.q(hVar, this) == objE) {
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
        public final Object B(mu.h<? super T> hVar, e<? super i0> eVar) {
            return ((a) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f138736g, eVar);
            aVar.f138735f = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(g<? extends S> gVar, i iVar, int i15, lu.a aVar) {
        super(iVar, i15, aVar);
        this.flow = gVar;
    }

    static /* synthetic */ <S, T> Object n(h<S, T> hVar, mu.h<? super T> hVar2, e<? super i0> eVar) {
        if (hVar.capacity == -3) {
            i context = eVar.getContext();
            i iVarK = j0.k(context, hVar.context);
            if (t.c(iVarK, context)) {
                Object objQ = hVar.q(hVar2, eVar);
                return objQ == b.e() ? objQ : i0.f148189a;
            }
            f.Companion companion = f.INSTANCE;
            if (t.c(iVarK.m(companion), context.m(companion))) {
                Object objP = hVar.p(hVar2, iVarK, eVar);
                return objP == b.e() ? objP : i0.f148189a;
            }
        }
        Object objA = super.a(hVar2, eVar);
        return objA == b.e() ? objA : i0.f148189a;
    }

    static /* synthetic */ <S, T> Object o(h<S, T> hVar, w<? super T> wVar, e<? super i0> eVar) {
        Object objQ = hVar.q(new a0(wVar), eVar);
        return objQ == b.e() ? objQ : i0.f148189a;
    }

    private final Object p(mu.h<? super T> hVar, i iVar, e<? super i0> eVar) {
        return f.c(iVar, f.d(hVar, eVar.getContext()), null, new a(this, null), eVar, 4, null);
    }

    @Override // p086nu.e, mu.g
    public Object a(mu.h<? super T> hVar, e<? super i0> eVar) {
        return n(this, hVar, eVar);
    }

    @Override // p086nu.e
    protected Object g(w<? super T> wVar, e<? super i0> eVar) {
        return o(this, wVar, eVar);
    }

    protected abstract Object q(mu.h<? super T> hVar, e<? super i0> eVar);

    @Override // p086nu.e
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
