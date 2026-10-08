package c;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import io.sentry.android.core.c2;
import o.e1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh/x;", "Landroid/util/Range;", "", "a", "(Lh/x;)Landroid/util/Range;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final Range<Float> a(h.x xVar) {
        Float f15;
        Float fValueOf = Float.valueOf(1.0f);
        try {
            Range range = (Range) xVar.J(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range == null) {
                e.c cVar = e.c.f45719a;
                if (e1.k("CXCP")) {
                    c2.g(e.c.TRUNCATED_TAG, "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) h.v.f(xVar.h())) + '!');
                }
                return new Range<>(fValueOf, fValueOf);
            }
            f.m mVar = f.m.f54482a;
            if (mVar.a(((Number) range.getLower()).floatValue()) || ((Number) range.getLower()).floatValue() < 0.0f) {
                e.c cVar2 = e.c.f45719a;
                if (e1.k("CXCP")) {
                    c2.g(e.c.TRUNCATED_TAG, "Invalid lower zoom range detected: " + range.getLower());
                }
                f15 = fValueOf;
            } else {
                f15 = (Float) range.getLower();
            }
            if (mVar.a(((Number) range.getUpper()).floatValue()) || ((Number) range.getUpper()).floatValue() < 0.0f) {
                e.c cVar3 = e.c.f45719a;
                if (e1.k("CXCP")) {
                    c2.g(e.c.TRUNCATED_TAG, "Invalid upper zoom range detected: " + range.getUpper());
                }
            } else {
                fValueOf = (Float) range.getUpper();
            }
            return new Range<>(f15, fValueOf);
        } catch (AssertionError e15) {
            if (b.g.f15546a.c(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                e.c cVar4 = e.c.f45719a;
                if (e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                    String str = Build.MANUFACTURER;
                    String str2 = Build.MODEL;
                }
            } else {
                e.c cVar5 = e.c.f45719a;
                if (e1.g("CXCP")) {
                    c2.f(e.c.TRUNCATED_TAG, "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e15);
                }
            }
            if (!e1.k("CXCP")) {
                return null;
            }
            c2.h(e.c.TRUNCATED_TAG, "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e15);
            return null;
        }
    }
}
