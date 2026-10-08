package u6;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lu6/r0;", "a", "(Lu6/r0;Ltq/e;)Ljava/lang/Object;", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"T", "Lu6/j0;", "", "it", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    static final class a<T> extends vq.k implements er.q<j0<T>, Boolean, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f195736f;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195735e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            j0 j0Var = (j0) this.f195736f;
            this.f195735e = 1;
            Object objA = j0Var.a(this);
            return objA == objE ? objE : objA;
        }

        public final Object M(j0<T> j0Var, boolean z15, tq.e<? super T> eVar) {
            a aVar = new a(eVar);
            aVar.f195736f = j0Var;
            return aVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Object obj, Boolean bool, Object obj2) {
            return M((j0) obj, bool.booleanValue(), (tq.e) obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object a(r0<T> r0Var, tq.e<? super T> eVar) {
        return r0Var.d(new a(null), eVar);
    }
}
