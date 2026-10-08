package a;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import e.b0;
import e.f2;
import io.sentry.android.core.c2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.w0;
import o.e1;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"La/x;", "", "", "zoomRatio", "Le/f2;", "requestControl", "Lju/w0;", "Loq/i0;", "d", "(FLe/f2;)Lju/w0;", "c", "(Le/f2;)Lju/w0;", "b", "()F", "minZoomRatio", "a", "maxZoomRatio", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"La/x$a;", "", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a.x$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La/x$a$a;", "", "<init>", "()V", "Le/b0;", "cameraProperties", "La/x;", "a", "(Le/b0;)La/x;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final x a(b0 cameraProperties) {
                Range<Float> rangeA;
                if (fr.t.c("robolectric", Build.FINGERPRINT)) {
                    List<CameraCharacteristics.Key<Rect>> listA = t.INSTANCE.a();
                    if (!(listA instanceof Collection) || !listA.isEmpty()) {
                        Iterator<T> it = listA.iterator();
                        while (it.hasNext()) {
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) it.next();
                            e.c cVar = e.c.f45719a;
                            if (e1.k("CXCP")) {
                                c2.g(e.c.TRUNCATED_TAG, "Failed to read " + key + " for zoom features.");
                            }
                            if (cameraProperties.getMetadata().J(key) == null) {
                                return new t(cameraProperties);
                            }
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 30 && (rangeA = c.e.a(cameraProperties.getMetadata())) != null) {
                    return new c(cameraProperties, rangeA);
                }
                return new j(cameraProperties);
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    float getMaxZoomRatio();

    /* JADX INFO: renamed from: b */
    float getMinZoomRatio();

    w0<i0> c(f2 requestControl);

    w0<i0> d(float zoomRatio, f2 requestControl);
}
