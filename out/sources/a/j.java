package a;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import e.b0;
import e.f2;
import io.sentry.android.core.c2;
import ju.w0;
import o.e1;
import oq.i0;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001c"}, d2 = {"La/j;", "La/x;", "Le/b0;", "cameraProperties", "<init>", "(Le/b0;)V", "Landroid/graphics/Rect;", "sensorRect", "", "zoomRatio", "e", "(Landroid/graphics/Rect;F)Landroid/graphics/Rect;", "Le/f2;", "requestControl", "Lju/w0;", "Loq/i0;", "d", "(FLe/f2;)Lju/w0;", "c", "(Le/f2;)Lju/w0;", "a", "Le/b0;", "b", "Landroid/graphics/Rect;", "currentCropRect", "()F", "minZoomRatio", "maxZoomRatio", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Rect currentCropRect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Rect sensorRect;

    public j(b0 b0Var) {
        this.cameraProperties = b0Var;
        this.sensorRect = (Rect) b0Var.getMetadata().J(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    private final Rect e(Rect sensorRect, float zoomRatio) {
        if (f.m.f54482a.a(zoomRatio)) {
            e.c cVar = e.c.f45719a;
            if (e1.k("CXCP")) {
                c2.g(e.c.TRUNCATED_TAG, "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
            }
            zoomRatio = 1.0f;
        }
        float fWidth = sensorRect.width() / zoomRatio;
        float fHeight = sensorRect.height() / zoomRatio;
        float fWidth2 = (sensorRect.width() - fWidth) / 2.0f;
        float fHeight2 = (sensorRect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    @Override // a.x
    /* JADX INFO: renamed from: a */
    public float getMaxZoomRatio() {
        Float f15 = (Float) this.cameraProperties.getMetadata().d0(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, Float.valueOf(getMinZoomRatio()));
        if (!f.m.f54482a.a(f15.floatValue())) {
            return f15.floatValue();
        }
        e.c cVar = e.c.f45719a;
        if (!e1.k("CXCP")) {
            return 1.0f;
        }
        c2.g(e.c.TRUNCATED_TAG, "Invalid max zoom ratio of " + f15 + " detected, defaulting to 1.0f");
        return 1.0f;
    }

    @Override // a.x
    /* JADX INFO: renamed from: b */
    public float getMinZoomRatio() {
        return 1.0f;
    }

    @Override // a.x
    public w0<i0> c(f2 requestControl) {
        return f2.b(requestControl, pq.v.e(CaptureRequest.SCALER_CROP_REGION), null, 2, null);
    }

    @Override // a.x
    public w0<i0> d(float zoomRatio, f2 requestControl) {
        Rect rectE = e(this.sensorRect, zoomRatio);
        this.currentCropRect = rectE;
        return f2.h(requestControl, v0.f(oq.y.a(CaptureRequest.SCALER_CROP_REGION, rectE)), null, null, 6, null);
    }
}
