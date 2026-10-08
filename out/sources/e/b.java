package e;

import android.hardware.camera2.CaptureRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/hardware/camera2/CaptureRequest$Key;", "Lv/p1$a;", "", "a", "(Landroid/hardware/camera2/CaptureRequest$Key;)Lv/p1$a;", "Lv/p1;", "", "b", "(Lv/p1;)Ljava/util/Map;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final v.p1.a<Object> a(CaptureRequest.Key<?> key) {
        return v.p1.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final Map<CaptureRequest.Key<?>, Object> b(v.p1 p1Var) {
        Object objD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (v.p1.a<?> aVar : p1Var.b()) {
            Object objD2 = aVar.d();
            CaptureRequest.Key key = objD2 instanceof CaptureRequest.Key ? (CaptureRequest.Key) objD2 : null;
            if (key != null && (objD = p1Var.d(aVar)) != null) {
                linkedHashMap.put(key, objD);
            }
        }
        return linkedHashMap;
    }
}
