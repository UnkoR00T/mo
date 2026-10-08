package i;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.v2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li/v2;", "Li/s2;", "Li/m2;", "cameraDevice", "<init>", "(Li/m2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li/m2;", "()Li/m2;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CameraStateOpen extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m2 cameraDevice;

    public CameraStateOpen(m2 m2Var) {
        super(null);
        this.cameraDevice = m2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m2 getCameraDevice() {
        return this.cameraDevice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CameraStateOpen) && fr.t.c(this.cameraDevice, ((CameraStateOpen) other).cameraDevice);
    }

    public int hashCode() {
        return this.cameraDevice.hashCode();
    }

    public String toString() {
        return "CameraStateOpen(cameraDevice=" + this.cameraDevice + ')';
    }
}
