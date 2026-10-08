package c;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import p071kotlin.Metadata;
import v.d2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le/a$a;", "Lv/d2;", "imageCaptureConfig", "Loq/i0;", "a", "(Le/a$a;Lv/d2;)V", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    @SuppressLint({"NewApi"})
    public static final void a(e.a.C1050a c1050a, d2 d2Var) {
        if (((ImageCapturePixelHDRPlusQuirk) b.g.f15546a.c(ImageCapturePixelHDRPlusQuirk.class)) != null && d2Var.q0()) {
            int iJ0 = d2Var.j0();
            if (iJ0 == 0) {
                c1050a.g(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
            } else {
                if (iJ0 != 1) {
                    return;
                }
                c1050a.g(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
            }
        }
    }
}
