package e;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\u0004\"\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\"\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lh/x;", "", "preferredMode", "e", "(Lh/x;I)I", "d", "aeMode", "", "g", "(Lh/x;I)Z", "h", "(Lh/x;)Z", "f", "", "b", "(Lh/x;)Ljava/util/List;", "availableAfModes", "a", "availableAeModes", "c", "availableAwbModes", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final List<Integer> a(h.x xVar) {
        return pq.n.e((int[]) xVar.d0(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, new int[]{0}));
    }

    public static final List<Integer> b(h.x xVar) {
        return pq.n.e((int[]) xVar.d0(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[]{0}));
    }

    public static final List<Integer> c(h.x xVar) {
        return pq.n.e((int[]) xVar.d0(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES, new int[]{0}));
    }

    public static final int d(h.x xVar, int i15) {
        if (a(xVar).contains(Integer.valueOf(i15))) {
            return i15;
        }
        return a(xVar).contains(1) ? 1 : 0;
    }

    public static final int e(h.x xVar, int i15) {
        if (b(xVar).contains(Integer.valueOf(i15))) {
            return i15;
        }
        if (b(xVar).contains(4)) {
            return 4;
        }
        return b(xVar).contains(1) ? 1 : 0;
    }

    public static final int f(h.x xVar, int i15) {
        if (c(xVar).contains(Integer.valueOf(i15))) {
            return i15;
        }
        return c(xVar).contains(1) ? 1 : 0;
    }

    private static final boolean g(h.x xVar, int i15) {
        return d(xVar, i15) == i15;
    }

    public static final boolean h(h.x xVar) {
        return Build.VERSION.SDK_INT >= 28 && g(xVar, 5);
    }
}
