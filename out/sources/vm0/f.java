package vm0;

import cl0.PassportChildApplicationGetChildData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvm0/f;", "Lol0/f;", "Lpm0/j;", "repository", "<init>", "(Lpm0/j;)V", "Lol0/f$a;", "params", "Ldx/i;", "Ldx/b;", "Lcl0/k0;", "d", "(Lol0/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpm0/j;", "getRepository", "()Lpm0/j;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements ol0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pm0.j repository;

    public f(pm0.j jVar) {
        this.repository = jVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(ol0.f.Params params, tq.e<? super dx.i<? extends dx.b, PassportChildApplicationGetChildData>> eVar) {
        return this.repository.e(params.getPassportType(), params.getChildId(), eVar);
    }
}
