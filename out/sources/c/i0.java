package c;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import h.k1;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;
import v.g3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lc/i0;", "Lc/g0;", "Lv/g3;", "quirks", "<init>", "(Lv/g3;)V", "Lh/k1;", "template", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "a", "(Lh/k1;)Ljava/util/Map;", "", "Z", "workaroundByCaptureIntentPreview", "b", "workaroundByCaptureIntentStillCapture", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean workaroundByCaptureIntentPreview;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean workaroundByCaptureIntentStillCapture;

    public i0(g3 g3Var) {
        this.workaroundByCaptureIntentPreview = CaptureIntentPreviewQuirk.INSTANCE.a(g3Var);
        this.workaroundByCaptureIntentStillCapture = g3Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // c.g0
    public Map<CaptureRequest.Key<?>, Object> a(k1 template) {
        if (template != null && template.getValue() == 3 && this.workaroundByCaptureIntentPreview) {
            return v0.f(oq.y.a(CaptureRequest.CONTROL_CAPTURE_INTENT, 1));
        }
        return (template != null && template.getValue() == 4 && this.workaroundByCaptureIntentStillCapture) ? v0.f(oq.y.a(CaptureRequest.CONTROL_CAPTURE_INTENT, 2)) : v0.i();
    }
}
