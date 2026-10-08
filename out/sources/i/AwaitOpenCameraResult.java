package i;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.q0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Li/q0;", "", "Li/m2;", "cameraDeviceWrapper", "Li/g;", "androidCameraState", "<init>", "(Li/m2;Li/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li/m2;", "b", "()Li/m2;", "Li/g;", "()Li/g;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AwaitOpenCameraResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m2 cameraDeviceWrapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g androidCameraState;

    /* JADX WARN: Multi-variable type inference failed */
    public AwaitOpenCameraResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getAndroidCameraState() {
        return this.androidCameraState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m2 getCameraDeviceWrapper() {
        return this.cameraDeviceWrapper;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AwaitOpenCameraResult)) {
            return false;
        }
        AwaitOpenCameraResult awaitOpenCameraResult = (AwaitOpenCameraResult) other;
        return fr.t.c(this.cameraDeviceWrapper, awaitOpenCameraResult.cameraDeviceWrapper) && fr.t.c(this.androidCameraState, awaitOpenCameraResult.androidCameraState);
    }

    public int hashCode() {
        m2 m2Var = this.cameraDeviceWrapper;
        int iHashCode = (m2Var == null ? 0 : m2Var.hashCode()) * 31;
        g gVar = this.androidCameraState;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.cameraDeviceWrapper + ", androidCameraState=" + this.androidCameraState + ')';
    }

    public AwaitOpenCameraResult(m2 m2Var, g gVar) {
        this.cameraDeviceWrapper = m2Var;
        this.androidCameraState = gVar;
    }

    public /* synthetic */ AwaitOpenCameraResult(m2 m2Var, g gVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : m2Var, (i15 & 2) != 0 ? null : gVar);
    }
}
