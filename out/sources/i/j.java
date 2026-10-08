package i;

import android.app.admin.DevicePolicyManager;
import android.os.Trace;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Li/j;", "Li/f3;", "Landroid/app/admin/DevicePolicyManager;", "devicePolicyManager", "<init>", "(Landroid/app/admin/DevicePolicyManager;)V", "a", "Landroid/app/admin/DevicePolicyManager;", "", "()Z", "camerasDisabled", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DevicePolicyManager devicePolicyManager;

    public j(DevicePolicyManager devicePolicyManager) {
        this.devicePolicyManager = devicePolicyManager;
    }

    @Override // i.f3
    public boolean a() {
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection("DevicePolicyManager#getCameraDisabled");
            return this.devicePolicyManager.getCameraDisabled(null);
        } finally {
            Trace.endSection();
        }
    }
}
