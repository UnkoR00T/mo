package f;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import h.p;
import h.v;
import h.x;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lf/k;", "Lf/j;", "Lh/p;", "cameraDevices", "<init>", "(Lh/p;)V", "Lh/x;", "", "d", "(Lh/x;)F", "f", "focalLength", "sensorLength", "", "b", "(FF)I", "e", "(Lh/x;)I", "c", "cameraMetadata", "a", "(Lh/x;)Ljava/lang/Float;", "Lh/p;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p cameraDevices;

    public k(p pVar) {
        this.cameraDevices = pVar;
    }

    private final int b(float focalLength, float sensorLength) {
        i6.i.b(focalLength > 0.0f, "Focal length should be positive.");
        i6.i.b(sensorLength > 0.0f, "Sensor length should be positive.");
        int degrees = (int) Math.toDegrees(((double) 2) * Math.atan(sensorLength / (2 * focalLength)));
        i6.i.c(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    private final int c(x xVar) {
        try {
            Iterator it = ((List) i6.i.h(p.d(this.cameraDevices, null, 1, null), "Failed to get available camera IDs")).iterator();
            while (it.hasNext()) {
                String value = ((v) it.next()).getValue();
                x xVar2 = (x) i6.i.h(p.h(this.cameraDevices, value, null, 2, null), "Failed to get CameraMetadata for " + ((Object) v.f(value)));
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                if (((Number) i6.i.h(xVar2.J(key), "Failed to get CameraCharacteristics.LENS_FACING for " + ((Object) v.f(value)))).intValue() == ((Number) i6.i.h(xVar.J(key), "Failed to get the required LENS_FACING for " + ((Object) v.f(xVar.h())))).intValue()) {
                    return b(d(xVar2), f(xVar2));
                }
            }
            throw new IllegalStateException("Could not find the default camera for " + ((Object) v.f(xVar.h())));
        } catch (Exception e15) {
            throw new IllegalStateException("Failed to get a valid view angle", e15);
        }
    }

    private final float d(x xVar) {
        float[] fArr = (float[]) i6.i.h(xVar.J(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS), "The focal lengths can not be empty.");
        i6.i.j(!(fArr.length == 0), "The focal lengths can not be empty.");
        return fArr[0];
    }

    private final int e(x xVar) {
        try {
            return b(d(xVar), f(xVar));
        } catch (Exception e15) {
            throw new IllegalStateException("Failed to get a valid view angle", e15);
        }
    }

    private final float f(x xVar) {
        SizeF sizeFO = (SizeF) i6.i.h(xVar.J(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE), "The sensor size can't be null.");
        Rect rect = (Rect) i6.i.h(xVar.J(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE), "The sensor orientation can't be null.");
        Size sizeN = (Size) i6.i.h(xVar.J(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE), "The active array size can't be null.");
        int iIntValue = ((Number) i6.i.h(xVar.J(CameraCharacteristics.SENSOR_ORIENTATION), "The pixel array size can't be null.")).intValue();
        Size sizeM = y.x.m(rect);
        if (y.x.i(iIntValue)) {
            sizeFO = y.x.o(sizeFO);
            sizeM = y.x.n(sizeM);
            sizeN = y.x.n(sizeN);
        }
        return (sizeFO.getWidth() * sizeM.getWidth()) / sizeN.getWidth();
    }

    @Override // f.j
    public Float a(x cameraMetadata) {
        try {
            return Float.valueOf(c(cameraMetadata) / e(cameraMetadata));
        } catch (Exception e15) {
            if (!k.k.f107055a.b()) {
                return null;
            }
            c2.f("CXCP", "Failed to get the intrinsic zoom ratio", e15);
            return null;
        }
    }
}
