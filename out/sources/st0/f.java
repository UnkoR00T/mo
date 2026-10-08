package st0;

import dx.i;
import kt0.RegisterDeviceResponse;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lst0/f;", "Llt0/e;", "Lrt0/a;", "notificationRegistrationRepository", "<init>", "(Lrt0/a;)V", "Llt0/e$a;", "params", "Ldx/i;", "Ldx/b;", "Lkt0/h;", "d", "(Llt0/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lrt0/a;", "pushservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements lt0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rt0.a notificationRegistrationRepository;

    public f(rt0.a aVar) {
        this.notificationRegistrationRepository = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(lt0.e.Params params, tq.e<? super i<? extends dx.b, RegisterDeviceResponse>> eVar) {
        return this.notificationRegistrationRepository.a(params.getRegisterDeviceRequest(), eVar);
    }
}
