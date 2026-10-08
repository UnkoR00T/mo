package i;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, d2 = {"Li/q2;", "", "<init>", "()V", "Lh/a1$a;", "", "b", "Lh/a1$a;", "()Lh/a1$a;", "camera2ExtensionMode", "c", "a", "camera2CaptureRequestTag", "", "d", "ignore3ARequiredParameters", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2 f87324a = new q2();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final h.a1.a<Integer> camera2ExtensionMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final h.a1.a<Object> camera2CaptureRequestTag;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final h.a1.a<Boolean> ignore3ARequiredParameters;

    static {
        h.a1.a.Companion companion = h.a1.a.INSTANCE;
        camera2ExtensionMode = companion.a("androidx.camera.camera2.pipe.extensionMode", fr.q0.c(Integer.class));
        camera2CaptureRequestTag = companion.a("androidx.camera.camera2.pipe.captureRequestTag", fr.q0.c(Object.class));
        ignore3ARequiredParameters = companion.a("androidx.camera.camera2.pipe.ignore3ARequiredParameters", fr.q0.c(Boolean.class));
    }

    private q2() {
    }

    public final h.a1.a<Object> a() {
        return camera2CaptureRequestTag;
    }

    public final h.a1.a<Integer> b() {
        return camera2ExtensionMode;
    }

    public final h.a1.a<Boolean> c() {
        return ignore3ARequiredParameters;
    }
}
