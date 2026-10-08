package nw0;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnw0/f0;", "Law0/f0;", "Ljw0/c;", "repository", "<init>", "(Ljw0/c;)V", "Law0/f0$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Law0/f0$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljw0/c;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 implements aw0.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jw0.c repository;

    public f0(jw0.c cVar) {
        this.repository = cVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(aw0.f0.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.repository.a(params.getProcessId(), eVar);
    }
}
