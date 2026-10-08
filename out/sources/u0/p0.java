package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "a", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<R> extends vq.k implements er.l<tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<Long, R> f193824f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super Long, ? extends R> lVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f193824f = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f193823e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            er.l<Long, R> lVar = this.f193824f;
            this.f193823e = 1;
            Object objC = p076m2.n2.c(lVar, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new a(this.f193824f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super R> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public static final <R> Object a(er.l<? super Long, ? extends R> lVar, tq.e<? super R> eVar) {
        androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) eVar.getContext().m(androidx.compose.ui.platform.q1.INSTANCE);
        return q1Var == null ? p076m2.n2.c(lVar, eVar) : q1Var.V(new a(lVar, null), eVar);
    }
}
