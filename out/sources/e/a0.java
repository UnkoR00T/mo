package e;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Le/a0;", "Le/b0;", "Ld/m;", "cameraConfig", "Lh/x;", "cameraMetadata", "<init>", "(Ld/m;Lh/x;)V", "a", "Ld/m;", "b", "Lh/x;", "c", "e", "()Lh/x;", "metadata", "Lh/v;", "m", "()Ljava/lang/String;", "cameraId", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.m cameraConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.x metadata;

    public a0(d.m mVar, h.x xVar) {
        this.cameraConfig = mVar;
        this.cameraMetadata = xVar;
        this.metadata = xVar;
    }

    @Override // e.b0
    /* JADX INFO: renamed from: e, reason: from getter */
    public h.x getMetadata() {
        return this.metadata;
    }

    @Override // e.b0
    public String m() {
        return this.cameraConfig.getCameraId();
    }
}
