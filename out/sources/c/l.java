package c;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import io.sentry.android.core.c2;
import java.nio.BufferUnderflowException;
import o.e1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le/b0;", "", "allowRethrowOnError", "a", "(Le/b0;Z)Z", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final boolean a(e.b0 b0Var, boolean z15) {
        Boolean bool;
        try {
            bool = (Boolean) b0Var.getMetadata().J(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e15) {
            if (b.g.f15546a.c(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                e.c cVar = e.c.f45719a;
                if (e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                    String str = Build.MANUFACTURER;
                    String str2 = Build.MODEL;
                }
            } else {
                e.c cVar2 = e.c.f45719a;
                if (e1.g("CXCP")) {
                    c2.f(e.c.TRUNCATED_TAG, "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e15);
                }
            }
            if (z15) {
                throw e15;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            e.c cVar3 = e.c.f45719a;
            if (e1.k("CXCP")) {
                c2.g(e.c.TRUNCATED_TAG, "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean b(e.b0 b0Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return a(b0Var, z15);
    }
}
