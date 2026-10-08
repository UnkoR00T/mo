package e;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Le/v2;", "Le/z1;", "<init>", "()V", "Loq/i0;", "reset", "", "a", "()Z", "Le/f2;", "Le/f2;", "getRequestControl", "()Le/f2;", "b", "(Le/f2;)V", "requestControl", "Liu/c;", "Liu/c;", "videoUsage", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v2 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private f2 requestControl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iu.c videoUsage = iu.b.c(0);

    public final boolean a() {
        int value = this.videoUsage.getValue();
        c cVar = c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = c.TRUNCATED_TAG;
        }
        return value > 0;
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this.requestControl = f2Var;
    }

    @Override // e.z1
    public void reset() {
        this.videoUsage.e(0);
        c cVar = c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = c.TRUNCATED_TAG;
        }
    }
}
