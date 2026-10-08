package l0;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraManager f113941a;

    c(Context context) {
        this.f113941a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // l0.f
    public d a(String str) {
        return new b(this.f113941a, str);
    }
}
