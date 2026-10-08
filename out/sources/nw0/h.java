package nw0;

import java.util.List;
import p071kotlin.Metadata;
import sv0.VehicleCollisionFileName;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnw0/h;", "Law0/i;", "Ljw0/e;", "repository", "<init>", "(Ljw0/e;)V", "Law0/i$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lsv0/o0;", "d", "(Law0/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljw0/e;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements aw0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jw0.e repository;

    public h(jw0.e eVar) {
        this.repository = eVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(aw0.i.Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<VehicleCollisionFileName>>> eVar) {
        return this.repository.u(params.getProcessId(), params.a(), eVar);
    }
}
