package j;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lj/q;", "", "Lh/z$e;", "config", "<init>", "(Lh/z$e;)V", "b", "()Lh/z$e;", "Lh/z$f;", "c", "()Lh/z$f;", "cameraPipeConfig", "Lh/z$b;", "a", "(Lh/z$e;)Lh/z$b;", "Lh/z$e;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.z.Config config;

    public q(h.z.Config config) {
        this.config = config;
    }

    public final h.z.CameraInteropConfig a(h.z.Config cameraPipeConfig) {
        return cameraPipeConfig.getCameraInteropConfig();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h.z.Config getConfig() {
        return this.config;
    }

    public final h.z.Flags c() {
        return this.config.getFlags();
    }
}
