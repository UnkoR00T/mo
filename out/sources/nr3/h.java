package nr3;

import cj0.ZusEVisitCollectiveDepartments;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnr3/h;", "", "Lgz/b$a$a;", "Lcj0/g;", "Lac4/a;", "callActionWithLoaderUseCase", "Lkj0/d;", "getCollectiveZusEVisitDepartmentsUseCase", "<init>", "(Lac4/a;Lkj0/d;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lac4/a;", "b", "Lkj0/d;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kj0.d getCollectiveZusEVisitDepartmentsUseCase;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lcj0/g;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends ZusEVisitCollectiveDepartments>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138024e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138024e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kj0.d dVar = h.this.getCollectiveZusEVisitDepartmentsUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f138024e = 1;
            Object objC = dVar.c(c1792a, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, ZusEVisitCollectiveDepartments>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public h(ac4.a aVar, kj0.d dVar) {
        this.callActionWithLoaderUseCase = aVar;
        this.getCollectiveZusEVisitDepartmentsUseCase = dVar;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ZusEVisitCollectiveDepartments>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }
}
