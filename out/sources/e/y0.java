package e;

import android.hardware.camera2.CameraCharacteristics;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Le/y0;", "", "<init>", "()V", "Le/b0;", "cameraProperties", "Loq/i0;", "b", "(Le/b0;)V", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f46464a = new y0();

    private y0() {
    }

    private final void b(b0 cameraProperties) {
        Integer num = (Integer) cameraProperties.getMetadata().d0(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1);
        if ((num == null || num.intValue() != 2) && ((num == null || num.intValue() != 4) && ((num == null || num.intValue() != 0) && ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 3))))) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unknown value: ");
            sb5.append(num);
        }
        c cVar = c.f45719a;
        if (o.e1.h("CXCP")) {
            String unused = c.TRUNCATED_TAG;
        }
    }

    public final void a(b0 cameraProperties) {
        b(cameraProperties);
    }
}
