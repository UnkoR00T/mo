package i;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.u2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li/u2;", "Li/s2;", "Lh/q;", "cameraErrorCode", "<init>", "(Lh/q;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh/q;", "()Lh/q;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CameraStateClosing extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h.q cameraErrorCode;

    public /* synthetic */ CameraStateClosing(h.q qVar, fr.k kVar) {
        this(qVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h.q getCameraErrorCode() {
        return this.cameraErrorCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CameraStateClosing) && fr.t.c(this.cameraErrorCode, ((CameraStateClosing) other).cameraErrorCode);
    }

    public int hashCode() {
        h.q qVar = this.cameraErrorCode;
        if (qVar == null) {
            return 0;
        }
        return h.q.s(qVar.getValue());
    }

    public String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.cameraErrorCode + ')';
    }

    private CameraStateClosing(h.q qVar) {
        super(null);
        this.cameraErrorCode = qVar;
    }

    public /* synthetic */ CameraStateClosing(h.q qVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : qVar, null);
    }
}
