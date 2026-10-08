package a;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import e.b0;
import e.f2;
import java.util.List;
import java.util.Map;
import ju.w0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0019"}, d2 = {"La/c;", "La/x;", "Le/b0;", "cameraProperties", "Landroid/util/Range;", "", "range", "<init>", "(Le/b0;Landroid/util/Range;)V", "zoomRatio", "Le/f2;", "requestControl", "Lju/w0;", "Loq/i0;", "d", "(FLe/f2;)Lju/w0;", "c", "(Le/f2;)Lju/w0;", "a", "Le/b0;", "b", "Landroid/util/Range;", "()F", "minZoomRatio", "maxZoomRatio", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Range<Float> range;

    public c(b0 b0Var, Range<Float> range) {
        this.cameraProperties = b0Var;
        this.range = range;
    }

    @Override // a.x
    /* JADX INFO: renamed from: a */
    public float getMaxZoomRatio() {
        return ((Number) this.range.getUpper()).floatValue();
    }

    @Override // a.x
    /* JADX INFO: renamed from: b */
    public float getMinZoomRatio() {
        return ((Number) this.range.getLower()).floatValue();
    }

    @Override // a.x
    public w0<i0> c(f2 requestControl) {
        List listT = pq.v.t(CaptureRequest.CONTROL_ZOOM_RATIO);
        if (Build.VERSION.SDK_INT >= 34) {
            listT.add(CaptureRequest.CONTROL_SETTINGS_OVERRIDE);
        }
        return f2.b(requestControl, listT, null, 2, null);
    }

    @Override // a.x
    public w0<i0> d(float zoomRatio, f2 requestControl) {
        float fB = getMinZoomRatio();
        if (zoomRatio > getMaxZoomRatio() || fB > zoomRatio) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Map mapM = v0.m(oq.y.a(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(zoomRatio)));
        if (Build.VERSION.SDK_INT >= 34 && h.x.INSTANCE.j(this.cameraProperties.getMetadata())) {
            e.b(mapM);
        }
        return f2.h(requestControl, mapM, null, null, 6, null);
    }
}
