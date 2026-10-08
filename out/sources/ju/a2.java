package ju;

import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Ltq/i;", "context", "Lkotlin/Function0;", "block", "b", "(Ltq/i;Ler/a;Ltq/e;)Ljava/lang/Object;", "coroutineContext", "d", "(Ltq/i;Ler/a;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class a<T> extends vq.k implements er.p<p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f105652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<T> f105653g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.a<? extends T> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f105653g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f105651e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return a2.d(((p0) this.f105652f).getCoroutineContext(), this.f105653g);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super T> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f105653g, eVar);
            aVar.f105652f = obj;
            return aVar;
        }
    }

    public static final <T> Object b(tq.i iVar, er.a<? extends T> aVar, tq.e<? super T> eVar) {
        return i.g(iVar, new a(aVar, null), eVar);
    }

    public static /* synthetic */ Object c(tq.i iVar, er.a aVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = tq.j.f191408a;
        }
        return b(iVar, aVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(tq.i iVar, er.a<? extends T> aVar) throws Throwable {
        try {
            d3 d3Var = new d3();
            d3Var.C(g2.k(iVar));
            try {
                return aVar.a();
            } finally {
                d3Var.z();
            }
        } catch (InterruptedException e15) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e15);
        }
    }
}
