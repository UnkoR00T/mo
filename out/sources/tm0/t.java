package tm0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltm0/t;", "Lml0/u;", "Lpm0/f;", "repository", "<init>", "(Lpm0/f;)V", "Lml0/u$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lml0/u$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpm0/f;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements ml0.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pm0.f repository;

    public t(pm0.f fVar) {
        this.repository = fVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(ml0.u.Params params, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
        return this.repository.a(params.getMetaService(), eVar);
    }
}
