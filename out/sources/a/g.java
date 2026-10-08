package a;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"La/g;", "", "<init>", "()V", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "parameters", "", "level", "Loq/i0;", "a", "(Ljava/util/Map;I)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1013a = new g();

    private g() {
    }

    public static final void a(Map<CaptureRequest.Key<?>, Object> parameters, int level) {
        parameters.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(level));
    }
}
