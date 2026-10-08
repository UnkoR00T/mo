package dr0;

import er.l;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ldr0/h;", "Lvq0/h;", "Lbr0/a;", "repository", "Ldr0/j;", "longPollUC", "<init>", "(Lbr0/a;Ldr0/j;)V", "Lvq0/h$a;", "params", "Ldx/i;", "Ldx/b;", "Ltq0/c;", "e", "(Lvq0/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbr0/a;", "b", "Ldr0/j;", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements vq0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final br0.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j longPollUC;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Ltq0/c;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements l<tq.e<? super dx.i<? extends dx.b, ? extends tq0.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44157e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ vq0.h.Params f44159g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(vq0.h.Params params, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f44159g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44157e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            br0.a aVar = h.this.repository;
            String id5 = this.f44159g.getId();
            this.f44157e = 1;
            Object objW0 = aVar.w0(id5, this);
            return objW0 == objE ? objE : objW0;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new a(this.f44159g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends tq0.c>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public h(br0.a aVar, j jVar) {
        this.repository = aVar;
        this.longPollUC = jVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(vq0.h.Params params, tq.e<? super dx.i<? extends dx.b, ? extends tq0.c>> eVar) {
        return this.longPollUC.a(new a(params, null), eVar);
    }
}
