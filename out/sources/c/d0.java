package c;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import h.g1;
import h.k1;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lh/g1;", "", "a", "(Ljava/util/List;)Z", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {
    public static final boolean a(List<g1> list) {
        if (((StillCaptureFlashStopRepeatingQuirk) b.g.f15546a.c(StillCaptureFlashStopRepeatingQuirk.class)) == null) {
            return false;
        }
        boolean z15 = false;
        boolean z16 = false;
        for (g1 g1Var : list) {
            k1 template = g1Var.getTemplate();
            if (template != null && template.getValue() == 2) {
                z15 = true;
            }
            Integer num = (Integer) g1Var.a(CaptureRequest.CONTROL_AE_MODE);
            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                z16 = true;
            }
        }
        return z15 && z16;
    }
}
