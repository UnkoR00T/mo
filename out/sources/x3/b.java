package x3;

import android.view.InputDevice;
import android.view.MotionEvent;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\r\u001a\u00020\u0005*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "actionMasked", "Lx3/e;", "a", "(I)I", "Landroid/view/MotionEvent;", "motionEvent", "Lx3/d;", "c", "(Landroid/view/MotionEvent;)I", "Lx3/c;", "b", "(Lx3/c;)Landroid/view/MotionEvent;", "nativeEvent", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final int a(int i15) {
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    return e.INSTANCE.a();
                }
                if (i15 != 5) {
                    if (i15 != 6) {
                        return e.INSTANCE.d();
                    }
                }
            }
            return e.INSTANCE.c();
        }
        return e.INSTANCE.b();
    }

    public static final MotionEvent b(c cVar) {
        return ((a) cVar).getNativeEvent();
    }

    public static final int c(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(PKIFailureInfo.badSenderNonce)) {
            throw new IllegalArgumentException("MotionEvent must be a touch navigation source");
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return d.INSTANCE.b();
            }
            if (motionRange2 != null && motionRange == null) {
                return d.INSTANCE.c();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                    return d.INSTANCE.b();
                }
                if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                    return d.INSTANCE.c();
                }
            }
        }
        return d.INSTANCE.a();
    }
}
