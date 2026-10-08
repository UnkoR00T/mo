package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lja/k1;", "", "Key", "Value", "Lkotlin/Function0;", "Lja/x0;", "e", "(Ltq/e;)Ljava/lang/Object;", "f", "()Lja/x0;", "Lju/l0;", "a", "Lju/l0;", "dispatcher", "b", "Ler/a;", "delegate", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k1<Key, Value> implements er.a<x0<Key, Value>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ju.l0 dispatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<x0<Key, Value>> delegate;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lju/p0;", "Lja/x0;", "<anonymous>", "(Lju/p0;)Lja/x0;"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super x0<Key, Value>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k1<Key, Value> f101016f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1<Key, Value> k1Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f101016f = k1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101015e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return ((k1) this.f101016f).delegate.a();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super x0<Key, Value>> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f101016f, eVar);
        }
    }

    public final Object e(tq.e<? super x0<Key, Value>> eVar) {
        return ju.i.g(this.dispatcher, new a(this, null), eVar);
    }

    @Override // er.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public x0<Key, Value> a() {
        return this.delegate.a();
    }
}
