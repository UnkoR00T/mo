package c;

import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lc/i;", "", "<init>", "()V", "", "isExtensions", "a", "(Z)Z", "Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "closeCameraDeviceOnCameraGraphCloseQuirk", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CloseCameraDeviceOnCameraGraphCloseQuirk closeCameraDeviceOnCameraGraphCloseQuirk = (CloseCameraDeviceOnCameraGraphCloseQuirk) b.g.f15546a.c(CloseCameraDeviceOnCameraGraphCloseQuirk.class);

    public final boolean a(boolean isExtensions) {
        CloseCameraDeviceOnCameraGraphCloseQuirk closeCameraDeviceOnCameraGraphCloseQuirk = this.closeCameraDeviceOnCameraGraphCloseQuirk;
        if (closeCameraDeviceOnCameraGraphCloseQuirk != null) {
            return closeCameraDeviceOnCameraGraphCloseQuirk.h(isExtensions);
        }
        return false;
    }
}
