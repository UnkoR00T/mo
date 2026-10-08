package PRN;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;
import h.t1;
import o.l2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\fJ)\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR!\u0010#\u001a\u00020\u001c8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"LPRN/j0;", "Lo/q;", "Lh/t1;", "Le/b0;", "cameraProperties", "<init>", "(Le/b0;)V", "", "lensFacingInt", "U", "(I)I", "g", "()I", "relativeRotation", "A", "Landroidx/lifecycle/y;", "Lo/l2;", ip.a.f96138c, "()Landroidx/lifecycle/y;", "n", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "a", "Le/b0;", "Lg/b;", "b", "Loq/k;", ip.a.f96137b, "()Lg/b;", "getCamera2CameraInfo$camera_camera2$annotations", "()V", "camera2CameraInfo", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UnsafeOptInUsageError"})
public final class j0 implements o.q, t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e.b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k camera2CameraInfo = oq.l.a(new er.a() { // from class: PRN.i0
        @Override // er.a
        public final Object a() {
            return j0.R(this.f666a);
        }
    });

    public j0(e.b0 b0Var) {
        this.cameraProperties = b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g.b R(j0 j0Var) {
        return g.b.INSTANCE.a(j0Var.cameraProperties);
    }

    private final int U(int lensFacingInt) {
        if (lensFacingInt == 0) {
            return 0;
        }
        if (lensFacingInt == 1) {
            return 1;
        }
        if (lensFacingInt == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The specified lens facing integer " + lensFacingInt + " can not be recognized.");
    }

    @Override // o.q
    public int A(int relativeRotation) {
        return y.c.a(y.c.b(relativeRotation), ((Number) this.cameraProperties.getMetadata().J(CameraCharacteristics.SENSOR_ORIENTATION)).intValue(), 1 == n());
    }

    @Override // o.q
    public androidx.p016lifecycle.y<l2> D() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    public final g.b S() {
        return (g.b) this.camera2CameraInfo.getValue();
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(g.b.class))) {
            return (T) S();
        }
        if (fr.t.c(type, fr.q0.c(e.b0.class))) {
            return (T) this.cameraProperties;
        }
        return fr.t.c(type, fr.q0.c(CameraMetadata.class)) ? (T) this.cameraProperties.getMetadata() : (T) this.cameraProperties.getMetadata().c0(type);
    }

    @Override // o.q
    public int g() {
        return A(0);
    }

    @Override // o.q
    public int n() {
        return U(((Number) this.cameraProperties.getMetadata().J(CameraCharacteristics.LENS_FACING)).intValue());
    }
}
