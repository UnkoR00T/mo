package e;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.Comparator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Le/b0;", "cameraProperties", "Le/z0;", "displayInfoManager", "Landroid/util/Size;", "c", "(Le/b0;Le/z0;)Landroid/util/Size;", "", "b", "(Le/b0;)[Landroid/util/Size;", "a", "Landroid/util/Size;", "DEFAULT_PREVIEW_SIZE", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Size f46165a = new Size(640, 480);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            Size size = (Size) t15;
            Size size2 = (Size) t16;
            return sq.a.e(Long.valueOf(((long) size.getWidth()) * ((long) size.getHeight())), Long.valueOf(((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }

    private static final Size[] b(b0 b0Var) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) b0Var.getMetadata().J(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(34);
        }
        c cVar = c.f45719a;
        if (!o.e1.g("CXCP")) {
            return null;
        }
        io.sentry.android.core.c2.e(c.TRUNCATED_TAG, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
        return null;
    }

    public static final Size c(b0 b0Var, z0 z0Var) {
        Size[] sizeArrB = b(b0Var);
        if (sizeArrB != null && sizeArrB.length != 0) {
            Size[] sizeArrA = c.e0.a(sizeArrB);
            if (sizeArrA.length == 0) {
                c cVar = c.f45719a;
                if (o.e1.k("CXCP")) {
                    io.sentry.android.core.c2.g(c.TRUNCATED_TAG, "No supported output size list, fallback to current list");
                }
            } else {
                sizeArrB = sizeArrA;
            }
            if (sizeArrB.length > 1) {
                pq.n.S(sizeArrB, new a());
            }
            Size sizeK = z0Var.k();
            long jMin = Math.min(307200L, ((long) sizeK.getWidth()) * ((long) sizeK.getHeight()));
            int length = sizeArrB.length;
            Size size = null;
            int i15 = 0;
            while (i15 < length) {
                Size size2 = sizeArrB[i15];
                long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
                if (width == jMin) {
                    return size2;
                }
                if (width > jMin) {
                    if (size == null) {
                        break;
                    }
                    return size;
                }
                i15++;
                size = size2;
            }
            return size == null ? sizeArrB[0] : size;
        }
        return f46165a;
    }
}
