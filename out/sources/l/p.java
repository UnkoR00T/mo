package l;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import h.m0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll/w;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "a", "(Ll/w;)Ljava/util/Map;", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {
    public static final Map<CaptureRequest.Key<?>, Object> a(State3A state3A) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h.a aeMode = state3A.getAeMode();
        if (aeMode != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(aeMode.getValue()));
        }
        h.b afMode = state3A.getAfMode();
        if (afMode != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(afMode.getValue()));
        }
        h.d awbMode = state3A.getAwbMode();
        if (awbMode != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(awbMode.getValue()));
        }
        m0 flashMode = state3A.getFlashMode();
        if (flashMode != null) {
            linkedHashMap.put(CaptureRequest.FLASH_MODE, Integer.valueOf(flashMode.getValue()));
        }
        List<MeteringRectangle> listD = state3A.d();
        if (listD != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_REGIONS, listD.toArray(new MeteringRectangle[0]));
        }
        List<MeteringRectangle> listG = state3A.g();
        if (listG != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_REGIONS, listG.toArray(new MeteringRectangle[0]));
        }
        List<MeteringRectangle> listJ = state3A.j();
        if (listJ != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_REGIONS, listJ.toArray(new MeteringRectangle[0]));
        }
        Boolean aeLock = state3A.getAeLock();
        if (aeLock != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_LOCK, aeLock);
        }
        Boolean awbLock = state3A.getAwbLock();
        if (awbLock != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_LOCK, awbLock);
        }
        return linkedHashMap;
    }
}
