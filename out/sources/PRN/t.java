package PRN;

import android.hardware.camera2.CaptureResult;
import io.sentry.android.core.c2;
import java.nio.BufferUnderflowException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lh/q0;", "Lv/x;", "l", "(Lh/q0;)Lv/x;", "Lv/y;", "m", "(Lh/q0;)Lv/y;", "Lv/v;", "j", "(Lh/q0;)Lv/v;", "Lv/w;", "k", "(Lh/q0;)Lv/w;", "Lv/z;", "n", "(Lh/q0;)Lv/z;", "Lv/a0;", "o", "(Lh/q0;)Lv/a0;", "Lv/b0;", "p", "(Lh/q0;)Lv/b0;", "", "q", "(Lh/q0;)J", "Ly/h$b;", "exifData", "Loq/i0;", "r", "(Lh/q0;Ly/h$b;)V", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    /* JADX INFO: Access modifiers changed from: private */
    public static final v.v j(h.q0 q0Var) {
        Integer num = (Integer) q0Var.I(CaptureResult.CONTROL_AE_MODE);
        if (num != null && num.intValue() == 0) {
            return v.v.OFF;
        }
        if (num != null && num.intValue() == 1) {
            return v.v.ON;
        }
        if (num != null && num.intValue() == 2) {
            return v.v.ON_AUTO_FLASH;
        }
        if (num != null && num.intValue() == 3) {
            return v.v.ON_ALWAYS_FLASH;
        }
        if (num != null && num.intValue() == 4) {
            return v.v.ON_AUTO_FLASH_REDEYE;
        }
        if (num == null) {
            return v.v.UNKNOWN;
        }
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            h.r0.f(q0Var.Y0());
        }
        return v.v.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v.w k(h.q0 q0Var) {
        Integer num = (Integer) q0Var.I(CaptureResult.CONTROL_AE_STATE);
        if (num != null && num.intValue() == 0) {
            return v.w.INACTIVE;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return v.w.SEARCHING;
        }
        if (num != null && num.intValue() == 4) {
            return v.w.FLASH_REQUIRED;
        }
        if (num != null && num.intValue() == 2) {
            return v.w.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return v.w.LOCKED;
        }
        if (num == null) {
            return v.w.UNKNOWN;
        }
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            h.r0.f(q0Var.Y0());
        }
        return v.w.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v.x l(h.q0 q0Var) {
        Integer num = (Integer) q0Var.I(CaptureResult.CONTROL_AF_MODE);
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
            return v.x.OFF;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            return v.x.ON_MANUAL_AUTO;
        }
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
            return v.x.ON_CONTINUOUS_AUTO;
        }
        if (num == null) {
            return v.x.UNKNOWN;
        }
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            h.r0.f(q0Var.Y0());
        }
        return v.x.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v.y m(h.q0 q0Var) {
        Integer num = (Integer) q0Var.I(CaptureResult.CONTROL_AF_STATE);
        if (num != null && num.intValue() == 0) {
            return v.y.INACTIVE;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return v.y.SCANNING;
        }
        if (num != null && num.intValue() == 4) {
            return v.y.LOCKED_FOCUSED;
        }
        if (num != null && num.intValue() == 5) {
            return v.y.LOCKED_NOT_FOCUSED;
        }
        if (num != null && num.intValue() == 2) {
            return v.y.PASSIVE_FOCUSED;
        }
        if (num != null && num.intValue() == 6) {
            return v.y.PASSIVE_NOT_FOCUSED;
        }
        if (num == null) {
            return v.y.UNKNOWN;
        }
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            h.r0.f(q0Var.Y0());
        }
        return v.y.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v.z n(h.q0 q0Var) {
        Integer num = (Integer) q0Var.I(CaptureResult.CONTROL_AWB_MODE);
        if (num != null && num.intValue() == 0) {
            return v.z.OFF;
        }
        if (num != null && num.intValue() == 1) {
            return v.z.AUTO;
        }
        if (num != null && num.intValue() == 2) {
            return v.z.INCANDESCENT;
        }
        if (num != null && num.intValue() == 3) {
            return v.z.FLUORESCENT;
        }
        if (num != null && num.intValue() == 4) {
            return v.z.WARM_FLUORESCENT;
        }
        if (num != null && num.intValue() == 5) {
            return v.z.DAYLIGHT;
        }
        if (num != null && num.intValue() == 6) {
            return v.z.CLOUDY_DAYLIGHT;
        }
        if (num != null && num.intValue() == 7) {
            return v.z.TWILIGHT;
        }
        if (num != null && num.intValue() == 8) {
            return v.z.SHADE;
        }
        if (num == null) {
            return v.z.UNKNOWN;
        }
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            h.r0.f(q0Var.Y0());
        }
        return v.z.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v.a0 o(h.q0 q0Var) {
        Integer num = (Integer) q0Var.I(CaptureResult.CONTROL_AWB_STATE);
        if (num != null && num.intValue() == 0) {
            return v.a0.INACTIVE;
        }
        if (num != null && num.intValue() == 1) {
            return v.a0.METERING;
        }
        if (num != null && num.intValue() == 2) {
            return v.a0.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return v.a0.LOCKED;
        }
        if (num == null) {
            return v.a0.UNKNOWN;
        }
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            h.r0.f(q0Var.Y0());
        }
        return v.a0.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v.b0 p(h.q0 q0Var) {
        Integer num = (Integer) q0Var.I(CaptureResult.FLASH_STATE);
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            return v.b0.NONE;
        }
        if (num != null && num.intValue() == 2) {
            return v.b0.READY;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 4)) {
            return v.b0.FIRED;
        }
        if (num == null) {
            return v.b0.UNKNOWN;
        }
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            h.r0.f(q0Var.Y0());
        }
        return v.b0.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long q(h.q0 q0Var) {
        return ((Number) q0Var.a0(CaptureResult.SENSOR_TIMESTAMP, -1L)).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(h.q0 q0Var, y.h.b bVar) {
        try {
            Integer num = (Integer) q0Var.I(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            e.c cVar = e.c.f45719a;
            if (o.e1.k("CXCP")) {
                c2.g(e.c.TRUNCATED_TAG, "Failed to get JPEG orientation.");
            }
        }
        Long l15 = (Long) q0Var.I(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l15 != null) {
            bVar.f(l15.longValue());
        }
        Float f15 = (Float) q0Var.I(CaptureResult.LENS_APERTURE);
        if (f15 != null) {
            bVar.l(f15.floatValue());
        }
        Integer num2 = (Integer) q0Var.I(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            int iIntValue = num2.intValue();
            bVar.k(iIntValue);
            Integer num3 = (Integer) q0Var.I(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                bVar.k(iIntValue * ((int) (num3.intValue() / 100.0f)));
            }
        }
        Float f16 = (Float) q0Var.I(CaptureResult.LENS_FOCAL_LENGTH);
        if (f16 != null) {
            bVar.h(f16.floatValue());
        }
        Integer num4 = (Integer) q0Var.I(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            int iIntValue2 = num4.intValue();
            y.h.c cVar2 = y.h.c.AUTO;
            if (iIntValue2 == 0) {
                cVar2 = y.h.c.MANUAL;
            }
            bVar.n(cVar2);
        }
    }
}
