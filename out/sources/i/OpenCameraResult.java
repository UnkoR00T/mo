package i;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.k3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Li/k3;", "", "Li/g;", "cameraState", "Lh/q;", "errorCode", "<init>", "(Li/g;Lh/q;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li/g;", "()Li/g;", "b", "Lh/q;", "()Lh/q;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OpenCameraResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g cameraState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final h.q errorCode;

    public /* synthetic */ OpenCameraResult(g gVar, h.q qVar, fr.k kVar) {
        this(gVar, qVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getCameraState() {
        return this.cameraState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h.q getErrorCode() {
        return this.errorCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenCameraResult)) {
            return false;
        }
        OpenCameraResult openCameraResult = (OpenCameraResult) other;
        return fr.t.c(this.cameraState, openCameraResult.cameraState) && fr.t.c(this.errorCode, openCameraResult.errorCode);
    }

    public int hashCode() {
        g gVar = this.cameraState;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        h.q qVar = this.errorCode;
        return iHashCode + (qVar != null ? h.q.s(qVar.getValue()) : 0);
    }

    public String toString() {
        return "OpenCameraResult(cameraState=" + this.cameraState + ", errorCode=" + this.errorCode + ')';
    }

    private OpenCameraResult(g gVar, h.q qVar) {
        this.cameraState = gVar;
        this.errorCode = qVar;
    }

    public /* synthetic */ OpenCameraResult(g gVar, h.q qVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : gVar, (i15 & 2) != 0 ? null : qVar, null);
    }
}
