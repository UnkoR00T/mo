package i;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.t3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Li/t3;", "Li/r2;", "Lh/v;", "activeCameraId", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "Lju/x;", "Loq/i0;", "b", "Lju/x;", "()Lju/x;", "deferred", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestCloseById extends r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String activeCameraId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ju.x<oq.i0> deferred;

    public /* synthetic */ RequestCloseById(String str, fr.k kVar) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActiveCameraId() {
        return this.activeCameraId;
    }

    public final ju.x<oq.i0> b() {
        return this.deferred;
    }

    public String toString() {
        return "RequestCloseById(" + ((Object) h.v.f(this.activeCameraId)) + ')';
    }

    private RequestCloseById(String str) {
        super(null);
        this.activeCameraId = str;
        this.deferred = ju.z.c(null, 1, null);
    }
}
