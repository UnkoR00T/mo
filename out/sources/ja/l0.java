package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rB7\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\u000eR)\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0006¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lja/l0;", "", "Key", "Value", "Lja/m0;", "config", "initialKey", "Lja/a1;", "remoteMediator", "Lkotlin/Function0;", "Lja/x0;", "pagingSourceFactory", "<init>", "(Lja/m0;Ljava/lang/Object;Lja/a1;Ler/a;)V", "(Lja/m0;Ljava/lang/Object;Ler/a;)V", "Lmu/g;", "Lja/n0;", "a", "Lmu/g;", "()Lmu/g;", "getFlow$annotations", "()V", "flow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mu.g<n0<Value>> flow;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<tq.e<? super x0<Key, Value>>, Object> {
        a(Object obj) {
            super(1, obj, k1.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x0<Key, Value>> eVar) {
            return ((k1) this.f66391b).e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lja/x0;", "<anonymous>", "()Lja/x0;"}, k = 3, mv = {2, 0, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x0<Key, Value>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.a<x0<Key, Value>> f101031f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.a<? extends x0<Key, Value>> aVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f101031f = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101030e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return this.f101031f.a();
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new b(this.f101031f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x0<Key, Value>> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public l0(m0 m0Var, Key key, a1<Key, Value> a1Var, er.a<? extends x0<Key, Value>> aVar) {
        this.flow = new g0(aVar instanceof k1 ? new a((k1) aVar) : new b(aVar, null), key, m0Var, a1Var).i();
    }

    public final mu.g<n0<Value>> a() {
        return this.flow;
    }

    public /* synthetic */ l0(m0 m0Var, Object obj, er.a aVar, int i15, fr.k kVar) {
        this(m0Var, (i15 & 2) != 0 ? null : obj, aVar);
    }

    public l0(m0 m0Var, Key key, er.a<? extends x0<Key, Value>> aVar) {
        this(m0Var, key, null, aVar);
    }
}
